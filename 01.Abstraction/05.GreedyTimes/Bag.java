package GreedyTimes;

import java.util.*;
import java.util.stream.Collectors;

public class Bag {
    private static final Comparator<Item> COMPARE_BY_NAME = Comparator.comparing(Item::getName).reversed();
    private static final Comparator<Item> COMPARE_BY_AMOUNT = Comparator.comparing(Item::getAmount);

    private long capacity;
    private List<Item> items;

    public Bag(long capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public List<Item> getItems() {
        //NOTE: we do this in order to avoid list modification via the getter
        return Collections.unmodifiableList(items);
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void add(Item itemToAdd){
        if (canAdd(itemToAdd)){
            Item item = getItem(itemToAdd);

            if (item == null){
                this.items.add(itemToAdd);
            } else {
                item.setAmount(item.getAmount() + itemToAdd.getAmount());
            }
        }
    }
    public void printBag(){
        LinkedHashMap<ItemType, List<Item>> itemsMap = this.items.stream()
                .collect(Collectors.groupingBy(Item::getItemType,
                        LinkedHashMap::new,
                        Collectors.toList()));

        itemsMap.entrySet()
                .stream()
                .sorted((e1, e2) -> Long.compare(getTotalAmount(e2.getValue()), getTotalAmount(e1.getValue())))
                .forEach(entry -> {
                    System.out.printf("<%s> $%s\n", entry.getKey(), getTotalAmount(entry.getValue()));

                    entry.getValue()
                            .stream()
                            .sorted(COMPARE_BY_NAME.thenComparing(COMPARE_BY_AMOUNT))
                            .forEach(item -> System.out.println("##" + item.getName() + " - " + item.getAmount()));

                });
    }

    private Item getItem(Item itemToAdd) {
        return this.items.stream()
                .filter(item -> item.equals(itemToAdd))
                .findFirst()
                .orElse(null);
    }

    private boolean canAdd(Item itemToAdd) {

        // if there is no capacity => we can't add
        if (this.capacity < getTotalAmount(this.items) + itemToAdd.getAmount()) {
            return false;
        }
        // if the item type is => we can't add
        if (itemToAdd.getItemType() == null) {
            return false;
        }

        switch (itemToAdd.getItemType()) {
            case Gem:
                // The gold amount in your bag should always be more than or equal to the gem amount at any time
                if (itemToAdd.getAmount() + getTotalAmountByType(ItemType.Gem) >
                        getTotalAmountByType(ItemType.Gold)) {
                    return false;
                }
                break;
            case Cash:
                // The gem amount should always be more than or equal to the cash amount at any time
                if (itemToAdd.getAmount() + getTotalAmountByType(ItemType.Cash) >
                        getTotalAmountByType(ItemType.Gem)) {
                    return false;
                }
                break;
        }

        return true;
    }

    private long getTotalAmountByType(ItemType itemType) {

        return this.items.stream()
                .filter(item -> item.getItemType().equals(itemType))
                .mapToLong(Item::getAmount)
                .sum();
    }

    private long getTotalAmount(List<Item> itemsList) {

        return itemsList.stream()
                .mapToLong(Item::getAmount)
                .sum();
    }
}

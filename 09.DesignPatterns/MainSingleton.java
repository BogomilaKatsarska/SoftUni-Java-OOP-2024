package DesignPatterns;

public class MainSingleton {
    public static void main(String[] args) {

        //First thing is to make the below thing imposible
        //DataStore dataStore = new DataStore();

        DataStoreSingleton store = DataStoreSingleton.getInstance();
        DataStoreSingleton store1 = DataStoreSingleton.getInstance();
        DataStoreSingleton store2 = DataStoreSingleton.getInstance();
        DataStoreSingleton store3 = DataStoreSingleton.getInstance();
        DataStoreSingleton store4 = DataStoreSingleton.getInstance();
        DataStoreSingleton store5 = DataStoreSingleton.getInstance();

        store.writeString("The quick");
        store1.writeString("alabala");
        store2.writeString("lazy dog");
        store3.writeString("laggggzy dog");
        store4.writeString("lazyrrr dog");
        store5.writeString("234234");

        System.out.println(store.getAllStrings());
    }
}

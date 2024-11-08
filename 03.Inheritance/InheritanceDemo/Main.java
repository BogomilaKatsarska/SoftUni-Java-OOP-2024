package InheritaneDemo;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Luvcho", 10, "green");
        Giraffe giraffe = new Giraffe("Jirafcho",4, 22);
        Elephant elephant = new Elephant("Sloncho", 7, 99);
        System.out.println();
        lion.eat();

        ZooSystem zooSystem = new ZooSystem();
        zooSystem.addAnimal(lion);
        zooSystem.addAnimal(giraffe);
        zooSystem.addAnimal(elephant);
    }

}

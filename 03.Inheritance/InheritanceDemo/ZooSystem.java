package InheritaneDemo;

import java.util.ArrayList;
import java.util.List;

public class ZooSystem {
//    private List<Lion> lions;
//    private List<Giraffe> giraffes;
//    private List<Elephant> elephants;
    private List<Animal> animals;

    public ZooSystem(){
        this.animals = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }
}

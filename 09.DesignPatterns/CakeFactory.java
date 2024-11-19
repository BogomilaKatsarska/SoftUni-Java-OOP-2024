package DesignPatterns;

public class CakeFactory {
    public static Cake createCake(String type){
        Cake cake = null;

        switch (type){
            case "carrot" -> cake = new Cake(20, 66, 8);
            case "salty" -> cake = new Cake(30, 80, 10);
            case "fruit" -> cake = new Cake(10, 33, 6);
        }

        return cake;
    }
}

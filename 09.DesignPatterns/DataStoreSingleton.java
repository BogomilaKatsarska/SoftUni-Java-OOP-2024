package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class DataStoreSingleton {
    private static final List<String> DATA = new ArrayList<>();

    private static DataStoreSingleton instance;

    private List<String> data;

    private DataStoreSingleton(List<String> data){
        //slow and risky operation
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ignored) {
        }
        this.data = data;
    }

    public static DataStoreSingleton getInstance() {
        //lazy init - create it only when needed
        if (instance == null){
            instance = new DataStoreSingleton(DATA); // lazy loading
        }
        return instance;
        //return new DataStore(DATA);
    }
    public String getAllStrings(){
        return String.join(" ", data);
    }

    public void writeString(String str){
        data.add(str);
    }
}

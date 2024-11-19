package DesignPatterns;

public class DataBase {
    //MySQL, MariaDB - only one for our application
    private String type;
    private static DataBase instance = null;

    private DataBase(){
    }

    private DataBase(String type){
        this.type = type;
    }

    public static DataBase getInstance(String type){
        // is there an existing instance?
        if (instance != null){
            return instance;
        } else {
            DataBase dataBase = new DataBase(type);
            instance = dataBase;
            return dataBase;
        }
    }
}

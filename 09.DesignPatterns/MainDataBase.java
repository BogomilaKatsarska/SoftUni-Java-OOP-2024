package DesignPatterns;

public class MainDataBase {
    public static void main(String[] args) {
        //Singleton = one class can have only one instance
        //DataBase mysql = new DataBase();
        //DataBase mariadb = new DataBase();
        DataBase mysql = DataBase.getInstance("mysql");
        DataBase mariadb = DataBase.getInstance("mariadb");
        // private Constructor
        // static method getInstance

    }

}

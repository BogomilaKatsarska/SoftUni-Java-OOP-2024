package SOLID_DependencyInversion;

public interface Database {

    void saveUser(String firstName, String lastName);
    void remove(String firstName);
}
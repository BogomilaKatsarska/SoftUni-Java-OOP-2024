package SOLID_DependencyInversion;

public class Application {
    // DB change MySQL -> PostgreSQL
    private Database database;

    public Application(Database database) {
        this.database = database;
    }

    public void saveUser(String firstName, String lastName) {
        database.saveUser(firstName, lastName);
    }
}

package SortByNameAndAge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> people;

    public Team(String name) {
        this.name = name;
        this.people = new ArrayList<>();
    }

    public List<Person> getPeople() {
        // to make it immutable
        return Collections.unmodifiableList(this.people);
        // or below:
        // return new ArrayList<>(people);
    }
}

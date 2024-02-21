package prak2;

import java.time.LocalDate;

public class Human {
    public final int age;
    public final String firstName;
    public final String lastName;
    public final LocalDate birthDate;
    public final int weight;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getWeight() {
        return weight;
    }

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "{" +
                firstName + " " +
                lastName +
                '}';
    }
}

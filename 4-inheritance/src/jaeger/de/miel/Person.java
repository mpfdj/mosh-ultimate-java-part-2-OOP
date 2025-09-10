package jaeger.de.miel;

import java.util.Objects;

public abstract class Person {
    private String name;
    private String surname;
    private int age;
    private String gender;

    public Person(String name, String surname, int age, String Gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = Gender;
    }

    public abstract String doHobby();

    @Override
    public String toString() {
        return String.format("%s %s", name, surname);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return Objects.equals(gender, person.gender);
    }

}

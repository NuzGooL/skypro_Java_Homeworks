package P1_Introdaction.HW12_Objects_and_Classes;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void printAuthor() {
        System.out.println("Автор: " + getName() + " " + getSurname());
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(getName(), author.getName()) && Objects.equals(getSurname(), author.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname());
    }
}
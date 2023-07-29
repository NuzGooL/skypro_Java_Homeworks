package P1_Introdaction.HW12_Objects_and_Classes;

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

        if (!getName().equals(author.getName())) return false;
        return getSurname().equals(author.getSurname());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        return result;
    }
}
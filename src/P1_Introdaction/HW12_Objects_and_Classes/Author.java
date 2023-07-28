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

    //////////////////////////////////////////////////////////////////////////////////
    public void printAuthor() {
        System.out.println("Автор: " + this.getName() + " " + this.getSurname());
    }
}

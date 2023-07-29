package P1_Introdaction.HW12_Objects_and_Classes;

public class Book {
    private String title;
    private Author author;
    private int publicYear;

    public Book(String title, Author author, int publicYear) {
        this.title = title;
        this.author = author;
        this.publicYear = publicYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicYear() {
        return publicYear;
    }

    public void setPublicYear(int publicYear) {
        this.publicYear = publicYear;
    }

    //////////////////////////////////////////////////
    public void printBook() {
        System.out.println("Название книги: " + this.title);
        this.author.printAuthor();
        System.out.println("Год издания: " + this.publicYear);
    }
}

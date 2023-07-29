package P1_Introdaction.HW12_Objects_and_Classes;

public class NotBookNotAuthor {
    public static void main(String[] args) {
        Book book1;
        Book book2;
        Author author1;
        Author author2;
        author1 = new Author("ИмяАвтора1", "ФамилияАвтора1");
        author2 = new Author("ИмяАвтора2", "ФамилияАвтора2");
        book1 = new Book("Название1", author1, 2022);
        book2 = new Book("Название2", author2, 2023);

        System.out.println(author1);
        System.out.println(book1);
        System.out.println();

        System.out.println("book1 = " + book1);
        System.out.println("book2 = " + book2);
        System.out.println("book1.equals(book2) = " + book1.equals(book2));

        Book book3 = new Book(book1.getTitle(),author1,2000);
        System.out.println("book3 = " + book3);
        System.out.println("book3.equals(book1) = " + book3.equals(book1));
        System.out.println();

        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());
        System.out.println("book3.hashCode() = " + book3.hashCode());
    }
}
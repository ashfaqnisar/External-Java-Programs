public class LibraryTest {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook(38,"Harry Potter");
        LibraryBook book2 = new LibraryBook(40,"Twilight","Meyer");
        LibraryBook book3 = new LibraryBook(44,"Marvel Comic","Stan Lee",5000);

        System.out.println(book1 + "\n");
        System.out.println(book2+ "\n");
        System.out.println(book3+ "\n");

        book1.setPrice(450);
        book1.setBookAuthor("JK Rollins");

        book2.setPrice(500);

        System.out.println(book1+ "\n");
        System.out.println(book2+ "\n");
        System.out.println(book3+ "\n");
    }

}

public class LibraryBook {
    private int bookId;
    private double price;
    private String bookName;
    private String bookAuthor;

    public LibraryBook() {
    }

    public LibraryBook(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }
    public LibraryBook(int bookId, String bookName, String bookAuthor) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public LibraryBook(int bookId, String bookName, String bookAuthor,double price) {
        this.bookId = bookId;
        this.price = price;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }

    public int getBookId() {
        System.out.println("The book id is "+bookId);
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
        System.out.println("The ID of the book is "+ this.bookId);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("The price of the book is "+ this.price);
    }

    public String getBookName() {
        System.out.println("The Name of the book is "+bookName);
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
        System.out.println("The Name of the book is "+this.bookName );
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
        System.out.println("The Author of the book is "+ this.bookAuthor);
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "bookId=" + bookId +
                ", price=" + price +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}

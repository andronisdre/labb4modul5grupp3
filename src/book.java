public class book {
    String bookName;

    public book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookName='" + bookName + '\'' +
                '}';
    }
}

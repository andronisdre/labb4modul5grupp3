public class book {
    private String bookName;

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


/*public class book {
    private String title;
    private String author;
    private String description;
    private String id;
    private boolean isAvailable;

    public book(String title, String author, String description, String id) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.id = id;
        isAvailable = true;
    }

    public String available() {
        return isAvailable ? "Available" : "Not available";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", id='" + id + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}*/

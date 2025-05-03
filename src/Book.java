public class Book {
    private String BookID;
    private String author;
    private boolean availability;
    private String title;

    //constructor
    public Book(String BookID, String author, boolean availability, String title) {
        this.author = author;
        this.BookID = BookID;
        this.availability = availability;
        this.title = title;
    }

    //getters
    private String getBookID(){
        return this.BookID;
    }

    private String getAuthor(){
        return this.author;
    }
}

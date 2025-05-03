public class Book {
    private String BookID;
    private String author;
    private String availability;
    private String title;

    //constructor
    public Book(String BookID, String author, String availability, String title) {
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

    private String getAvailability() {
        return this.availability;
    }

    @Override
    public String toString(){
        return ("BookID: " + this.BookID + " Author:" + this.author + " Title:" + this.title + " Availability" + this.availability);
    }
}

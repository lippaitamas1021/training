package filescanner.library;

public class Book {

    private int registrationNumber;
    private String author;
    private String title;
    private int year;

    public Book(int registrationNumber, String author, String title, int year) {
        this.registrationNumber = registrationNumber;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "registrationNumber=" + registrationNumber +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}

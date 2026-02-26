package Book;
public class Book {
    String title;
    String author;
    int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void displayInfo() {
        System.out.println("Գիրք: " + title + " | Հեղինակ: " + author + " | Տարեթիվ: " + yearPublished);
    }
}
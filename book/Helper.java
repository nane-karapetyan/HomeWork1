package book;

public class Helper {

    public static boolean checkPages(Book book) {

        return book.getPages() > 400;

    }

    public static int readingTime(Book book) {

        return book.getPages() * 3;

    }

    public static void printBook(Book book) {

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor().getName());
        System.out.println("Publish year: " + book.getPublishYear());
        System.out.println("Pages: " + book.getPages());
        System.out.println("Price: " + book.getPrice());
        System.out.println("Genre: " + book.getGenre());
        System.out.println("-------------");

    }

    public static Book[] getBooksByAuthor(Book[] books, Author author) {

        int count = 0;

        for (int i = 0; i < books.length; i++) {

            if (books[i].getAuthor() == author) {
                count++;
            }

        }

        Book[] result = new Book[count];

        int index = 0;

        for (int i = 0; i < books.length; i++) {

            if (books[i].getAuthor() == author) {
                result[index] = books[i];
                index++;
            }

        }

        return result;
    }
}
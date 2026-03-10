package book;

public class Main {

    public static void main(String[] args) {

        Author a1 = new Author("Rowling", 1965);
        Author a2 = new Author("Orwell", 1903);

        Book b1 = new Book("Harry Potter 1", a1, 1997);
        b1.setPages(500);

        Book b2 = new Book("Harry Potter 2", a1, 1998);
        b2.setPages(450);

        Book b3 = new Book("Harry Potter 3", a1, 1999);
        b3.setPages(420);

        Book b4 = new Book("1984", a2, 1949);
        b4.setPages(350);

        Book b5 = new Book("Animal Farm", a2, 1945);
        b5.setPages(200);

        Book b6 = new Book("Homage to Catalonia", a2, 1938);
        b6.setPages(300);

        Book[] books = {b1, b2, b3, b4, b5, b6};

        System.out.println("All books:");

        for (int i = 0; i < books.length; i++) {

            Helper.printBook(books[i]);

        }

        System.out.println("Books with more than 400 pages:");

        for (int i = 0; i < books.length; i++) {

            if (Helper.checkPages(books[i])) {

                System.out.println(books[i].getTitle());

            }

        }

        System.out.println("Reading time of first book:");
        System.out.println(Helper.readingTime(b1) + " minutes");

        System.out.println("Books by Rowling:");

        Book[] result = Helper.getBooksByAuthor(books, a1);

        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i].getTitle());

        }
    }
}

package Task2_2005;

public class Main {
    public static void main(String[] args) {
        testBookArray();
    }
    private static void testBookArray() {
        Book[] library = {
                new Book("978-1", "Anush"),
                new Book("978-2", "Verq Hayastani"),
                new Book("978-3", "Hin Astvatsner")
        };
        Book targetBook = new Book("978-2", "Verq Hayastani");

        Book unknownBook = new Book("978-9", "Samvel");

        System.out.println("Contains 'Verq Hayastani': " + ArraySearcher.contains(library, targetBook));

        System.out.println("Contains 'Samvel': " + ArraySearcher.contains(library, unknownBook));

    }
}
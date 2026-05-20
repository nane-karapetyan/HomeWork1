package Task2_2005;

public class ArraySearcher {

    public static <T> boolean contains(T[] array, T element) {
        if (array == null || element == null) {
            return false;
        }
        for (T item : array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }
}

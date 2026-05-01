package shipping;

public class Crate<T> {
    private T contents;
    private boolean isPacked = false;

    public void pack(T item) {
        if (!isPacked) {
            this.contents = item;
            this.isPacked = true;
            System.out.println("Item packed: " + item.toString());
        } else {
            System.out.println("Crate is already full!");
        }
    }

    public T unpack() {
        if (isPacked) {
            T item = contents;
            contents = null;
            isPacked = false;
            System.out.println("Item unpacked: " + item.toString());
            return item;
        } else {
            System.out.println("Crate is empty!");
            return null;
        }
    }

    public boolean isEmpty() {
        return !isPacked;
    }
}

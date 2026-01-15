public class Task3 {
    public static void main(String[] args) {
        int[] arr = {-3, 1, 4, -2, 6, 9, 5, 12};

        boolean first = true;
        int prev = 0;
        boolean violated = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                continue;
            }

            if (first) {
                prev = arr[i];
                first = false;
                continue;
            }

            if (arr[i] <= prev) {
                System.out.println("Violation index = " + i);
                violated = true;
                break;
            }

            prev = arr[i];
        }

        if (!violated) {
            System.out.println("OK");
        }
    }
}

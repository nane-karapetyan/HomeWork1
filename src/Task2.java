public class Task2 {
    public static void main(String[] args) {

        int[] arr = {4, 2, 5, 2, 7, 8, 7, 9 };
        boolean found = false;

        // սկսում ենք 1-ից և ավարտում length - 2,
        // որպեսզի i-1 և i+1 ինդեքսները լինեն վավեր
        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i - 1] == arr[i + 1]) {
                System.out.println("Mirror index = " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No mirror index");
        }
    }
}

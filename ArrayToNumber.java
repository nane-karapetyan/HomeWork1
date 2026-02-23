public class ArrayToNumber {
    public static void main(String[] args) {
        int[] arr = {1, 0, 7, 9, 8, 6, 4, 2};

        int number = 0;

        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }

        System.out.println(number);
    }
}

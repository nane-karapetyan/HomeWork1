public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 1, 3, 3, 10, 20, 30, 7};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {


            if (arr[i] == i) {
                continue;
            }

            sum += arr[i];

            if (sum > 100) {
                break;
            }
        }
         System.out.println("Վերջնական գումարը = " + sum);
    }
}

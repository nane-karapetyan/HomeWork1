public class Arr {
    public static void main(String[] args) {

        int[] arr = {5, 3, 5, 0, 1000, 3, 5};
        int[] count = new int[1001];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i + " : " + count[i]);
            }
        }
    }
}

public class BinarySearchRecursive {

    public static void main(String[] args) {
        try {
            double[] arr = {10.5, 8.2, 7.0, 5.5, 3.1, 1.2, 0.5};
            double target = 5.5;

            int result = recursiveBinarySearch(arr, target, 0, arr.length - 1);

            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found in the array.");
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    public static int recursiveBinarySearch(double[] arr, double target, int left, int right) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] < 0) {
            throw new IllegalArgumentException("Negative number detected at index " + mid + ": " + arr[mid]);
        }
        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            return recursiveBinarySearch(arr, target, left, mid - 1);
        }

        return recursiveBinarySearch(arr, target, mid + 1, right);
    }
}
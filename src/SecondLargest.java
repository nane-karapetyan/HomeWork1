public class SecondLargest {
    public static void main(String[] args) {
    int[] arr = {5, 3, 9, 1, 9, 7};

    int max = arr[0];
    int second = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < max) {
            second = arr[i];
            break;
        }
    }

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < max && arr[i] > second) {
            second = arr[i];
        }
    }

    System.out.println(second);
}
}

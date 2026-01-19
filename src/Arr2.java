public class Arr2 {
    public static void main(String[] args) {
        int[] arr = {5, -3, 7, -1, 0, -9, 4};

        int index = -1;
        int value = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 0) {
                index = i;
                value = arr[i];
                break;
            }
        }

        if (index == -1) {
            System.out.println("Բացասական թիվ չի գտնվել");
        } else {
            System.out.println("Թիվը = " + value);
            System.out.println("Ինդեքսը = " + index);
        }
    }
}

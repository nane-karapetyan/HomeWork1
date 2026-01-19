public class Arr1 {
    public static void main(String[] args) {
        int[] array1 = {5, -3, 7, -1, 0, -9, 4};

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                count++;
            }
        }

        int[] array2 = new int[count];

        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                array2[j] = array1[i];
                j++;
            }
        }
                for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

    }
}

public class Arr1 {
    public static void main(String[] args) {
        int[] array1 = {5, -3, 7, -1, 0, -9, 4};

        // 1․ հաշվում ենք՝ քանի բացասական թիվ կա
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                count++;
            }
        }

        // 2․ ստեղծում ենք array2
        int[] array2 = new int[count];

        // 3․ լցնում ենք array2-ը
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                array2[j] = array1[i];
                j++;
            }
        }

        // 4․ տպում ենք array2-ը
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

    }
}

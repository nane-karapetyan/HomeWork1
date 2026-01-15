public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 1, 3, 3, 10, 20, 30, 7};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            // բաց թողնել, եթե տարրի արժեքը հավասար է իր ինդեքսին
            if (arr[i] == i) {
                continue;
            }

            sum += arr[i];

            // եթե գումարը մեծ է 100, դադարեցնել ցիկլը
            if (sum > 100) {
                break;
            }
        }
         System.out.println("Վերջնական գումարը = " + sum);
    }
}

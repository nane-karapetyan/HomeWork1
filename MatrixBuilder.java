import java.util.Scanner;
public class MatrixBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Քանի՞ թիվ: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MatrixHelper helper = new MatrixHelper();
        helper.printMatrix(arr);

        sc.close();
    }
}
class MatrixHelper {
    public void printMatrix(int[] input) {
        int n = input.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print((input[j] + i) + " ");
            }
            System.out.println();
        }
    }
}
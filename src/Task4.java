import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month;


        while (true) {
            System.out.print("Մուտքագրեք ամսվա համարը (1-12): ");

            if (!sc.hasNextInt()) {
                System.out.println("Սխալ մուտք, պետք է մուտքագրել թիվ");
                sc.next();
                continue;
            }

            month = sc.nextInt();

            if (month >= 1 && month <= 12) {
                break;
            }
            System.out.println("Սխալ ամսվա համար, փորձեք կրկին");
        }
        switch (month) {
            case 2 -> System.out.println(28);
            case 4, 6, 9, 11 -> System.out.println(30);
            default -> System.out.println(31);
        }
    }
}

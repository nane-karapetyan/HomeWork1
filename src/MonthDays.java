public class MonthDays {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Մուտքագրեք ամսվա համարը");
            System.exit(1);
        }
        int month = Integer.parseInt(args[0]);

        if (month < 1 || month > 12) {
            System.out.println("Սխալ ամսվա համար");
            System.exit(1);
        }

        switch (month) {
            case 2:
                System.out.println(28);
                break;
            case 4: case 6: case 9: case 11:
                System.out.println(30);
                break;
            default:
                System.out.println(31);
        }
    }
}

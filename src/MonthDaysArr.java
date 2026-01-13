public class MonthDaysArr {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Մուտքագրեք ամսվա համարը"); System.exit(1);
        }
        int month = Integer.parseInt(args[0]);
        if (month < 1 || month > 12) {
            System.out.println("Սխալ ամսվա համար"); System.exit(1);
        }
        int[] d = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println(d[month-1]);
    }
}

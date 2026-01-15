public class TicketPrice {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Մուտքագրեք տարիքը և նստատեղի կարգը");
            return;
        }

        int age = Integer.parseInt(args[0]);
        int seat = Integer.parseInt(args[1]);

        int price;
        switch (seat) {
            case 1: price = 12000; break;
            case 2: price = 8000; break;
            case 3: price = 7000; break;
            default: System.out.println("Սխալ նստատեղի կարգ"); return;
        }
        double finalPrice = age >= 65 ? price * 0.8 : price;

        System.out.println("Տարիք: " + age);
        System.out.println("Սկզբնական գին: " + price);
        System.out.println("Վերջնական գին: " + finalPrice);
    }
}

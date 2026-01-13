public class TransportDiscount {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Մուտքագրեք տարիքը և երեխաների քանակը");
            return;
        }

        int age = Integer.parseInt(args[0]);
        int kids = Integer.parseInt(args[1]);
        int price = 1000;
        int discount = 0;

        if (age < 18 || age > 65) {
            discount = 20;
        } else {
            if (kids == 3) discount = 15;
            else if (kids == 4) discount = 25;
            else if (kids == 5) discount = 35;
            else if (kids > 5) discount = 50;
        }
        int discountedPrice = price - price * discount / 100;

        System.out.println("Տարիք: " + age);
        System.out.println("Երեխաների քանակ: " + kids);
        System.out.println("Սկզբնական գին: " + price);
        System.out.println("Զեղչ: " + discount + "%");
        System.out.println("Վերջնական գին: " + discountedPrice);
    }
}

package task1_2005;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {5, 12, 3, 8, 21, 14};
        System.out.println("Max Number: " + MaxFinder.findMax(numbers));

        House[] district = {
                new House(120.5),
                new House(250.0),
                new House(85.3),
                new House(310.2)
        };
        System.out.println("Max House: " + MaxFinder.findMax(district));
    }
}


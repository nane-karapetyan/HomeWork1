public class Main {
    public static void main(String[] args) {
        //1-ին խնդիր
        int age = 5;

        if(age>=18 && age<= 65){
            System.out.println("Allowed");
        }
        else{
            System.out.println("Not Allowed");
        }

        //2-րդ խնդիր
        boolean hasTicket = false;
        boolean hasInvitation = true;

        if (hasTicket || hasInvitation) {
            System.out.println("Մուտքը թույլատրված է։");
        } else {
            System.out.println("Մուտքը արգելված է։");
        }
        //3- րդ խնդիր
        int a = 5;
        int b = -9;
        int c = -10;

        if ((a > 0 && b > 0) || (a > 0 && c > 0) || (b > 0 && c > 0)) {

            System.out.println("Գոնե երկու թիվ դրական են։");
        } else {
         System.out.println("Երկուսից ավելի դրական թվեր չկան։");
        }

        //4-րդ խնդիր
        int x = 5;   // 0101
        int z = 3;   // 0011

        int result = a | b;  // 0111

        System.out.println("x = " + x);
        System.out.println("z = " + z);
        System.out.println("x | z = " + result);
        //5-րդ խնդիր
        int f = 10;
        int u = 10;

        if (f > u) {
            System.out.println(f);
        } else if (u > f) {
            System.out.println(u);
        } else {
            System.out.println("Equal");
        }
        //6-րդ խնդիր
        int grade = 85;

        if (grade >= 90 && grade <= 100) {
            System.out.println("Excellent");
        }
        else if (grade >= 70 && grade <= 89) {
            System.out.println("Good");
        }
        else if (grade >= 50 && grade <= 69) {
            System.out.println("Average");
        }
        else if (grade >= 0 && grade <= 49) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Invalid grade");
        }
        //7-րդ խնդիր
        int q = 1;
        int e = 0;

        if ((q ^ e) == 1) {
            System.out.println("Different");
        } else {
            System.out.println("Same");
        }
        //8-րդ խնդիր
        int number = 12;

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
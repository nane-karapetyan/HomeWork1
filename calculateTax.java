import java.util.Scanner;

public class calculateTax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Մուտքագրեք աշխատավարձը: ");
        int salary = sc.nextInt();

        double tax = calculateIncomeTax(salary);

        System.out.println("Աշխատավարձ: " + salary +
                " դրամ | Եկամտահարկ: " + tax + " դրամ");
    }

    public static double calculateIncomeTax(int salary) {

        double tax = 0;

        if (salary > 500000) {
            tax += 150000 * 0.15;
            tax += 350000 * 0.20;
            tax += ((salary - 500000) / 1000) * 300;
        }
        else if (salary > 150000) {
            tax += 150000 * 0.15;
            tax += (salary - 150000) * 0.20;
        }
        else {
            tax += salary * 0.15;
        }

        return tax;
    }
}

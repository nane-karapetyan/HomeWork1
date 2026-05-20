package Task3_2005;

import java.util.Arrays;

public class IdExtractorTest {
    public static void main(String[] args) {
        testEmployeeIds();
        System.out.println("-----------------------------------------");

        testPassportIds();
    }

    private static void testEmployeeIds() {
        Employee[] staff = {
                new Employee(1001L, "Armen"),
                new Employee(1002L, "Anahit"),
                new Employee(1003L, "Karen")
        };

        Long[] ids = IdExtractor.extractIds(staff, Long.class);

        System.out.println("Employee ID Extraction Test ");
        System.out.println("Extracted Employee IDs: " + Arrays.toString(ids));
    }

    private static void testPassportIds() {
        Passport[] passports = {
                new Passport("AM0123456", "Babken"),
                new Passport("AM0789101", "Gayane")
        };

        String[] passportNumbers = IdExtractor.extractIds(passports, String.class);

        System.out.println("Passport ID Extraction Test");
        System.out.println("Extracted Passport Numbers: " + Arrays.toString(passportNumbers));
    }
}

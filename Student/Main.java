package Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Անի", 19, 3);
        Student s2 = new Student("Լևոն", 18);

        s1.promote();
        s2.promote();
    }
}
package Student;

public class Student {
    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 1; 
    }
    public void promote() {
        this.grade++;
        System.out.println(name + "-ը փոխադրվեց " + grade + "-րդ դասարան:");
    }
}

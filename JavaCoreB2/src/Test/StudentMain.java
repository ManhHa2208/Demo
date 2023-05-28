package Test;

public class StudentMain {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            Student student = new Student();
            students[i] = student;
        }
        for (Student a: students) {
//            a.printStudent();
            System.out.println(a.toString());
        }

    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Srishti";
        s1.rollno = 211214;
        s1.passw = "Sw";

        Student s2 = new Student(s1);
        s2.passw = "xyz";

        System.out.println("Student 2 name: " + s2.name);
        System.out.println("Student 2 rollno: " + s2.rollno);
        System.out.println("Student 2 passw: " + s2.passw);
    }
}

class Student {
    String name;
    int rollno;
    String passw;

    Student() {
        System.out.println("Constructor being called!");
    }

    Student(Student s1) {
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.passw = s1.passw;
    }
}

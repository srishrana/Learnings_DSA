public class constructor_concept {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Srishti");
        Student s3 = new Student(211214);

    }
}

class Student {
    public String name;
    public int rollno;
    private String id;

    Student() {
        // constructor being called
        System.out.println("hello");
    }

    Student(String name) {
        // constructor being called
        this.name = name;
        System.out.println(this.name);
    }

    Student(int rollno) {
        // constructor being called
        this.rollno = rollno;
        System.out.println(this.rollno);
    }
    // void setid(String id){
    // this.id=id;
    // }

}

// see by this concept we understand what actually is construtor overloading
// where we are able to see the concept of polymorphism

//

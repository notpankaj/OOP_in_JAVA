
class Student {
    String name;
    int age;

    Student() {
    }

    // constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class N_01_Basic {
    public static void main(String[] args) {

        // normal calls
        Student s1 = new Student("anjali", 23);
        Student s2 = new Student("pankaj", 22);
        s1.printInfo();
        s2.printInfo();

        // copy call -> passing a obj to constructor for copy it
        Student sRaw = new Student();
        sRaw.name = "Neha";
        sRaw.age = 22;

        Student sClone = new Student(sRaw);
        sClone.printInfo();

    }
}
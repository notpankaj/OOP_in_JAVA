class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 1.
    public void printInfo(String name) {
        System.out.println(name);
    }

    // 2.
    public void printInfo(int age) {
        System.out.println(age);
    }

    // 3.
    public void printInfo(String name, int age) {
        System.out.println(name + " is " + age + " years old! ");

    }
}

public class N_02_Polymorphism {
    public static void main(String[] args) {

        Student s1 = new Student("Neha", 21);
        s1.printInfo(s1.name); // calls 1.
        s1.printInfo(s1.age); // calls 2.
        s1.printInfo(s1.name, s1.age); // calls 3.
    }
}

// ====================
// ======= NOTE =======
// ====================
// * 1. Polymorphism : mutiple functions with same name , but diffrent purpose
// * 2. There should be a diffrence of somekind like :
// ? a). return types ,or
// ? b). types of argument ,or
// ? c). no of arguments

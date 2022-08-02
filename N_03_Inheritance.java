// ! 1. example
// class Shape {
// String color;
// }

// class Triangle extends Shape {

// }

// public class N_03_Inheritance {
// public static void main(String[] args) {

// Triangle t1 = new Triangle();
// t1.color = "red"; // inherits from Shape Class
// System.out.println(t1.color);
// }
// }

// ====================
// ======= NOTE =======
// ====================
// * 1. Inheritance : when a class want to access or want to take properties
// class is called -> inheritance

class Shape {
    String color;

    public void area() {
        System.out.println("Display area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.13 * r * r);
    }
}

public class N_03_Inheritance {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.color = "red"; // inherits from Shape Class
        System.out.println(t1.color);
    }
}

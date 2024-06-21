/* MULTULEVEL INHERITENCE */
/* more than one subclass inherits a single superclass */

class A { // super class
    double a, b;

    A(double x, double y) {
        a = x;
        b = y;
    }

    double add() {
        return (a + b);
    }

    double subtract() {
        return (a - b);
    }
}

class B extends A { // subclass 1(inherited from A)
    B(double x, double y) {
        super(x, y);
    }

    double multiply() {
        return (a * b);
    }
}

class C extends B { // subclass 2(inherited from B)
    C(double x, double y) {
        super(x, y);
    }

    double divide() {
        return (a / b);
    }
}

class D extends C { // subclass 3(inherited from C)
    D(double x, double y) {
        super(x, y);
    }

    double modulo() {
        return (a % b);
    }
}

public class multilevel {
    public static void main(String[] args) {
        D d = new D(50, 5);
        System.out.println(d.add());
        System.out.println(d.subtract());
        System.out.println(d.multiply());
        System.out.println(d.divide());
        System.out.println(d.modulo());
    }
}

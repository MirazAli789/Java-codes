class A {
    String name;

    A(String x) {
        name = x;
    }
}

class B extends A {
    int roll;

    B(String x, int y) {
        super(x);
        roll = y;
    }

    void show() {
        System.out.println("Name = " + name);
        System.out.println("roll = " + roll);
    }
}

class C extends A {
    int section;

    C(String x, int y) {
        super(x);
        section = y;
    }

    void display() {
        System.out.println("name = " + name);
        System.out.println("section = " + section);
    }
}

class D extends A {
    int age;

    D(String x, int y) {
        super(x);
        age = y;
    }

    void disp() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}  
public class heirerchial {
    public static void main(String[] args) {
        // B b = new B(args[0], 23);
        // b.show();
        // C c = new C(args[1], 1); 
        // c.display();
        D d = new D("Miraz", 20);
        d.disp();
    }
}

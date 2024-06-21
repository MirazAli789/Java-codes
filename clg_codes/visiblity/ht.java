class A {
    public int s;
    protected int b;

    A(int x, int y) {
        s = x;
        b = y;
    }
}

class B extends A {
    int c;

    B(int x, int y, int z) {
        super(x, y);
        c = z;
    }

    A a = new A(12, 23);

    void give() {
        System.out.println(s);
        System.out.println(b);
    }
}

public class ht {
    public static void main(String[] args) {
        // A a = new A(12, 23);
        // a.give();
        B b = new B(31, 17, 58);
        b.give();
    }
}

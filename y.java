class A {
    void show() {
        System.out.println(this);
    }
}

class B {
    int b;

    B(int b) {
        this.b = b;
    }

    void show() {
        System.out.println(b);
    }
}
class C{
    int l,w;
    C(){
        this.l = 12;
        this.w = 123;
    }
    C(int a){
        this(); //calls the default constructor
    }
}
class D{
    int length,width;
    D(){
        this(10);
    }
    D(int a){
        length = width = 12;
        System.out.println(a);
    }
}
public class y {
    public static void main(String[] args) {
        // A a = new A();
        // System.out.println(a);
        // a.show();
        // B b = new B(1221);
        // b.show();
        // C c = new C();
        // System.out.println(c.l); ;
        // System.out.println(c.w);
        D d = new D();
        System.out.println(d.length);
        System.out.println(d.width);
    }
}

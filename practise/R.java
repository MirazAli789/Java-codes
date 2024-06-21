import clg_codes.Abstract_methods.shape;

class shape {
    int dimension;
    String name;

    shape(int x, String y) {
        dimension = x;
        name = y;
    }

    void show() {
        System.out.println("dimension = " + dimension);
    }

    void show(boolean b) {
        System.out.println("inside overloaded method");
        System.out.println("dimension = " + dimension);
        System.out.println("name = "+name);
    }
}

public class R {
    public static void main(String[] args) {
        I s = new I(123, "circle");
        s.show();
        I s1 = new I(31, "square");
        s1.show(false);
    }
}

package clg_codes.Abstract_methods;
// abstract classes acts as a blueprint for other classes to inherit from it.
// The abstract class cannot be used to create objects directly
//
abstract class shape {
    int length;
    int radius;

    shape(int x, int y) {
        length = x;
        radius = y;
    }

    abstract void show(int x); // abstract method //only declaration

    abstract int volume(); // another abstract method

    void take(int x, int y) { // non abstract method
        radius = x;
        length = x * y;
    }
}

class cube extends shape {
    int height;

    cube(int x, int y, int z) {
        super(x, y);
        height = z;
    }

    void show(int x) // defining in the subclass
    {
        System.out.println("Length = " + length);
        System.out.println("radius = " + radius);
        System.out.println("height = " + height);
    }

    int volume() {
        return (length * radius * height);
    }
}

public class ab {
    public static void main(String[] args) {
        cube c = new cube(12, 13, 14);
        c.show(3);
        System.out.println(c.volume());
    }
}

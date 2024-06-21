import clg_codes.Abstract_methods.cube;

class rectangle {
    int length;
    int width;

    rectangle(int x, int y) {
        length = x;
        width = y;
    }

    int area() { // the method we want to override
        return (length * width);
    }
}

class cube extends rectangle {
    int height;

    cube(int x, int y, int z) {
        super(x, y);
        height = z;
    }

    // overriding the area method
    int area() {
        return (length * width * height);
    }
}

public class T {
    public static void main(String[] args) {
        rectangle r = new rectangle(12, 31);
        System.out.println("area of rec = " + r.area());
        cube c = new cube(12, 13, 14);
        System.out.println("area of cube = "+c.area());
    }
}

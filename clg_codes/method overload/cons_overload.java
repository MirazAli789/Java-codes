class room {
    int length, width;

    room(int x) {
        length = width = x;
    }

    room(int x, int y) { // constructor overloading
        length = x;
        width = y;
    }

    int area() {
        return (length * width);
    }

    int area(int x) {
        System.out.println("Inside overloaded method");
        return (length * width);
    }
}

public class cons_overload {
    public static void main(String[] args) {
        room r1 = new room(34);
        room r2 = new room(3, 5);
        System.out.println(r1.area());
        System.out.println(r2.area(2));
    }
}

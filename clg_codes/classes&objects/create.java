//creating a class in java
class rectangle {
    int length;
    int width;

    
    void getdata(int x, int y) {
        length = x;
        width = y;
    }

    int area() {
        return length * width;
    }
}

public class create {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        // r is an object of the rectangle class
        r.getdata(12, 13);
        System.out.println("Object 1");
        System.out.println(r.length);
        System.out.println(r.width);
        System.out.println(r.area());

        System.out.println("Object 2");
        rectangle r1 = new rectangle();
        r1.getdata(5, 4);
        System.out.println(r1.length);
        System.out.println(r1.width);
        System.out.println(r1.area());
    }
}

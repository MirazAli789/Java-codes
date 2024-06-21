interface shape {
    public abstract int area();
}
interface animal{
    public abstract void sound();
}
interface human extends shape {

}
class square implements shape {
    int side;

    public int area() {
        return (side * side);
    }
}

class circle implements shape {
    int radius;

    public int area() {
        return 3 * radius * radius;
    }
}

public class U {
    public static void main(String[] args) {
        square s = new square();
        s.side = 12;
        System.out.println(s.area());
        circle c = new circle();
        c.radius = 23;
        System.out.println(c.area());
    }
}

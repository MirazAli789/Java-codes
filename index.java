

abstract class shape{
    abstract int area();
}
class square extends shape{
    int side;
    int area(){
        return (side*side);
    }
}
class rectangle extends shape{
    int length, width;
    int area(){
        return (length*width);
    }
}
public class index {
    public static void main(String[] args) {
        square s = new square();
        s.side = 12;
        System.out.println(s.area());
        rectangle r = new rectangle();
        r.length = 2;
        r.width = 4;
        System.out.println(r.area());
    }
}

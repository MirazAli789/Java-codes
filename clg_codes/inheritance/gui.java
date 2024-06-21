

class football {
    public double radius;

    protected football(double x) {
        radius = x;
    }

    public double volume() {
        return (4 / 3) * (3.14 * radius * radius * radius);
    }

}

public class gui {
    public static void main(String[] args) {
        
        football f = new football(4);
        System.out.println(f.volume());
    }
}

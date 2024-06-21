//Simple inheritance
// a single sub class/derived class/child class is created from a super class

class room { //superclass
    int length, width;

    room(int x, int y)
     {
        length = x;
        width = y;
    }

    int area() {
        return (length * width);
    }
}

class Bedroom extends room { //subclass
    int height;

    Bedroom(int x, int y, int z) {
        super(x, y);
        height = z;
    }

    int volume() {
        return (length * width * height);
    }
}

public class simple {
    public static void main(String[] args) {
        Bedroom b = new Bedroom(2, 3, 6);
        System.out.println(b.area());
        System.out.println(b.volume());
    }
}

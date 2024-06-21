// when a new class is created from an existing class in such a wa that the new class contains all the features and properties of the existing class, is called inhritance
//single inheritance
class animal {
    int power;
    String name;

    animal(int x, String y) {
        power = x;
        name = y;
    }

    void show() {
        System.out.println(power);
        System.out.println(name);
    }
}

class human extends animal 
{
    boolean humanity;

    human(int x, String y, boolean z) {
        super(x, y);
        humanity = z;
    }

    void data() {
        System.out.println(power);
        System.out.println(name);
        System.out.println(humanity);
    }
}

public class inherit {
    public static void main(String[] args) {
        human h = new human(12, "miraz", true);
        h.data();
    }
}

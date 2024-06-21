class kolkata {
    int heritage;
    boolean ecopark;

    // contructor
    kolkata(int x, boolean y) {
        heritage = x;
        ecopark = y;
    }

    void city_of_joy() {
        System.out.println("Kolkata is the city of joy");
    }
}

class rectangle {
    int length, width;

    rectangle() {
        length = 12;
        width = 41;
    }

    rectangle(rectangle ref) { // copy constructor
        length = ref.length;
        width = ref.width;
    }

    int area() {
        return (length * width);
    }
}

public class access {
    public static void main(String[] args) {
        // kolkata k = new kolkata(12, true);
        // System.out.println(k.heritage);
        // System.out.println(k.ecopark);
        // System.out.println(k.ecopark);
        // kolkata k2 = new kolkata(412, true);
        // System.out.println(k2.ecopark);
        // System.out.println(k2.heritage);
        // k2.city_of_joy();
        // k.city_of_joy();
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle(r1);
        System.out.println(r1.length);
        System.out.println(r1.width);
        System.out.println(r2.length);
        System.out.println(r2.width);
        System.out.println(r1.area());
        System.out.println(r2.area());
    }
}

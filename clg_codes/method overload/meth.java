class computer {
    int monitor;
    int cpu;
    int gpu;

    computer(int x, int y, int z) {
        monitor = x;
        cpu = y;
        gpu = z;
    }

    computer(int x, int y) {
        monitor = x;
        cpu = y;
        gpu = y;

    }

    computer(int x) {
        monitor = x;
        cpu = x;
        gpu = x;
    }

    void performance() {
        System.out.println(monitor + " has " + cpu);
    }
}

public class meth {
    public static void main(String[] args) {
        computer c = new computer(12, 23, 34);
        computer c1 = new computer(221, 5);
        computer c2 = new computer(45);
        c.performance();
        c1.performance();
        c2.performance();
    }
}

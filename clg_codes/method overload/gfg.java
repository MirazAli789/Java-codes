class soccer {
    int ball;
    int goal;

    soccer(int a, int b) {
        ball = a;
        goal = b;
    }

    boolean is_goal() {
        return true;
    }
}

class football extends soccer {
    int red;

    football(int a, int b, int c) {
        super(a, b);
        red = c;
    }

    void show() {
        System.out.println(ball);
        System.out.println(goal);
        System.out.println(red);
    }
}

public class gfg {
    public static void main(String[] args) {
        football f = new football(23, 41, 15);
        System.out.println(f.is_goal());
        f.show();
    }
}

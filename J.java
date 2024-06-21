import java.util.*;

interface client {
    void input(); // public + abstarct methods by default

    void output(); // public + abstract methods by default
}

class dev implements client {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;

    // overriding the methods
    public void input() {
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("enter age");
        age = sc.nextInt();
    }

    public void output() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }
}

public class J {
    public static void main(String[] args) {
        client c = new dev();
        c.input();
        c.output();
    }
}

class animal {
    int weight;
    String name;

    animal(int x, String y) {
        weight = x;
        name = y;
    }
}

public class test {
    public static void main(String[] args) {
        animal a = new animal(78, "panda");
        System.out.println(a.name);
        System.out.println(a.weight);
    }
}

class Super{
    void method(){
        System.out.println("Method super");
    }
}
class Sub extends Super{
    void method(){
        System.out.println("Inside subclass");
        System.out.println("Method sub");
    }
}
public class T {
    public static void main(String[] args) {
        // Sub s = new Super();
        Super s = new Sub();
        s.method();
    }
}

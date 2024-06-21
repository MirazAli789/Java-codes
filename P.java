class A {
    public static int a = 12;

    A() {

    }
}

public class P {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));
        A a = new A();
        A b = new A();
        int num1 = 12;
        int num2 = 0;
        int num3 = (num1/num2);
        System.out.println(num3);
        System.out.println(a.equals(b));
    }
}

//converting from primitive datatypes to string datatypes
public class M {
    public static void main(String[] args) {
        int a = 12;
        String str = Integer.toString(a);
        System.out.println(str.equals("12"));
        long l = 76766766l;
        String str1 = Long.toString(l);
        System.out.println(str1);
    }
}

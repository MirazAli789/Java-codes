
public class C{
    public static void main(String[] args) {
        String s = new String("miraz");
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        String s1 = new String("hello ");

        String s2 = new String("world");
        String s3 = s1+s2;
        System.out.println(s3);
        String s4 = s1.concat(s2);
        System.out.println(s4);
        boolean b = s1.equals(s2);
        System.out.println(b); 
    }
}

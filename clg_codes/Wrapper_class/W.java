package clg_codes.Wrapper_class;
public class W {
    public static void main(String[] args) {
        int a = 12;
        Integer intval = Integer.valueOf(a); // Correct usage of valueOf() method
        System.out.println(intval);
        Boolean b = Boolean.valueOf(true);
        System.out.println(b);
        boolean j = b.booleanValue();
        Character c = Character.valueOf('a');
        System.out.println(c.toUpperCase('a'));

    }
}

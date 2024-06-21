package clg_codes.string;
public class M {
    public static void main(String[] args) {
        String s = new String("MorrisMano : ");
        String s1 = new String("SomethingIsBetterThanNothing");
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf('a'));
        System.out.println(s.substring(4));
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));

        System.out.println(s.concat(s1));
        // s += s1;
        // System.out.println(s);
        System.out.println(s1.compareToIgnoreCase(s));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // trim method of string
        String s4 = new String("                  hello world welcome              ");
        System.out.println(s4.trim());
        // System.out.println(s1.trim());
        // replace method of string
        System.out.println(s1.replace(s1, s4));

    }
}

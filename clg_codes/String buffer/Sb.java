public class Sb {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello world");
        s.append(".com");
        System.out.println(s);
        s.setCharAt(5, 'r');
        System.out.println(s);
        s.setLength(20);
        System.out.println(s);
        System.out.println(s.charAt(19));
        s.insert(4, "jerl");
        System.out.println(s);  
        s.append("gst");
        s.setCharAt(2, 'g');
        s.insert(3, "$%");
        
        s.setLength(25);
        System.out.println(s);
    }
}

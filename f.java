public class f {
    public static void main(String[] args) {
        System.out.println("Main method started");
        String s = "31";
        int a;
        try {
            a = Integer.parseInt(s); //exception
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("Number fromat exception");
        } finally {
            System.out.println("in the finally block");
        }
        System.out.println("Main method ended");
    }
}

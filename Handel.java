public class Handel {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c=0;
        try{
            c = a/b;
        }catch(ArithmeticException e){
            System.out.println("exception occur");
        }
        finally{
            if(b!=0){
                System.out.println(c);
            }
        }
    }
}

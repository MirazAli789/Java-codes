class name{
    String first;
    String middle;
    String last;
    name(String x,String y,String z){
        first = x;
        middle = y;
        last = z;
    }
    name(name ref)
    {
        first = ref.first;
        middle = ref.middle;
        last = ref.last;
    }
    void print_name(){
        System.out.println(first+middle+last);
    }
}
public class hty {
    public static void main(String[] args) {
        name n1 = new name("Syed","Miraz","Ali");
        n1.print_name();
        name n2 = new name(n1);
        n2.print_name();
    }
    

}

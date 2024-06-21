class phone{
    int call;
    String name;
    phone(int x,String y){
        call = x;
        name=y;
    }
    boolean calling(){
        return true;
    }
}
class smartphone extends phone{
    boolean touch;
    smartphone(int x,String y,boolean z){
        super(x,y);
        this.touch = z;
    }
    boolean browsing_web(){
        return true;
    }
}
public class tro{
    public static void main(String[] args) {
        smartphone s = new smartphone(12, "samsung", true);
        System.out.println(s.calling());
        System.out.println(s.browsing_web());
        System.out.println(s.name);
        System.out.println(s.call);
        System.out.println(s.touch);
    }
}

class humanity{
    int age;
    String name;
    void takedata(int x,String s){
        this.age = x;
        this.name = s;
    }
}
class rectangle{
    int length;
    int width;
    void take(int x,int y)
    {
        this.length = x;
        this.width=y;
    }
}
public class test {
    public static void main(String args[]) {
        humanity h= new humanity();
        h.age = 20;
        h.name="miraz";
        System.out.println(h.age);
        System.out.println(h.name);
        h.takedata(20, "riya");
        System.out.println(h.age);
        System.out.println(h.name);
        int n = Integer.parseInt("5");
        System.out.println(n);
        rectangle rec = new rectangle();
        rec.take(12, 23);
        System.out.println(rec.length+" "+rec.width);
        
    }
}

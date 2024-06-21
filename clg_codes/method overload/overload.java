class football{
    int goal;
    football(int x){
        goal = x;
    }
    void is_GOAT(String x){
        System.out.println(x+" is the GOAT");

    }
    void is_GOAT(String x,String y){
        System.out.println(x+" and "+y+" both are GOATS");
    }
    double area(int x,double y){
        return (x*y);
    }
    double area(double x,int y){
        return (x*y);
    }
}
public class overload {
   public static void main(String[] args) {
    football f = new football(3);
    f.is_GOAT("Ronaldo");
    f.is_GOAT("Ronaldo", "Mbappe");
    System.out.println(f.area(12.45,4));
    System.out.println(f.area(32, 89.5));
   } 
}

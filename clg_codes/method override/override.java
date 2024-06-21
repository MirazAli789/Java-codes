class room{
    int length;
    int width;
    room(int x,int y){
        length =x;
        width = y;
    }
    void show(){
        System.out.println(length);
        System.out.println(width);
        System.out.println("Inside superclass");
    }
}
class bedroom extends room{
    int height;
    bedroom(int x,int y,int z){
        super(x,y);
        height = z;
    }
    void show(){ //overriden method
        System.out.println(length);
        System.out.println(width);
        System.out.println(height);
        System.out.println("Inside subclass 1");
    }
}
class classroom extends bedroom{
    int board;
    classroom(int x,int y,int z,int w){
        super(x,y,z);
        board = w;
    }
    void show(){
        System.out.println(length);
        System.out.println(width);
        System.out.println(height);
        System.out.println(board); 
        System.out.println("Inside subclass 2");
    }
}
public class override {
    public static void main(String[] args) {
        room r = new room(31, 17);
        r.show();
        System.out.println();
        bedroom b = new bedroom(12, 5, 7);
        b.show();
        System.out.println();
        classroom c = new classroom(71, 73, 43, 97);
        c.show();
    }
}

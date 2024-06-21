//copy constructor is used to cop[y the content of an object into another object 

class room {
    int length, width;

    room(int x, int y) {
        length = x;
        width = y;
    }

    room(room rw) {
        length = rw.length;
        width = rw.width;
    }

    void show() {
        System.out.println(length);
        System.out.println(width);
    }
}

public class copy {
    public static void main(String[] args) {
        room r1 = new room(31, 17);
        room r2 = new room(r1);
        r1.show();
        r2.show();
    }
}

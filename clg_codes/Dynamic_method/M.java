class animal{
    void sound(){
        System.out.println("animals make sound");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("Cat meows");
    }
}
class bird extends animal{
    void sound(){
        System.out.println("bird chirps");
    }
}
public class M {
    public static void main(String[] args) {
        animal a = new animal();
        a.sound();
        animal a1 = new dog();
        a1.sound();
        animal a2 = new cat();
        a2.sound();
        animal a3 = new bird();
        a3.sound();
    }
}

class human{
    int age;
    String name;

    human(){ //constructor
        age = 10;
        name = "stol";
    }
    void show(){
        System.out.println(age+" "+name);
    }
    
}
public class construct {
    public static void main(String[] args) {
        human h = new human();
        h.show();
    }
}

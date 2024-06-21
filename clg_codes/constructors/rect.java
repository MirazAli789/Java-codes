class name{
    int age;
    name(){
        age = 0;
    }
    name(name ref){
        age = ref.age;
    }
    name(int x){
        age = x;
    }
}

public class rect{
    public static void main(String[] args) {
        name n1 = new name(12);
        name n2 = new name(n1);
        name n3 = new name();
        System.out.println(n1.age);
        System.out.println(n2.age);
        System.out.println(n3.age);
    }
}

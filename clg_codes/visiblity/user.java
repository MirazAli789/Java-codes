import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter number 1");
        num1 = sc.nextInt();
        System.out.println("Enter number 2");
        num2 = sc.nextInt();
        int num3 = num1 + num2;
        System.out.println(num3);
    }
}

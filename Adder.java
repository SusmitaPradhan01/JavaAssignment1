import java.util.Scanner;

public class Adder {
    public static void main(String[] args){
        System.out.println("Please enter two numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a+b;
        System.out.println(a+"+"+b+"="+sum);
        scan.close();
    }
}

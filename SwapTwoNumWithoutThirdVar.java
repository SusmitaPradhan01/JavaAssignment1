import java.util.Scanner;

public class SwapTwoNumWithoutThirdVar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for a");
        int a = scan.nextInt();
        System.out.println("Enter another number, b");
        int b = scan.nextInt();
        System.out.println("Before swapping: a = "+a+" And b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: a = "+a+" And b = "+b);
        scan.close();
    }
}

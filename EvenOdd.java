import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%2==0){
            System.out.println("It is an even number");
        }else
            System.out.println("It is an odd number");

        scan.close();
    }
}


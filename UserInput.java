import java.util.Scanner;

public class UserInput {
    public static void main(String[] args ){
        System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("The number you entered is:"+a);
        scan.close();
    }
}

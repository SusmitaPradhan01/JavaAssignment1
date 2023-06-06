import java.util.Scanner;

public class FloatMultiplier {
    public static void main(String[] args) {
        System.out.println("Please enter two float numbers");
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float mul = a * b;
        System.out.println(a + "x" + b + "=" + mul);
        scan.close();
    }
}

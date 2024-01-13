import java.util.Scanner;
public class GreaterThan {
    public static void main (String[]args) {
        System.out.println("Enter three numbers : ");
        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if (b>a & c>b) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        s.close();
    }
}
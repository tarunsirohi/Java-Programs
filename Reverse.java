//to print the reverse of a given number
import java.util.Scanner;
public class Reverse {
    public static void main (String[]agrs) {
        System.out.print("Enter a number: ");
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int rev=0, rem;

        while(n!=0) {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.print("The reverse of the given number is "+rev);
        s.close();
    }

}

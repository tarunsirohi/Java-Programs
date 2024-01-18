import java.util.Scanner;
public class Palindrome {
    public static void main (String[]args) {
        System.out.print("Enter a number: ");
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int temp=n;
        int rev=0, rem;

        while(n!=0) {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==temp) {
            System.out.println("The given number is Palindrome.");
        }
        else {
            System.out.println("The given number is NOT Palindrome.");
        }
        s.close();

    }
}

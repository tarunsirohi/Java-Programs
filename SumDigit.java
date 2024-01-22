import java.util.Scanner;
public class SumDigit {
    public static void main(String[]args) {
        System.out.print("Enter a digit: ");
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int sum=0, rem;
        while(n>0) {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.print("The sum of the given digit is "+sum);
        s.close();
    }
    
    
}

import java.util.Scanner;
public class Even {
    public static void main (String [] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        } 
        sc.close();
    }
}

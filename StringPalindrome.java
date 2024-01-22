import java.util.Scanner;

public class StringPalindrome {
    public static void main(String []args){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        String rev=""; 
        int len=str.length();

        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev)) {
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        } 

        sc.close();
    }
}

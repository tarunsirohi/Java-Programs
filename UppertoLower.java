//write a java program to convert uppercase strings to lowercase strings usng ascii code
import java.util.Scanner;
class UppertoLower {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner (System.in);
        boolean flag=true;
        while(flag) {
            System.out.println("Enter any string to uppercase:");
            String a = sc.nextLine();
            char b[] = a.toCharArray();
            for (char c1 : b) {
                char c2 = (char) ((int) (c1) + 32);
                System.out.print(c2);
            }
            System.out.println("\n");
            System.out.println("Do you want to continue");
            String ans = sc.nextLine();
            if(ans.equalsIgnoreCase("yes"))
            {
                flag=true;
            }
            else
                flag=false;
        }



    }
}

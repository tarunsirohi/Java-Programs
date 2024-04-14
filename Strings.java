// a string is provided as a input from console which consist of integer value.
// insert * if subsequent numbers are even and insert - if subsequent no. are odd.
// sample input 21462675756
// output 214*6*2*67-5-7-56 
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String s = sc.nextLine();
        int i = 0;
        char prev = '0';
        while (i < s.length()) {
            System.out.print(s.charAt(i));
            prev = s.charAt(i);
            i++;
            if (i < s.length()) {
                if ((prev - '0') % 2 == 0 && (s.charAt(i) - '0') % 2 == 0) {
                    System.out.print("*");
                } 
                else if ((prev - '0') % 2 != 0 && (s.charAt(i) - '0') % 2 != 0) {
                    System.out.print("-");
                }     
            }
        sc.close();
        }
    }
}

//string containing alphanumeric string. you need to separate string and numbers.
//if a string contains An3s0h08u,then it should print as: Anshu as 1 string and 3008 as another 
//string of numbers

import java.util.*;
public class alphanumeric {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        String num="";
        String str1="";
       
        for(int i=0;i<str.length();i++)
        {
            if((int)(str.charAt(i))>=65 && (int)(str.charAt(i))<=90 || (int)(str.charAt(i))>=97 && (int)(str.charAt(i))<=122)
            {
                str1=str1+str.charAt(i);
            }
            else
            {
                num=num+str.charAt(i);
            }
        }
        System.out.println("Final string after separation is:");
        System.out.println(str1+" "+num);

    }
}
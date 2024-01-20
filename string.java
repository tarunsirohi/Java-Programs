public class string {
    public static void main (String[]args) {
        String str1="Tarun";
        String str2="Tarun";
        String str3="Sirohi";
        String str4="Sharda";
        String str5="Sharda";
        
        System.out.println("Check using == method");
        boolean s1=(str1==str2);
        boolean s2=(str1==str3);
        boolean s3=(str3==str4);
        boolean s4=(str1==str5);
        boolean s5=(str3==str5);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        System.out.println("Check using equals() method");
        boolean S1=str1.equals(str2);
        boolean S2=str1.equals(str3);
        boolean S3=str3.equals(str4);
        boolean S4=str1.equals(str5);
        boolean S5=str3.equals(str5);

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        System.out.println(S4);
        System.out.println(S5);
    }    
}
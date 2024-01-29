import java.util.Scanner;
public class UnitConversion {
    public static void main (String[]args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Choose converion type:");
        System.out.print("Type 1 for converting temperature into Fahrenheit to Celsius and 2 for Celsius to Fahrenheit: ");
        int choice = s.nextInt();

        if(choice==1) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            double temp = s.nextDouble();
            double result=((temp-32)*5)/9;
            System.out.println("Temperature in Celsius is "+result);
        }
        else if(choice==2) {
            System.out.println("Enter the temperature in Celsius: ");
            double temp = s.nextDouble();
            double result=((temp*9)/5)+32;
            System.out.println("Temperature in Celsius is "+result);
        }
        else {
            System.out.println("Entered key is invalid.");
        }

        System.out.println("Conversion of Meters into Centimeters:");
        System.out.print("Enter the Lenght in Meters: ");
        double meters = s.nextDouble();
        System.out.println("Lenght in Centimeters is "+meters*100);

        s.close();
    }

}

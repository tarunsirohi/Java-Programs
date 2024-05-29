import java.util.*;

public class VehicleShowroom {
    public static void main(String []args) 
    {
        System.out.println ("Welcome to my Showroom !!");
        Scanner sc = new Scanner(System.in);

        System.out.println ("Please select a vehicle type. Press 2 for Two-Wheeler Vehicle and 4 for Four-Wheeler Vehicle.");
        String VType = sc.next();
        if (VType.equals("2")) 
        {
            System.out.println ("User selected Two-Wheeler Vehicle.");

            System.out.println ("Please select a Vehicle Company. Press 1 for Honda and 2 for Hero.");
            String CType = sc.next();
            if (CType.equals("1")) 
            {
                System.out.println ("User selected Hero.");

                System.out.println ("Please select either of the Hero Bikes. Press 1 for Hero Glamour and 2 for Hero Splendor.");
                String BType = sc.next();
                if (BType.equals("1")) 
                {
                    System.out.println ("User selected Hero Glamour.");

                    System.out.println ("All the details are below :");
                    System.out.println ("Model Number : 123");
                    System.out.println ("Colour : Red");
                    System.out.println ("Price : Rs.89,000");
                }
                else if (BType.equals("2")) 
                {
                    System.out.println ("User selected Hero Splendor.");

                    System.out.println ("All the details are below :");
                    System.out.println ("Model Number : 456");
                    System.out.println ("Colour : Black");
                    System.out.println ("Price : Rs.81,000");
                }
                else 
                {
                    System.out.println ("User selected Invalid Choice.");
                }
            }
            else if (CType.equals("2")) 
            {
                System.out.println ("User selected Honda.");

                System.out.println ("Please select either of the Honda Bikes. Press 1 for Honda Activa and 2 for Honda Grom.");
                String BType = sc.next();
                if (BType.equals("1")) 
                {
                    System.out.println ("User selected Honda Activa.");

                    System.out.println ("All the details are below :");
                    System.out.println ("Model Number : 789");
                    System.out.println ("Colour : White");
                    System.out.println ("Price : Rs.92,000");
                }
                else if (BType.equals("2"))
                {
                    System.out.println ("User selected Honda Grom.");

                    System.out.println ("All the details are below :");
                    System.out.println ("Model Number : 234");
                    System.out.println ("Colour : Blue");
                    System.out.println ("Price : Rs.84,000");
                }
                else 
                {
                    System.out.println ("User selected Invalid Choice.");
                }
            }
            else 
            {
                System.out.println ("User selected Invalid Choice.");
            }
        }
        else if (VType.equals("4")) 
        {
            System.out.println ("User selected Four-Wheeler Vehicle.");

            System.out.println ("Please select a vehicle Company. Press 1 for Tata and 2 for Mahindra.");
            String CType = sc.next();
            if (CType.equals("1")) 
            {
                System.out.println ("User selected Tata.");

                System.out.println ("Please select either of the Tata Cars. Press 1 for Nexon and 2 for Harrier.");
                String BType = sc.next();
                if (BType.equals("1")) 
                {
                    System.out.println ("User selected Nexon.");

                    System.out.println ("All the details are below :");
                    System.out.println ("Model Number : 567");
                    System.out.println ("Colour : White");
                    System.out.println ("Price : Rs.12,00,000");
                }
                else if (BType.equals("2")) 
                {
                    System.out.println ("User selected Harrier.");

                    System.out.println ("All the details are below :");
                    System.out.println ("Model Number : 891");
                    System.out.println ("Colour : Black");
                    System.out.println ("Price : Rs.27,00,000");
                }
                else 
                {
                    System.out.println ("User selected Invalid Choice.");
                }
            }
            else if (CType.equals("2")) 
            {
                System.out.println ("User selected Mahindra.");

                System.out.println ("Please select either of the Mahindra Cars. Press 1 for Thar and 2 for Bolero.");
                String BType = sc.next();
                if (BType.equals("1")) 
                {
                    System.out.println ("User selected Thar.");

                    System.out.println ("All the details are below :");
                    System.out.println ("Model Number : 134");
                    System.out.println ("Colour : Red");
                    System.out.println ("Price : Rs.18,00,000");
                }
                else if (BType.equals("2")) 
                {
                    System.out.println ("User selected Bolero.");
                    
                    System.out.println ("All the details are below :");
                    System.out.println ("Model Number : 519");
                    System.out.println ("Colour : White");
                    System.out.println ("Price : Rs.10,00,000");
                }
                else 
                {
                    System.out.println ("User selected Invalid Choice.");
                }
            }
            else 
            {
                System.out.println ("User selected Invalid Choice.");
            }
        }
        else 
        {
            System.out.println ("User selected Invalid Choice.");
        }
    }
}
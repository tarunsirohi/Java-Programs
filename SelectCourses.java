//student name-user
//student course-user input(java,python,php)
//sid-system generated(if java is selected by student1 then sid is Java1,if python is selected then sid is Python1,if php is selected then sid is Php1)
//(if java is selected by student 2 then sid is Java2 and so on...)
import java.util.Scanner;

public class SelectCourses{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int java=1;
        int python=1;
        int php=1;  
        System.out.println("Enter the no. of students:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Student"+(i+1));
           System.out.println("Enter name of student:");
           String name=sc.next();
           System.out.println("Student course input(java,python,php)");
           String course=sc.next();
           System.out.println("System ID generated");
           if(course.equalsIgnoreCase("java"))
           {
               System.out.println("Java"+(java++));
           }
           else if(course.equalsIgnoreCase("python"))
           {
               System.out.println("Python"+(python++));
           }
           else if(course.equalsIgnoreCase("php"))
           {
               System.out.println("Php"+(php++));
           }
           else
           {
               System.out.println("Invalid course");
           }
        }

    }
    
}
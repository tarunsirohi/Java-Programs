public class LeftNumIncPattern {
    public static void main(String args[])
    {
        int i,j,row=4,counter=1;
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" "+counter);
                counter++; }
            
            System.out.println(" ");
        }
    }
}

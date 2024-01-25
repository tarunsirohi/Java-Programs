public class SumOfOdd {
    public static void main(String []args){
        int i,sum=0;
        for(i=10;i<=50;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
    System.out.println("Sum of odd numbers from 10 to 50 : "+sum);
    }
}

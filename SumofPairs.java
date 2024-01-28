public class SumofPairs {
    public static void main(String[] args) {
        int sum = 0;

        for (int num1 = 1; num1 <= 100; num1++) {
            for (int num2 = num1 + 1; num2 <= 100; num2++) {
                if (num1 % 5 == 0 && num2 % 7 == 0) {
                    int result = num1 + num2;
                    sum += result;
                    System.out.println("The sum of pairs of numbers between 1 and 100 divisible by 5 and 7 is: "+sum);
                }
            }
        }

        
    }
}

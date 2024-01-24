public class SumofNum {
    public static void main(String[] args) {
        int i,sum = 0;

        for (i = 101; i <= 200; i++) {
            // Check if the number is divisible by 6 or 7
            if (i % 6 == 0 || i % 7 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("The sum of numbers between 101 and 200 that are divisible by 6 or 7 is: " + sum);
    }
}

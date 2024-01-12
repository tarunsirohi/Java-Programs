public class FindPairsWithSum {
    public static void main(String[] args) {
        int targetSum = 30;
    
        for (int num1 = 1; num1 <= 25; num1++) {
            for (int num2 = num1+ 1; num2 <= 25; num2++) {
                if (num1 + num2 == targetSum) {
                    System.out.println(+ num1 + " + " + num2 + " = " + targetSum);
                }
            }
        }
    }
}
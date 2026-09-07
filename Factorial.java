public class Factorial {
    public static long compute(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + compute(n));
    }
}

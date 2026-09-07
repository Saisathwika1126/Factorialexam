public class TestFactorial {
    public static void main(String[] args) {
        try {
            if (Factorial.compute(5) != 120) {
                System.out.println("Test failed: Factorial of 5 should be 120");
                return;
            }

            if (Factorial.compute(0) != 1) {
                System.out.println("Test failed: Factorial of 0 should be 1");
                return;
            }

            System.out.println("Test cases passed");

        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
        }
    }
}

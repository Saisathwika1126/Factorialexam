public class Factorial {
    public static void main(String[] args) {
        try{
            if(Factorial.compute(5)!=120){
                System.out.println("Test failed: Factorial of 5 should be 120");

            } 
            if(Factorial.compute(0)!=1){
                system.out.println("Test Failed: wrong output");
                    }
                
                else {
                System.out.println("Test cases passed");
            }
        }
            catch(Exception e){
                System.out.println("Test failed: "+e.getMessage());
        }

    }
}

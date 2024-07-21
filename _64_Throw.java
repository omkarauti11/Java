public class _64_Throw {
    public static void main(String[] args) {

        int i=2;
        // int i = 0;
        int j = 0;

        try {
            j = 0 / i;
            if (j == 0)
                throw new ArithmeticException("I don't want to do print zero");
        }
        catch (ArithmeticException e) {
            
            System.out.println(e);

            System.out.println("that is default output: " + 18 / i);

            // System.out.println("Cannot divide by zero");
        }
        catch (Exception e) {

            System.out.println("Something went wrong." + e);
        }

        System.out.println("Bye..");
    
    }
}

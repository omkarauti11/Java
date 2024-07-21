class omkarException extends Exception {
    public omkarException(String string) {
        super(string);
    }
}

public class _65_CustomException {
    public static void main(String[] args) {


        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0)
                throw new omkarException("I don't want to do print zero");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (Exception e) {

            System.out.println("Something went wrong." + e);
        }

        System.out.println("Bye");
    }
}

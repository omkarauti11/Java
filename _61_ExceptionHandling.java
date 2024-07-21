// Exception handling in Java is a mechanism that handles runtime errors, allowing the program to continue executing or terminate gracefully rather than crashing. It helps in identifying and responding to exceptional conditions or unexpected events during program execution.

// Key Concepts of Exception Handling

// Exception: An event that disrupts the normal flow of the program's instructions during runtime.
// Checked Exception: Exceptions that are checked at compile-time (e.g., IOException).
// Unchecked Exception: Exceptions that occur at runtime and are not checked at compile-time (e.g., ArithmeticException, NullPointerException).
// Error: Serious problems that a reasonable application should not try to catch (e.g., OutOfMemoryError).

public class _61_ExceptionHandling {

    public static void main(String[] args) {
        // int i = 10;
        int i = 0;
        int j = 20;

        try {
            j = 20 / i;
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println(j);

    }
}

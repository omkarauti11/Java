public class _10_If_Else {
    public static void main(String[] args) {

        if (true) {
            System.out.println("Hello");
        }

        int x = 28;

        if (x > 10 && x <= 20) { // 11-20
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }

        // Ternary Operator
        int n = 4;
        int result;
        result = n % 2 == 0 ? 10 : 20;
        System.out.println(result);
    }
}

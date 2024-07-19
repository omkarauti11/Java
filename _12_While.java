public class _12_While {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 4) {
            System.out.println("Hi" + i);
            int j = 1;
            while (j <= 3) {
                System.out.println("Omkar" + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye" + i);
    }
}

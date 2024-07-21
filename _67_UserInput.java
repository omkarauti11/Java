import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _67_UserInput {
    public static void main(String[] args) throws IOException {

        // System.out.println("Enter a number");
        // Reads single char at a time
        // int num = System.in.read();
        // System.out.println(num);
        // System.out.println(num - 48);

        System.out.println("Enter a number");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);


        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.close();
        System.out.println(num1);
    }
}

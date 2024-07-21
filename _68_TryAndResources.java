import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _68_TryAndResources {
    public static void main(String[] args) throws IOException {
 
        int num = 0;
    
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // InputStreamReader in =new InputStreamReader(System.in);
            // BufferedReader br=new BufferedReader(in);
            System.out.println("Enter number: ");
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } 
    }

}

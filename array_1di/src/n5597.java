import java.io.IOException;
import java.util.Scanner;

public class n5597 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] b  = new int[30];

        for (int i = 0 ; i<30 ; i++) b[i] = 0;
        for (int i = 0 ; i<28 ; i++){
            int c = sc.nextInt();
            b[c-1] = 1;
        }
        int d = 0;
        for (int i = 0 ; i<30 ; i++){
            if(b[i] == 0) System.out.println(i+1);

        }
    }
}

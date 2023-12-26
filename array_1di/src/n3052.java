import java.util.Scanner;

public class n3052 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] b  = new int[10];

        for (int i = 0 ; i<10 ; i++) {
            b[i] =sc.nextInt() ;
            b[i] = b[i] % 42;
        }

        int d = 0;
        for (int i = 0 ; i<10 ; i++){
            for(int j = i+1 ; j<10; j++){
                if(b[i] == b[j]) b[j] = -1;
            }
        }
        for(int i = 0 ; i<10; i++){
            if(b[i]!=-1) d = d+ 1;
        }
        System.out.println(d);
    }
}

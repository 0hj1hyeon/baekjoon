import java.util.Scanner;

public class n9095 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m[] = new int[11];
        m[1] =1 ; m[2]=2; m[3]=4;
        for(int i =4; i<=10; i++){
            m[i] = m[i-1] +m[i-2 ]+m[i-3];
        }

        for(int i=0;i<a;i++) {
            int n = sc.nextInt();

            System.out.println(m[n]);
        }
    }
}

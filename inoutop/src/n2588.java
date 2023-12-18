import java.util.Scanner;

public class n2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b;
        for(int i = 1; i <= 3 ; i++) {
            int d = c%10;
            System.out.println(a * d);
            c = c/10;

        }
        System.out.println(a*b);
    }
}

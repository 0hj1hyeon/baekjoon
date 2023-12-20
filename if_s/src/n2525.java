import java.util.Scanner;

public class n2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();



        B = B + C;

        a = B/60;
        B = B%60;
        A = A + a;
        A = A %24;
        System.out.println(A + " " + B);
    }
}

import java.util.Scanner;

public class n10950 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] ab = new int[a];
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            ab[i] = b + c;
        }
        for (int i = 0; i < a; i++) {
            System.out.println(ab[i]);
        }
    }
}

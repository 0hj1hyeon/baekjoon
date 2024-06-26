import java.util.Scanner;

public class n1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long num = 666;
        int m = 0;
        while (true) {
            String strNum = Long.toString(num);
            if (strNum.contains("666")) {
                m++;
            }

            if (m == n) break;
            num++;
        }

        System.out.println(num);
    }

}

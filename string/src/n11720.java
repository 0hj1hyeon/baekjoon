import java.util.Scanner;

public class n11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        String b = sc.nextLine();
        int c = 0;
        for(int i = 0; i<a;i++){

            c += b.charAt(i) - '0';
        }
        System.out.println(c);
    }
}

import java.util.Scanner;

public class n2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = n;
        int c = 0;
        int r = 0;

        while(b !=0){
            b /=10;
            c++;
        }
        c = c*9;

        for(int i = n-c; i<n; i++){
            int a = i;
            int s = 0;

            while(a !=0){
                s += a %10;
                a /= 10;
            }

            if(i+s == n){
                r = i;
                break;

            }
        }


        System.out.println(r);

    }
}

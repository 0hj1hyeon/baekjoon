import java.util.Scanner;

public class n2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] b = new int[9];
        for(int i = 0 ; i <9 ; i++){
            b[i] = sc.nextInt();
        }

        int c = 0;
        int d = 0;
        for(int i = 0 ; i <9 ; i++){
            if( c < b[i]) {
                c = b[i];
                d = i + 1;
            }
        }
        System.out.println(c);
        System.out.println(d);
    }
}

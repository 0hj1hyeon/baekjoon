import java.util.Scanner;

public class n10871 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a2 = sc.nextInt();
        int[] b = new int[a];
        for(int i = 0 ; i <a ; i++){
            b[i] = sc.nextInt();
        }
        for(int i = 0 ; i <a ; i++){
            if( a2> b[i]) System.out.print(b[i]+" ");
        }

    }
}

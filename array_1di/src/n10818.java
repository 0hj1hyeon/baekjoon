import java.util.Scanner;

public class n10818 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i = 0 ; i <a ; i++){
            b[i] = sc.nextInt();
        }
        int c = b[0];
        for(int i = 1 ; i <a ; i++){
            if( c > b[i]) c = b[i];
        }
        System.out.print(c+" ");
        c = b[0];
        for(int i = 1 ; i <a ; i++){
            if( c < b[i]) c = b[i];
        }
        System.out.print(c+" ");
    }
}

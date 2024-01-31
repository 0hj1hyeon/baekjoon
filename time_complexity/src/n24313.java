import java.util.Scanner;

public class n24313 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();


        if(c*n >= (a1*n)+a2 && c>=a1){
            System.out.println(1);

        }
        else {System.out.println(0);}
    }
}

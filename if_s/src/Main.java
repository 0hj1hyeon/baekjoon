import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A == B && B == C) System.out.println(10000+ A*1000);
        if(A == B && B != C) System.out.println(1000+ A*100);
        if(A != B && B == C) System.out.println(1000+ B*100);
        if(A == C && B != A) System.out.println(1000+ A*100);
        if(A != B && A != C && B != C){
            if(A>B && A > C) System.out.println(A*100);
            if(B>A && B > C) System.out.println(B*100);
            if(C>B && C > A) System.out.println(C*100);
        }

    }
}
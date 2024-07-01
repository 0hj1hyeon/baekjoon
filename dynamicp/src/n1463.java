import java.util.Scanner;

public class n1463 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();


        int[] m = new int[a+1];

        for(int i = a; i!=1; i--){
            int b = i;
            if(m[i-1] ==0) m[i-1] = m[i]+1;
            else m[i-1] = Math.min(m[i-1],m[i]+1);
            if(i%2 ==0) {
                if (m[i/2] == 0) m[i/2] = m[i] + 1;
                else m[i/2] = Math.min(m[i/2], m[i] + 1);
            }

            if(i%3 ==0) {
                if (m[i/3] == 0) m[i/3] = m[i] + 1;
                else m[i/3] = Math.min(m[i/3], m[i] + 1);
            }

        }
        System.out.println(m[1]);

    }
}

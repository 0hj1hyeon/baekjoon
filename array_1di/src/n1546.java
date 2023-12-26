import java.util.Scanner;

public class n1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        float[] b = new float[a];
        float c = 0;
        for(int i = 0 ; i <a ; i++){
            b[i] = sc.nextFloat();
            if(c <b[i]) c =  b[i];
        }
        for(int i = 0; i< a; i++){
            b[i] = b[i] / c * 100;
        }
        c = 0;
        for(int i = 0; i< a; i++){
            c += b[i];
        }
        System.out.println(c/a);
    }
}

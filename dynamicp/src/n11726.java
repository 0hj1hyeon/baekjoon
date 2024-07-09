import java.util.Scanner;

public class n11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();


        int abc[] = new int[1001];
        abc[1] = 1;
        abc[2] =2;
        for(int i =3 ;i<=1000;i++){
            abc[i] = (abc[i-1]+ abc[i-2])%10007;
        }

        System.out.println(abc[a]);


    }
}

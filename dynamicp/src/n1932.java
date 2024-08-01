import java.util.Scanner;

public class n1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();


        int size = (a*(a+1)/2);
        int abc[] = new int[size+1];
        int ans[] = new int[size+1];

        for(int i =1 ;i<=size;i++){
            abc[i]= sc.nextInt();
        }
        int ab = 1;
        ans[1] = abc[1];
        int index = 2;

        for (int i = 1; i < a; i++) {
            for (int j = 1; j <= i; j++) {
                ans[index] = Math.max(ans[index], ans[ab] + abc[index]);
                ans[index + 1] = Math.max(ans[index + 1], ans[ab] + abc[index + 1]);
                ab++;
                index++;
            }
            index++;
        }
        int answer =0;

        for(int i =1 ;i<=size;i++){
            answer = Math.max(answer,ans[i]);

        }

        System.out.println(answer);
    }
}

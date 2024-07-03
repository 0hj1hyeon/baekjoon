import java.util.Scanner;

public class n2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int z = sc.nextInt();
        int[]a = new int[n];

        for(int i =0; i<n;i++){
            a[i] = sc.nextInt();

        }
        int ans = 0;

        int start =0,end=0, sum=0;

        while(true){
            if(sum>=z){
                sum-=a[start++];
            }
            else if(end==n){
                break;
            }else{
                sum+=a[end++];
            }

            if(sum==z){
                ans++;
            }
        }

        System.out.println(ans);
    }
}

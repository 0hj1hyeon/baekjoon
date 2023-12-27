import java.util.Scanner;

public class n10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        int[] c = new int[26];
        for(int j =0; j<26;j++) c[j] = -1;


        for(int i = 0 ; i<a.length();i++){
            char b = 'a';
            for(int j =0; j<26;j++){
                if(b == a.charAt(i) && c[j] == -1) c[j] = i;
                b++;
            }

        }
        for(int j =0; j<26;j++) System.out.print(c[j]+" ");
    }
}

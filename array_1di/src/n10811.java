import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10811 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] c = new int[a];

        for (int i = 0 ; i<a; i++) {
            c[i] = i+1;
        }

        for(int i = 0 ; i <b ; i++){

            StringTokenizer stt = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(stt.nextToken())-1;
            int a2 = Integer.parseInt(stt.nextToken())-1;
            do {
                int d = c[a1];
                c[a1] = c[a2];
                c[a2] = d;
                a1++;
                a2--;
            }while(a1<a2);
        }
        for (int i = 0 ; i<a; i++) {
            System.out.print(c[i]+" ");
        }
    }
}

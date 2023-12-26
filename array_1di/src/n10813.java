import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10813 { public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    int[] c = new int[a];

    for (int i = 0 ; i<a ; i++) c[i] = i+1 ;

    for(int i = 0 ; i <b ; i++){

        StringTokenizer stt = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(stt.nextToken());
        int a2 = Integer.parseInt(stt.nextToken());
        int g = c[a1-1];
        c[a1-1] = c[a2-1];
        c[a2-1] = g;
    }

    for (int i = 0 ; i<a ; i++) System.out.print(c[i]+" ");

}
}

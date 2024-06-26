import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i<n; i++){

            a.add(sc.nextInt());
        }

        Collections.sort(a);
        for(int b:a){
            sb.append(b).append("\n");
        }
        System.out.println(sb);

    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n*n
        char[][] a = new char[n][n];
        boolean[][] v = new boolean[n][n];



        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                a[i][j] = line.charAt(j);
            }
        }


    }

}
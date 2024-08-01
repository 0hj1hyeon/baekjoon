import java.util.ArrayList;
import java.util.Scanner;

public class n1068 {
    static ArrayList<Integer>[] a;
    static boolean[] check;
    static int leafCount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        a = new ArrayList[n];
        check = new boolean[n];

        for (int i = 0; i < n; i++) {
            a[i] = new ArrayList<>();
        }

        int root = 0;
        for (int i = 0; i < n; i++) {
            int parent = sc.nextInt();
            if (parent == -1) {
                root = i;
            } else {
                a[parent].add(i);
            }
        }

        int d = sc.nextInt();

        if (d == root) {
            System.out.println(0);
        } else {
            removeNode(d);
            leafCount = 0;
            dfs(root);
            System.out.println(leafCount);
        }
    }

    static void removeNode(int node) {
        check[node] = true;
        for (int child : a[node]) {
            if (!check[child]) {
                removeNode(child);
            }
        }
    }

    static void dfs(int node) {
        check[node] = true;
        boolean isLeaf = true;

        for (int child : a[node]) {
            if (!check[child]) {
                isLeaf = false;
                dfs(child);
            }
        }

        if (isLeaf) {
            leafCount++;
        }
    }
}

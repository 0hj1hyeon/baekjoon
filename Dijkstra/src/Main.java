import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node{
    int end;
    int weight;

    public Node(int end,int weight) {
        this.end = end;
        this.weight = weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int K = sc.nextInt();

        boolean[]visit = new boolean[V+1]; // 정점 방문
        int[]ans = new int[V+1]; //답
        List<Node>[] l = new List[V+1];
        for(int i = 1; i<=V; i++){
            l[i] = new ArrayList<>();
            ans[i] = Integer.MAX_VALUE;
        }

        for(int i=0;i<E;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            l[u].add(new Node(v,w));
        }

        PriorityQueue<Node> queue
    }
}
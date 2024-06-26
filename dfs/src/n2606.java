import java.util.Scanner;
import java.util.Stack;

public class n2606 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 정점의 개수
        int b = sc.nextInt(); // 간선의 개수
        int [][] computer = new int[a+1][a+1];
        boolean[] visited = new boolean[a+1];
        for(int i = 0; i<b; i++){
            int st = sc.nextInt();
            int ar = sc.nextInt();
            computer[st][ar] = 1;
            computer[ar][st] = 1;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        while(!stack.isEmpty()){
            int v = stack.pop();
            if(!visited[v]){
                visited[v] = true;
            }
            for(int i = 1; i< a+1;i++){
                if(computer[v][i] == 1 && !visited[i]){
                    stack.push(i);
                }
            }


        }
        int answer = 0;
        for(int i = 1; i<a+1;i++){
            if(visited[i]) answer++;
        }
        System.out.println(answer-1);
    }

}

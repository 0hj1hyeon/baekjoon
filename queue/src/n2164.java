import java.util.*;

public class n2164 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N ; i++) {
            queue.add(i);

        }
        while(queue.size() != 1) {
            queue.remove();
            int a = queue.poll();
            queue.add(a);


        }
        System.out.print(queue.poll());

    }

}

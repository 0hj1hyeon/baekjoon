import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> a = new PriorityQueue<>((o1, o2) -> o2-o1);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i =0;i<n;i++){
            int b = scanner.nextInt();
            if(b == 0){
                if(a.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(a.poll());
                }
            }
            else{
                a.offer(b);
            }
        }
    }
}

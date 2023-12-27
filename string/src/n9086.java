import java.util.Scanner;

public class n9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine(); // 엔터키를 소진하기 위해 추가
        for(int i = 0 ; i< a ; i++){
            String b = new String("");
            b = sc.nextLine();
            System.out.println(""+b.charAt(0)+b.charAt(b.length()-1));
        }
    }
}

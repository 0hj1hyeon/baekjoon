import java.util.Scanner;

public class n1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim(); // 앞뒤 공백 제거
        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            String[] words = input.split("\\s+"); // 공백을 기준으로 단어 분리
            System.out.println(words.length);
        }
    }
}

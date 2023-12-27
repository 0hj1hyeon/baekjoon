import java.util.Scanner;

public class n2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = Integer.parseInt(sc.nextLine()); // 개행 문자 소진과 동시에 정수로 변환

        for(int i = 0; i < a1; i++){
            String[] input = sc.nextLine().split(" "); // 공백을 기준으로 입력을 나눠 배열로 저장
            int a = Integer.parseInt(input[0]); // 첫 번째 요소는 반복 횟수
            String b = input[1]; // 두 번째 요소는 문자열

            for(int j = 0; j < b.length(); j++){
                for(int k = 0; k < a; k++){
                    System.out.print(b.charAt(j));
                }
            }
            System.out.println();
        }
    }
}

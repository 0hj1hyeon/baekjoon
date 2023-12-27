import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        String b = sc.nextLine().trim();
        String[] a = b.split("\\s+");
        System.out.println(a.length);
    }

}
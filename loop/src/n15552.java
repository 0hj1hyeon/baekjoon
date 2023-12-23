import java.io.*;

public class n15552 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //공백마다 데이터 끊어서 배열에 넣음
        int a = Integer.parseInt(br.readLine());


        for (int i = 0; i < a; i++) {
            String s = br.readLine();
            int b = Integer.parseInt(s.split(" ")[0]);
            int c = Integer.parseInt(s.split(" ")[1]);
            bw.write(b+c+"\n");

        }

        bw.flush();

    }
}

import java.io.*;

public class n11021 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());


        for (int i = 1; i <= a; i++) {
            String s = br.readLine();
            int b = Integer.parseInt(s.split(" ")[0]);
            int c = Integer.parseInt(s.split(" ")[1]);
            //bw.write("Case #"+ i +": "+ b+c +"\n");
            System.out.println("Case #"+ i +": "+ (b+c));

        }

        //bw.flush();

    }
}

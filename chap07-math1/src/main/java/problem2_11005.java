import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;


public class problem2_11005 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while(a>0){
            if(a%b >= 10){
                sb.append((char)(a%b+55));
            } else{
                sb.append(a%b);
            }
            a /= b;
        }
        System.out.println(sb.reverse());
    }
}

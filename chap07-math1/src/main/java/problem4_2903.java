import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class problem4_2903 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        double result = 2;

        for(int i  = 0; i < num; i++){
            result += Math.pow(2,i);
        }

        System.out.println((int)(result * result));
    }
}

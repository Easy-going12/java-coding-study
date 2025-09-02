import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class problem5_2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /* 규칙
         *  2 ~ 7   => 2     5
         *  8 ~ 19  => 3     11
         *  20 ~ 37 => 4     17
         *  38 ~ 61 => 5     23
         *  카운터가 1씩 증가하는 범위에 해당하는 간격이 6씩 증가하고 있다.
        * */

        int num = Integer.parseInt(br.readLine());
        int i = 0;
        int range = 1;
        while(range <= num){
            range += 6 * ++i;
        }
        System.out.println(i+1);
    }
}

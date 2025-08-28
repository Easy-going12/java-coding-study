import java.io.*;
import java.util.*;

public class problem1_2745 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 한 줄을 띄어쓰기 포함 토근(단어) 단위로 읽음.
        // 따라서 한 토큰씩 읽기 위해서는 nextToken()메서드를 사용해야함
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int a = Integer.parseInt(st.nextToken());

        int tmp = 1;
        int result = 0;

        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                // 예시 문제 1번 기준 36진법에서 Z는 35에 해당함. Z에 원래 아스키 코드는 90이므로
                // 55를 빼야 35가 나옴. 즉 어떤 진법이든 10진법으로 바꿀 때 아스키 코드를 기준으로 숫자를
                // 입력하면 될 거 같음. 0: 48, A: 65, a: 97
                result += (c-55) * tmp;
            } else{
                // 영어 외에 숫자는 0에 해당하는 48을 빼면 36진법 기준으로 된 숫자 값들이 나온다.
                result += (c-48) * tmp;
            }
            tmp *= a;
        }
        System.out.println(result);
    }
}

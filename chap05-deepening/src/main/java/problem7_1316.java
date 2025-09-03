import java.util.Arrays;
import java.util.Scanner;

public class problem7_1316 {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(check() == true){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean check() {
        boolean[] bl = new boolean[26];
        String st = sc.next();
        int prv = 0;

        for(int i = 0; i<st.length(); i++){
            int now = st.charAt(i);

            // 알파벳 배열을 선언해서 전부다 False 선언 후 처음 선언 되면 true로 선언하고 다시 true 나오면
            // 이미 나온 단어이므로 패스
            if(prv != now){
                if(bl[now -'a'] == false){
                    bl[now-'a'] = true;
                    prv = now;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}

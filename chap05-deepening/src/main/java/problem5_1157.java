import java.util.Scanner;

public class problem5_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();

        int[] alpha = new int[26];

        // 알파벳 26자리 해당하는 인덱스 자리 값 증가(예시로 Mississipi의 경우 i자리 3증가, s자리에 4값으로 증가)
        for (int i = 0; i < input.length(); i++) {
            alpha[input.charAt(i) - 'A']++;
        }

        int max = 0;
        char result = '?';
        // 알파벳 자리 비교하면서 제일 많이 나온 인덱스 값을 max에 저장하고 max 값이랑 같은 ? 출력
        for (int i = 0; i < 26; i++) {
            if (alpha[i] > max) {
                max = alpha[i];
                result = (char)(i + 'A');
            } else if (alpha[i] == max) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}

import java.util.Scanner;

public class problem1_2745_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int a = sc.nextInt();

        int tmp = 1;
        int result = 0;

        for(int i = s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                result += (c - 55) * tmp;
            }
            else{
                result += (c-48) * tmp;
            }
            tmp *= a;
        }
        System.out.println(result);
    }
}

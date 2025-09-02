import java.util.Scanner;

public class problem6_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;

        for(int i = 0; i<n-1; i++){
            if((a+b)%2 == 0){
                if(a == 1){
                    b++;
                } else{
                    a--; b++;
                }
            } else{
                if(b ==1){
                    a++;
                } else{
                    a++; b--;
                }
            }
        }

        System.out.println(a + "/" + b);
    }
}

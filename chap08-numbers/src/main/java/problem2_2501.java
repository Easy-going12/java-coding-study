import java.util.Scanner;

public class problem2_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if(N%i == 0){
                arr[count] = i;
                count++;
            }
        }

        if(count >= K){
            System.out.println(arr[K-1]);
        } else{
            System.out.println(0);
        }
    }
}


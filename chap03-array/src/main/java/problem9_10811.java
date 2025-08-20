import java.util.Scanner;

public class problem9_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for(int a = 0; a<N; a++){
            arr[a] = a+1;
        }

        for(int b = 0; b<M; b++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            while(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        for(int k: arr){
            System.out.print(k + " ");
        }
    }
}

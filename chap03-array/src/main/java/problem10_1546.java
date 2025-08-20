import java.util.Scanner;

public class problem10_1546 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M = sc.nextInt();
        int[] arr = new int[M];
        double MAX = 0;
        double sum = 0;

        for(int i = 0; i<M; i++){
            arr[i]=sc.nextInt();
        }

        for(double i: arr){
            if(i>=MAX) MAX=i;
        }

        for(double i: arr){
            sum += i/MAX * 100;
        }

        System.out.println(sum/M);
    }
}

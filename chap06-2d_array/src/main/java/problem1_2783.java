import java.util.Scanner;

public class problem1_2783 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];

        for(int i = 0; i<2; i++){
            if(i == 0){
                for(int j = 0; j<N; j++){
                    for(int k = 0; k<M; k++){
                        arr1[j][k] = sc.nextInt();
                    }
                }
            }else{
                for(int j = 0; j<N; j++){
                    for(int k = 0; k<M; k++){
                        arr2[j][k] = sc.nextInt();
                    }
                }
            }
        }

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                System.out.print((arr1[i][j]+arr2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}

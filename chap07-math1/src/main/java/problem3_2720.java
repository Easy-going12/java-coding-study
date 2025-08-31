import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class problem3_2720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = {25, 10, 5, 1};

        int[][] result = new int[num][4];

        for(int i = 0; i<num; i++){
            int money = Integer.parseInt(br.readLine());

            for(int j = 0; j<arr.length; j++){
                result[i][j] = money/arr[j];
                money = money%arr[j];
            }
        }

        for (int i = 0; i < num; i++) {
            for(int j: result[i]){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


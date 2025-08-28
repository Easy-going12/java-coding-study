import java.io.*;

public class problem4_2563 {
    public static void main(String[] args) throws IOException {
        int[][] total = new int[100][100];
        int count = 0;

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int col = Integer.parseInt(br.readLine());

        for (int i = 0; i < col; i++) {
            String[] arr = br.readLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);

            for(int j = x; j< x + 10; j++){
                for(int j2 = y; j2<y + 10; j2++){
                    if(total[j][j2] == 0){
                        total[j][j2]++;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}

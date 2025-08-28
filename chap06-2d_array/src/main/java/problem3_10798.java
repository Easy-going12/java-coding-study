import java.util.Scanner;

public class problem3_10798 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[][] arr = new String[5][15];

        StringBuilder line = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            String lines = sc.nextLine();
            String[] arr2 = lines.split("");

            for(int j = 0; j<arr2.length; j++){
                arr[i][j] = arr2[j];
            }
        }

        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(arr[j][i] != null){
                    line.append(arr[j][i]);
                }
            }
        }
        System.out.println(line);
    }
}

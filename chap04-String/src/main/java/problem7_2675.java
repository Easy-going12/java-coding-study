import java.util.Scanner;

public class problem7_2675 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            String s = sc.next();
            String[] arr = s.split("");

            for(int j = 0; j<arr.length; j++){
                for(int k = 0; k<b; k++){
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}

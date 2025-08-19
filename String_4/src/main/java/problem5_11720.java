import java.util.Scanner;

public class problem5_11720 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a =  sc.nextInt();
        String b = sc.next();
        String[] arr =  b.split("");
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}

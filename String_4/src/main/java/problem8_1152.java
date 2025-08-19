import java.util.Arrays;
import java.util.Scanner;

public class problem8_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] arr = s.split(" ");
        int num = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != "") num++;
        }
        System.out.println(num);
    }
}

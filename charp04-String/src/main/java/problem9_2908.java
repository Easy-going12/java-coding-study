import java.util.Scanner;

public class problem9_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A =  sc.next();
        String B =  sc.next();
        String a = "";
        String b = "";

        String[] arr1 = A.split("");
        String[] arr2 = B.split("");


        String[] ARR1 = new String[arr1.length];
        String[] ARR2 = new String[arr2.length];

        for(int i=arr1.length-1;i>=0;i--){
            ARR1[arr1.length-i-1] = arr1[i];
        }

        for(int i=arr2.length-1;i>=0;i--){
            ARR2[arr2.length - i -1] = arr2[i];
        }

        for(int i = 0; i<ARR1.length; i++){
            a += ARR1[i];
        }

        for(int i = 0; i<ARR2.length; i++){
            b += ARR2[i];
        }

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        System.out.println((x>y)? x: y);

    }
}

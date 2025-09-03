import java.util.Arrays;
import java.util.Scanner;

public class problem4_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sr = sc.next();
        char[] array = sr.toCharArray();
        char[] array2 = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            array2[array.length-i-1] = array[i];
        }

        if(Arrays.equals(array2,array)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}

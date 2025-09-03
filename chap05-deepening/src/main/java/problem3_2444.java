import java.util.Scanner;

public class problem3_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();

        for(int i = 0; i < star; i++){
            for(int a = star-i-1; a>0; a--){
                System.out.print(" ");
            }
            for(int b = 0; b<(i+1) * 2 - 1; b ++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i<star-1; i++){
            for(int a = 0; a<i+1; a++){
                System.out.print(" ");
            }
            for(int b= (2*star)-(2*i)-3; b>0; b--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

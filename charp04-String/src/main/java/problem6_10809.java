import java.util.Scanner;

public class problem6_10809 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st = sc.next();
        String[] arr = st.split("");

        for(int i = 97; i <= 122; i++){
            for(int j = 0; j < arr.length; j++){
                if((char)i == arr[j].charAt(0)){
                    System.out.print(j + " ");
                    break;
                } else if(j == arr.length-1){
                    System.out.print("-1" + " ");
                }
            }
        }
    }
}

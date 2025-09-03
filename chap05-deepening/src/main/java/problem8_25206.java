import java.util.Arrays;
import java.util.Scanner;

public class problem8_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0.0;      // 총 학점
        double average = 0.0;     // 과목 평균

        for(int i = 0; i<20; i++){
            String str = sc.nextLine();
            String[] arr = str.split(" ");

            double score = Double.parseDouble(arr[1]);  // 해당 과목의 학점
            String avg = arr[2];                        // 해당 과목의 등급

            if(avg.equals("A+")){
                average += score * 4.5;
            }
            else if(avg.equals("A0")){
                average += score * 4.0;
            }
            else if(avg.equals("B+")){
                average += score * 3.5;
            }
            else if(avg.equals("B0")){
                average += score * 3.0;
            }
            else if(avg.equals("C+")){
                average += score * 2.5;
            }
            else if(avg.equals("C0")){
                average += score * 2.0;
            }
            else if(avg.equals("D+")){
                average += score * 1.5;
            }
            else if(avg.equals("D0")){
                average += score * 1;
            }
            else if(avg.equals("F")){
                average += score * 0.0;
            }
            else{
                continue;
            }
            result += score;

        }

        System.out.printf("%.6f",average/result);
    }
}

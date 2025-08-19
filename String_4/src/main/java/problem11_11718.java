import java.util.Scanner;

public class problem11_11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {   // 더 읽을 줄이 있을 동안 반복
            String line = sc.nextLine();
            System.out.println(line);
        }

        sc.close();
    }
}

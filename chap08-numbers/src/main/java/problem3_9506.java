import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class problem3_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) break;

            int sum = 0;
            List<Integer> divisors = new ArrayList<>();

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                    divisors.add(i);
                }
            }

            if (sum == num) {
                System.out.print(num + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    System.out.print(divisors.get(i));
                    if (i < divisors.size() - 1) {
                        System.out.print(" + ");
                    } else {
                        System.out.println();
                    }
                }
            } else {
                System.out.println(num + " is NOT perfect.");
            }
        }
    }
}

import java.util.Scanner;

public class problem6_11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//        int i = 2;
//
//        while(N > 1){
//            if(getDecimal(i)){
//                while(true){
//                    if(N%i==0){
//                        System.out.print(i + "\n");
//                        N = N/i;
//                    } else{
//                        break;
//                    }
//                }
//            }
//            i++;
//        }
        // 소수 외에 합성수 a*b에서 a,b 둘 중 하나는 루트 N 값을 넘을 수 없다. 넘을 경우 기존 값보다 커지기 때문이다.
        // 식으로 치면 a * a <= 루트 N이다. <=인 이유는 36의 경우 6 * 6으로 되 < 으로 할 경우 값을 놓칠 수 있기 때문이다.
        for(int i = 2; i * i <= N; i++){
            while(N % i == 0){
                System.out.println(i);
                N = N / i;
            }
        }
        if(N>1) System.out.println(N);
    }

//    private static boolean getDecimal(int target) {
//        for(int i = 2; i < target; i++){
//            if(target % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }

}

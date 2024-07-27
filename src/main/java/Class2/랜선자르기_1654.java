package Class2;
import java.util.Scanner;

public class 랜선자르기_1654 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int N = scan.nextInt();
        int[] array = new int[K];
        for (int i = 0; i < K; i++) {
            array[i] = scan.nextInt();
        }
        int max = 0;
        for(int i : array) {
            max = Math.max(max, i);
        }

        int res = cal(1, max, array, N);
        System.out.println(res);

    }
    public static int cal(int start, int end, int[] array, int N){
        int mid = (start + end) / 2;
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i] / mid;
        }
        if(N == sum) return mid;
        else if (N > sum) end = mid;
        else start = mid + 1;

        return cal(start,end,array,N);
    }


}

package Class2;
import java.util.*;

public class 소수찾기_1978 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(PrimeFind(nums));
    }
    public static int PrimeFind(int[] nums){
        int maxNum = maxFind(nums);
        int[] primes = new int[maxNum];
        primeArray(primes, maxNum);
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int numi = nums[i];
            boolean p = true;
            int index = 0;
            if(numi == 1) continue;
            else if(numi == 2 || numi == 3){
                count++;
                continue;
            }
            while(primes[index] != 0){
                int pj = primes[index];
                if(numi == pj){
                    break;
                }
                else if(numi % pj == 0) p = false;
                index++;
            }
            if(p){
                count++;
            }
        }
        return count;
    }
    public static int maxFind(int[] nums){
        int max = nums[0];
        for(int i : nums){
            max = Math.max(max, i);
        }
        return max;
    }
    public static void primeArray(int[] primes, int max){
        primes[0] = 2;
        primes[1] = 3;
        int pIndex = 2;
        for(int i = 3; i <= max; i+=2){
            boolean p = true;
            int index = 0;
            while(primes[index] != 0){
                int pj = primes[index];
                if(i% pj == 0) {
                    p = false;
                    break;
                }
                index++;
            }
            if(p){
                primes[pIndex++] = i;
            }
        }
    }
}

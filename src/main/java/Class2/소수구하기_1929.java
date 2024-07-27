package Class2;

import java.util.*;

public class 소수구하기_1929 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>(M-N+1);

        for (int i = 0; i <= M - N; i++) {
            nums.add(i, N+i);
        }
        ArrayList<Boolean> primeList = new ArrayList<>(M - N + 1);
        primeArray(primeList, nums.get(M-N));
    }
    public static void primeArray(ArrayList<Boolean> primeList, int n){

        primeList.add(false);
        primeList.add(false);
        for(int i = 2; i <= n; i++){
            primeList.add(i,true);
        }
        for(int i = 2; i*i <= n; i++){
            if(primeList.get(i)){
                for(int j = i*i; j<=n ; j+=i){
                    primeList.set(j, false);
                }
            }
        }
    }
//    public static void primeFind(ArrayList<Bool>)
}

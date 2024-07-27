package Class2;


import java.util.*;

public class 수찾기_1920 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        makeArray(A);
        Arrays.sort(A);
        int M = sc.nextInt();
        int[] B = new int[M];
        makeArray(B);
        for(int i = 0; i < B.length; i++){
            findNum(A, B[i]);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("수행시간 : " + (endTime - startTime) + "ms");

    }
    public static void findNum(int[] a, int b){

        int start = 0;
        int end = a.length - 1;
        int count = 0;
        while(true){
            int mid = (start + end) / 2;

            if(count == a.length) {
                System.out.println("0");
                break;
            } else if (a[mid] == b){
                System.out.println("1");
                break;
            }
            count++;
            if(a[mid] > b){
                end = mid - 1;
            } else if (a[mid] < b){
                start = mid + 1;
            }
        }
    }
    public static void makeArray(int[] x){
        for (int i = 0; i < x.length; i++){
            x[i] = sc.nextInt();
        }
    }
}

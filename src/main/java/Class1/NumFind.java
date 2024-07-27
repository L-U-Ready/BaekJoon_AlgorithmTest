package Class1;



import java.util.*;

public class NumFind {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i <A.length; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int M = sc.nextInt();
        int start = 0;
        int end = A.length - 1;

        int[] B = new int [M];
        for(int i = 0; i < B.length; i++){
            B[i] = sc.nextInt();

            find(A, B[i], start, end);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("수행시간 : " + (endTime - startTime) + "ms");
    }
    public static void find(int[] a, int b, int start, int end){
        //Indexes
        boolean ex = false;

        int mid = (start + end) / 2;
        for(int i = 0; i < a.length; i++){
            if(a[i] == b){
                ex = true;
            }
        }
        if(ex) {
            if (a[mid] == b) {
                System.out.println("1");
            } else if (a[mid] > b) {
                end = mid - 1;
                find(a, b, start, end);
            } else if (a[mid] < b) {
                start = mid + 1;
                find(a, b, start, end);
            }
        } else{
            System.out.println("0");
        }
    }
}

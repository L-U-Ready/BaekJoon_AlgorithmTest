package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class 좌표정렬하기_11650 {
    public class Main {
        static Scanner sc = new Scanner(System.in);
        static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) throws IOException {
            int N = sc.nextInt();
            int[][] arr = new int[N][2];
            for (int i = 0; i < N; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            Arrays.sort(arr, (a, b) -> {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                } else {
                    return a[0] - b[0];
                }
            });
            for (int i = 0; i < N; i++) {
                sb.append(arr[i][0] + " " + arr[i][1] + "\n");
            }
            System.out.println(sb);
        }
    }
}
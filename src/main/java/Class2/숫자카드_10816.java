package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 숫자카드_10816 {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        Map<Long, Integer> map = new HashMap<>();

        long N = sc.nextLong();
        for(long i = 0; i < N; i++){
            long num = sc.nextLong();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        long M = sc.nextLong();
        for(long i = 0; i < M ; i++){
            long num2 = sc.nextLong();
            sb.append((map.getOrDefault(num2, 0))).append("\n");
        }
        System.out.println(sb);
    }
}
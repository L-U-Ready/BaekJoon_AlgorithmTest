package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Z_1074 {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int r = parseInt(st.nextToken());
        int c = parseInt(st.nextToken());
        int q = 0;
        System.out.println(z(N, r, c, q));

    }
    public static int z(int n, int r, int c, int q){
        int quad = 0;
        if  (n == 0) return q;
        int half = (int) Math.pow(2, n-1);
        if(r < half && c < half){
            quad = 1;
        } else if (r < half && c >= half){
            quad = 2;
            c -= half;
        } else if (r >= half && c < half){
            quad = 3;
            r -= half;
        } else if (r >= half && c >= half){
            quad = 4;
            r -= half;
            c -= half;
        }
        q += (quad-1)*(int)Math.pow(half, 2);
        return z(n-1, r, c, q);
    }

}
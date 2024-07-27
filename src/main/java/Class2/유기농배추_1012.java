package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 유기농배추_1012 {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int dx[] = {1, 0, -1, 0};
    static int dy[] = {0, -1, 0, 1};
    static int graph[][];
    static boolean visited[][];
    static int N, M;
    static int count;

    public static void main(String[] args) throws IOException {
        int T = sc.nextInt();
        for(int k = 0; k < T; k++) {
            count = 0;
            M = sc.nextInt();
            N = sc.nextInt();
            int K = sc.nextInt();
            graph = new int[M][N];
            visited = new boolean[M][N];
            for (int i = 0; i < K; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                graph[x][y] = 1;
            }
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (graph[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

    }

    public static void dfs(int start, int next) {
        visited[start][next] = true;
        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + start;
            int ny = dy[i] + next;
            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx,ny);
                }
            }
        }
    }

}
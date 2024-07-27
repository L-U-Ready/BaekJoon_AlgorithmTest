package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 마인크래프트_18111 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 행
        int M = Integer.parseInt(st.nextToken()); // 열
        int B = Integer.parseInt(st.nextToken()); // 블록의 개수

        int[][] map = new int[N][M];
        int maxHeight = 0;
        int minHeight = 256;

        // 지형 정보 입력받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, map[i][j]);
                minHeight = Math.min(minHeight, map[i][j]);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int optimalHeight = 0;

        // 가능한 높이의 범위를 결정하여 계산
        for (int height = minHeight; height <= maxHeight; height++) {
            int blocks = B;
            int time = 0;

            // 해당 높이로 만들기 위한 블록 추가 또는 제거 계산
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int diff = map[i][j] - height;
                    if (diff > 0) { // 현재 높이보다 높은 경우
                        time += diff * 2; // 제거하는 시간
                        blocks += diff; // 블록 추가
                    } else { // 현재 높이보다 낮거나 같은 경우
                        time += -diff; // 추가하는 시간
                        blocks += diff; // 블록 제거
                    }
                }
            }
            // 블록이 충분한 경우에만 고려
            if (blocks >= 0) {
                if (time <= minTime) {
                    minTime = time;
                    optimalHeight = height;
                }
            }
        }
        System.out.println(minTime + " " + optimalHeight);
    }
}
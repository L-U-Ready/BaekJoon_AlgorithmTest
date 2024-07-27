package Class2;

import java.util.Scanner;

public class 체스판다시칠하기_1018 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        String[] chessBoard= new String[N];
        for(int i = 0; i < N; i++){
            chessBoard[i] = scan.next();
        }
        System.out.println("min value = " + userBWCount(chessBoard, N, M));


    }
    public static int userBWCount(String[] cb, int N, int M){
        int[] min = {64};
        for(int a = 0; a < N - 7; a++){
            for(int b = 0; b < M - 7; b++){
                int countChange = 0;
                for(int r = 0; r < 8; r++){ //여기까지 하면 (a,b)의 8x8 보드의 bw 개수가 나옴
                    for(int w = 0; w < 8; w++){
                        char currentColor = cb[a+r].charAt(b+w);
                        char currentFirstColor = cb[a+r].charAt(b);
                        if(currentFirstColor == 'B'){
                            if((r+w) % 2 == 0){ //첫 번째가 B이고 짝수번째가 B가 아닐 때 //나눠서 짝수
                                if(currentColor != 'B') countChange++;
                            } else{ // 첫 번째가 B이고 홀수번째가 W가 아닐 때
                                if (currentColor != 'W') countChange++; //나눠서 홀수
                            }
                        } else if(currentFirstColor == 'W'){
                            if((r+w) % 2 == 0){ //첫 번째가 W이고 짝수번째가 W가 아닐 때 //나눠서 짝수
                                if(currentColor != 'W') countChange++;
                            } else{ // 첫 번째가 B이고 홀수번째가 B가 아닐 때 // 나눠서 홀수
                                if (currentColor != 'B') countChange++;
                            }
                        }
                    }
                }
                System.out.printf("(%d, %d) : %d",a, b, countChange);
                System.out.println();
                //이제 바꿔야 할 B와 W의 개수를 구해야함
                minChange(countChange, min);
            }
        }
        return min[0];
    }
    public static void minChange(int x, int[] min){
        if(x < min[0])
            min[0] = x;
    }
}

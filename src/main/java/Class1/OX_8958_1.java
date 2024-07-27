package Class1;

import java.util.Scanner;

public class OX_8958_1 {
    static Scanner scan = new Scanner(System.in);
    public static void userInput(int T, String[] ox, int[] sum){
        for(int i = 0; i < T; i++){
            ox[i] = scan.next();
            sum[i] = sumCal(ox[i]);
        }
    }
    public static int sumCal(String ox){
        int size = ox.length();
        int sum = 0;
        int count = 0;
        for(int i = 0; i < size; i++){
            char c = ox.charAt(i);
            if(i != 0){
                if(c == 'O'){
                    if(ox.charAt(i-1) == 'O'){
                        count += 1;
                    } else {
                        count = 1;
                    }
                } else {
                    count = 0;
                }
            } else{
                if(c == 'O'){
                    count = 1;
                } else{
                    count = 0;
                }
            }
            sum += count;
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int T = scan.nextInt();
        scan.nextLine();
        String[] ox = new String[T];
        int[] sum = new int[T];
        userInput(T, ox, sum);
//        for(int i = 0; i < T; i++){
//            sum[i] = sumCal(ox[i]);
//        }

//        for(int i : sum){
//            System.out.println(i);
//        }

    }
}

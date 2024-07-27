package Class1;

import java.util.Scanner;

public class OX_8958_2 {
    static Scanner scan = new Scanner(System.in);
    public static void userInput(int T, String[] ox){
        for(int i = 0; i < T; i++){
            ox[i] = scan.next();
            sumCal(ox[i]);
        }
    }
    public static void sumCal(String ox){
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
                count = 1;
            }
            sum += count;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int T = scan.nextInt();
        scan.nextLine();
        String[] ox = new String[T];
        userInput(T, ox);
//        for(int i = 0; i < T; i++){
//            sum[i] = sumCal(ox[i]);
//        }

//        for(int i : sum){
//            System.out.println(i);
//        }

    }
}

package Class2;
import java.util.Arrays;
import java.util.Scanner;

public class 단어정렬_1181 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] str = new String[N];
        for(int i = 0; i < str.length; i++){
            str[i] = scan.next();
        }
        distinction(str);
        int count = duplicate(str);
        str = Arrays.copyOf(str, N - count);
        for(String s : str) System.out.println(s);

    }
    public static void distinction(String[] str){
//        int count = 0;
        for(int i = 0; i < str.length; i++){
            for(int j = i+1; j < str.length; j++) {
                int minLength = str[i].length();
                int currentStrLength = str[j].length();
//                int ch1 = 0;
//                int ch2 = 0;

                if (minLength == currentStrLength) {
                    if(str[i].equals(str[j])){
                        change(j, str.length - 1, str);
//                        count++;
                    } else {
                        change2(str, i, j, str[i], str[j]);
                    }
                } else{
                    if (minLength < currentStrLength) continue;
                    else if (minLength > currentStrLength) change(i, j, str);
                }
            }
        }
//        str = Arrays.copyOf(str, str.length - count);
    }
    public static void change(int x, int y, String[] str){
        String temp = str[x];
        str[x] = str[y];
        str[y] = temp;
    }
    public static void change2(String[] str, int min,int current,String str1, String str2){
        int c1 = 0;
        int c2 = 0;
        for (;;) {
            int ch1 = alphabet(str[min].charAt(c1));
            int ch2 = alphabet(str[current].charAt(c2));
            if (ch1 == ch2) {
                c1++;
                c2++;
            } else {
                if (ch1 < ch2) { // 이 부분 그냥 break로 수정 가능
                    break;
                } else if (ch1 > ch2) {
                    String temp = str1;
                    str[min] = str2;
                    str[current] = temp;
                    break;
                }
            }
        }
    }
    public static int alphabet(char c){
        String ap = "abcdefghijklmnopqrstuvwxyz";
        int ch1 = 0;
        for (int i = 0; i < ap.length(); i++) {
            if (c == ap.charAt(i)) {
                ch1 = i;
                break;
            }
        }
        return ch1;
    }
    public static int duplicate(String[] str){
        int count = 0;
        for(int i = 0; i < str.length - 1; i++){
            if (str[i].equals(str[i+1])){
                count++;
                for(int j = i; j < str.length - 2; j++){
                    change(j+1, j+2, str);
//                    count++;
                }
            }
        }
        if(str[str.length - 2] == str[str.length - 1]) count++;
        return count;
    }
}

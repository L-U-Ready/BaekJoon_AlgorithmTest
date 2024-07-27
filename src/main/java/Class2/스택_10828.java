package Class2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Long.parseLong;
public class 스택_10828 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Stack<Long> stack = new Stack<>();
        long N = parseLong(br.readLine());
        for(int i = 0; i < N; i++){
            String[] str = br.readLine().split(" ");
            String command = str[0];
            switch (command){
                case "push":
                    long x = parseLong(str[1]);
                    stack.push(x);
                    break;
                case "pop":
                    System.out.println(stack.isEmpty() ? "-1" : stack.pop());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty() ? "1" : "0");
                    break;
                case "top":
                    System.out.println(stack.isEmpty() ? "-1" : stack.peek());
            }
        }
    }
}
package Class2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class 덱_10866 {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        long N = parseLong(br.readLine());
        Deque<Long> deque = new LinkedList<>();
        for(int i = 0; i < N; i++){
            String[] str = br.readLine().split(" ");
            String command = str[0];

            switch (command) {
                case "push_front":
                    deque.addFirst(parseLong(str[1]));
                    break;
                case "push_back":
                    deque.addLast(parseLong(str[1]));
                    break;
                case "pop_front":
                    System.out.println(deque.isEmpty() ? "-1" : deque.pollFirst());
                    break;
                case "pop_back":
                    System.out.println(deque.isEmpty() ? "-1" : deque.pollLast());
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    System.out.println(deque.isEmpty() ? "1" : "0");
                    break;
                case "front":
                    System.out.println(deque.isEmpty() ? "-1" : deque.getFirst());
                    break;
                case "back":
                    System.out.println(deque.isEmpty() ? "-1" : deque.getLast());
                    break;
            }

        }

    }
}
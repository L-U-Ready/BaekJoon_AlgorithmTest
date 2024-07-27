package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class 큐_10845 {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        Queue<Long> queue = new LinkedList<>();
        ArrayList<Long> arrayList = new ArrayList<>();
        long N = parseLong(br.readLine());
        for(int i = 0; i < N; i++){
            String[] str = br.readLine().split(" ");
            String command = str[0];

            switch (command) {
                case "push":
                    long x = parseLong(str[1]);
                    queue.offer(x);
                    arrayList.add(x);
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        System.out.println(queue.poll());
                    } else {
                        System.out.println(queue.isEmpty() ? "-1" : queue.poll());
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? "1" : "0");
                    break;
                case "front":
                    System.out.println(queue.isEmpty() ? "-1" : queue.peek());
                    break;
                case "back":
                    System.out.println(queue.isEmpty() ? "-1" : arrayList.get(arrayList.size() -1));
                    break;
            }
        }
    }
}
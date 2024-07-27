package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.compare;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;

public class Test {
    static Scanner sc = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int Ni = sc.nextInt();

        String N = Ni + "";
        int M = sc.nextInt();
        if (Ni == 100){
            System.out.println(0);
            return;
        }
        if (M == 0){
            System.out.println(N.length());
            return;
        }

        List<Integer> buttons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            buttons.add(i);
        }
        for (int i = 0; i < M; i++) {
            buttons.remove(sc.nextInt() - i);
        }
        int length = N.length();
        int finalNum = 0;
        int count = 0;
        for (int i = 0; i < length; i++) {
            int currentDigit = Character.getNumericValue(N.charAt(i));
            int bestButton = findBestButton(buttons, currentDigit);
            finalNum = finalNum * 10 + bestButton;
            count++;
        }
        count += Math.abs(Ni - finalNum);
        System.out.println(count);
    }

    // 주어진 숫자에 대해 가장 가까운 버튼을 찾아 반환하는 함수
    private static int findBestButton(List<Integer> buttons, int target) {
        int minDiff = Integer.MAX_VALUE;
        int bestButton = buttons.get(0);
        for (int button : buttons) {
            int diff = Math.abs(button - target);
            if (diff < minDiff) {
                minDiff = diff;
                bestButton = button;
            }
        }
        return bestButton;
    }
} // 리모컨 문제

package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        while(true){
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            if (str.charAt(0) == '.') break;

            boolean check = true;
            char c;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '.'){
                    if(!stack.empty()){
                        check = false;
                        break;
                    }
                }
                else if(str.charAt(i) == '('){
                    c = '(';
                    stack.push(c);
                }

                else if (str.charAt(i) == '['){
                    c = '[';
                    stack.push(c);
                }

                else if (str.charAt(i) == ')'){
                    if(stack.empty()) {
                        check = false;
                        break;
                    }
                    else if(stack.peek() == '('){
                        stack.pop();
                    } else{
                        check = false;
                        break;
                    }
                }

                else if (str.charAt(i) == ']'){
                    if(stack.empty()) {
                        check = false;
                        break;
                    }
                    else if(stack.peek() == '['){
                        stack.pop();
                    } else{
                        check = false;
                        break;
                    }
                }
            }
            if(!check) System.out.println("no");
            else System.out.println("yes");
        }
    }
}

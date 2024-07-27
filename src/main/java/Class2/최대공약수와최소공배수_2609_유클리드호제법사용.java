package Class2;
import java.util.*;
public class 최대공약수와최소공배수_2609_유클리드호제법사용 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int div = greatestDiv(min, max);
        System.out.println(div);
        System.out.println(minimumMul(min, max, div));

    }
    public static int greatestDiv(int a, int b){
        if(a % b == 0){
            return b;
        } else return greatestDiv(b, a%b);

    }
    public static int minimumMul(int min, int max, int gcd){
        return (min*max) / gcd;
    }
}
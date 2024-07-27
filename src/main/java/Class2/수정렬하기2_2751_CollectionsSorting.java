package Class2;
import java.io.IOException;
import java.util.*;
public class 수정렬하기2_2751_CollectionsSorting {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i < N; i++){
            nums.add(sc.nextInt());
        }
        Collections.sort(nums);
        for(int i = 0; i < nums.size(); i++){
            sb.append(nums.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
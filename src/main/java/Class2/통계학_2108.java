package Class2;


import java.util.*;

public class 통계학_2108 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] nums = new int[N];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        int avg = sum / N;

        Arrays.sort(nums);
        int mid = (nums.length) / 2;
        int middle = nums[mid];
        int maxUsed = maxUsedFind(nums);
        System.out.println(avg);
        System.out.println(middle);
        System.out.println(maxUsed);
    }
    public static int maxUsedFind(int[] nums){
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1 );
        }

        int maxNum = nums[0];
        int maxCount = 0;
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            int num = entry.getKey();
            int count = entry.getValue();
            if(count > maxCount){
                maxCount = count;
                maxNum = num;
            }
        }
        return maxNum;
    }
}

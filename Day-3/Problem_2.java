import java.util.*;

class Problem_2 {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Additive identity
        int sum = 0;
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int rem = sum - k;
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
}
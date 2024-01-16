class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] <= 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        for (int j = i; j < n; j++) {
            int index = Math.abs(nums[j]) - 1;
            if (index < n && nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for (int j = i; j < n; j++) {
            if (nums[j] > 0) {
                return j + 1;
            }
        }
        return n + 1;
    }
}
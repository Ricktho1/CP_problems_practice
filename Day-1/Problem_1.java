class Problem_1 {
    public int[] twoSum(int[] nums, int target) {
        int flag = 0;
        int result[] = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    flag = 1;
                    break;
                }
            }
            if (flag == 1)
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        Problem_1 p = new Problem_1();
        int result[] = p.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
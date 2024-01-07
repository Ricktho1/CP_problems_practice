class Problem_1 {
    public int missingNumber(int[] nums) {
        int flag = 0;
        int c = 0;
        for (int i = 0; i <= nums.length; i++) {
            c = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != nums[j]) {
                    c++;
                }
            }
            if (c == nums.length) {
                flag = i;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        int expectedNums = 2;
        Problem_1 p = new Problem_1();
        int k = p.missingNumber(nums);
        assert k == expectedNums;
    }
}
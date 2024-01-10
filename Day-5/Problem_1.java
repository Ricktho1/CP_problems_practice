class Problem_1 {
    public static int[] productExceptSelf(int[] nums) {
        int product[] = new int[nums.length];
        int pro = 1, flag = 0, c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                pro = pro * nums[i];
            else {
                flag = 1;
                c++;
            }
        }
        if (c == nums.length || c >= 2)
            pro = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && flag == 1)
                product[i] = 0;
            else if (nums[i] == 0)
                product[i] = pro;
            else
                product[i] = pro / nums[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int result[] = productExceptSelf(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(result[i]);
        }
    }
}
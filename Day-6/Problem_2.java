class Problem_2 {
    public static int findPairs(int[] nums, int k) {
        int c = 0, count = 0;
        int arr[] = new int[nums.length];
        int flag;
        for (int i = 0; i < nums.length; i++) {
            flag = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] == nums[i]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                arr[count] = nums[i];
                System.out.println(arr[count]);
                count++;
            }
        }
        if (k == 0 && count != nums.length) {
            return nums.length - count;
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] + k == arr[j] || arr[i] - k == arr[j]) {
                    c++;
                }

            }
        }
        return c;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 4, 4, 3, 3, 0, 9, 2, 3 };
        int k = 3;
        int result = findPairs(nums, k);
        System.out.println("Result=" + result);
    }
}
public class Problem_2 {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int maxprof = 0;

        for (int i = 1; i < prices.length; i++) {
            maxprof = Math.max(maxprof, prices[i] - min_price);
            min_price = Math.min(prices[i], min_price);
        }

        return maxprof;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        int expectedNums = 5;
        Problem_2 p = new Problem_2();
        int k = p.maxProfit(nums);
        assert k == expectedNums;
    }
}

public class Problem_2 {
    public static int maxScore(int[] cardPoints, int k) {
        int sum = 0, count = 0;
        int front = 0;
        int rear = cardPoints.length - 1;
        if (k == cardPoints.length) {
            for (int i = 0; i < cardPoints.length; i++) {
                sum = sum + cardPoints[i];
            }
            return sum;
        }
        while (front != rear && count != k) {
            if (sum + cardPoints[front] == sum + cardPoints[rear]) {
                if (cardPoints[front + 1] > cardPoints[rear - 1]) {
                    sum = sum + cardPoints[front];
                } else if (sum + cardPoints[front + 1] < sum + cardPoints[rear - 1]) {
                    sum = sum + cardPoints[rear];
                } else {
                    sum = sum + cardPoints[rear];
                    continue;
                }
            } else if (Math.max(sum + cardPoints[front], sum + cardPoints[rear]) == sum + cardPoints[front]) {
                sum = sum + cardPoints[front];
                front++;
            } else if (Math.max(sum + cardPoints[front], sum + cardPoints[rear]) == sum + cardPoints[rear]) {
                sum = sum + cardPoints[rear];
                rear--;
            }
            count++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 1 };
        int k = 3;
        int m = maxScore(nums, k);
        System.out.println(m);
    }
}

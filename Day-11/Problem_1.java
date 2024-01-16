import java.util.ArrayList;
import java.util.Collections;

public class Problem_1
{
    public static int countPainters(ArrayList<Integer> boards, int time) {
        int n = boards.size(); 
        int painters = 1;
        int boardsPainter = 0;
        for (int i = 0; i < n; i++) {
            if (boardsPainter + boards.get(i) <= time) {
                boardsPainter += boards.get(i);
            } else {
                    painters++;
                    boardsPainter = boards.get(i);
            }
        }
        return painters;
    }

    public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {
        int low = Collections.max(boards);
        int high = boards.stream().mapToInt(Integer::intValue).sum();

        for (int time = low; time <= high; time++) {
            if (countPainters(boards, time) <= k) {
                return time;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        ArrayList<Integer> boards = new ArrayList<>();
        boards.add(10);
        boards.add(20);
        boards.add(30);
        boards.add(40);
        int k = 2;
        System.out.println(findLargestMinDistance(boards, k));
    }

}
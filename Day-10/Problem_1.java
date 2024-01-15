import java.util.ArrayList;
public class Problem_1 {
    //O(nlogn)
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if (n < m) {
            return -1; 
        }
        int low = 0, high = 0;
        for (int i = 0; i < n; i++) {
            high += arr.get(i);
            low = Math.max(low, arr.get(i));
        }
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (isValidAllocation(arr, n, m, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    public static boolean isValidAllocation(ArrayList<Integer> arr, int n, int m, int maxPages) {
        int studentsRequired = 1;
        int currentPages = 0;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) > maxPages) {
                return false;
            }

            currentPages += arr.get(i);

            if (currentPages > maxPages) {
                studentsRequired++;
                currentPages = arr.get(i);

                if (studentsRequired > m) {
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(34);
        arr.add(67);
        arr.add(90);
        int n = arr.size();
        int m = 2;
        System.out.println(findPages(arr, n, m));
    }
}
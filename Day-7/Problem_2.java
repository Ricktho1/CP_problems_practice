import java.util.*;

class Problem_2 {
    //O(nlogn)
    public static boolean isAnagram(String s, String t) {
        char s_array[]=s.toCharArray();
        char t_array[]=t.toCharArray();
        Arrays.sort(s_array);
        Arrays.sort(t_array);
        if(Arrays.equals(s_array,t_array)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean k = isAnagram(s,t);
        System.out.println(k);
    }
}
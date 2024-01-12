class Problem_1 {
    //O(n) time complexity
    public static boolean isPalindrome(String s) {
    StringBuilder sb = new StringBuilder();
    for(char ch : s.toCharArray()){
        if(Character.isLetterOrDigit(ch)){
            sb.append(Character.toLowerCase(ch));
        }
    }
    if(sb.toString().equals(sb.reverse().toString())){
    return true;
    }
    return false;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean k = isPalindrome(s);
        System.out.println(k);
    }
}
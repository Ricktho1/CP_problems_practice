class Problem_2 {
    //O(log(max(piles)) * n
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1000000000;
        
        while(left <= right){
            int mid = left + (right - left) / 2; 
            int hours=0;
            for(int i=0;i<piles.length;i++){
                int div=piles[i]/mid;
                hours+=div;
                if(piles[i]%mid!=0)
                hours++;
            }
            if(hours<=h)
            right = mid - 1;
            else 
            left = mid + 1;
        }
        return left; 
    }
    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        int k = minEatingSpeed(piles, h);
        System.out.println(k);
    }
}
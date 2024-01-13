class Problem_2 {
    public static int[] searchRange(int[] nums, int target) {
       int start=0,end=nums.length-1,c=0,endi=-1,starti=-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(nums[mid]==target){
               starti=mid;
               end=mid-1;
           }
           else if(nums[mid]<target){
               start=mid+1;
           }
           else{
               end=mid-1;
       }
       } 
       start=0;end=nums.length-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(nums[mid]==target){
               endi=mid;
               start=mid+1;
           }
           else if(nums[mid]<target){
               start=mid+1;
           }
           else{
               end=mid-1;
       } 
    }
    int result[]=new int[2];
    result[0]=starti;
    result[1]=endi;
    return result;
       }
       public static void main(String[] args) {
        int nums[] = { 5,7,7,8,8,10 };
        int target=8;
        int result[]=searchRange(nums,target);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
       }
}
class Problem_2{
    //O(m+n) time and O(1) space
    public static boolean searchMatrix(int[][] a, int target) {
        int n=a.length,m=a[0].length;
        int i=0,j=m-1;
        while(i<n && j>=0){
            if(a[i][j]==target) return true;
        
        if(target<a[i][j]){
            j--;
        }
        else{
            i++;
        }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(searchMatrix(matrix, target));
    }
}
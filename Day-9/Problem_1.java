class Problem_1 {
    //O(log(m*n)) time and O(m*n) space
    public static boolean searchMatrix(int[][] matrix, int target) {
        int arr[]=new int[matrix.length*matrix[0].length],c=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                    arr[c]=matrix[i][j];
                    c++;
            }
        }
        int left=0,right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target)
            return true;
            else if(arr[mid]<target)
            left=mid+1;
            else
            right=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(searchMatrix(matrix, target));
    }
}
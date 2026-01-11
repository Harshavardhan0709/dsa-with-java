public class DiagonalSum {
    public static int diagonalSum(int matrix[][]){


        int sum=0; 
        //Brute force 
        //Time complexity:O(n^2)
        //Space complexity:O(1)
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int arr2[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(diagonalSum(arr));
        System.out.println(diagonalSum(arr2));
    }
}

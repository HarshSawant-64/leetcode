class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int rowIndex = 0; rowIndex< mat.length; rowIndex++){
            for (int colIndex = 0; colIndex<mat.length; colIndex++){
                if (rowIndex==colIndex){
                    sum+=mat[rowIndex][colIndex];

                }else if (rowIndex+colIndex == mat.length-1){
                    sum += mat[rowIndex][colIndex];
                }
            }
        }
        return sum;
    }
}
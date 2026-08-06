class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int r = 0; r < n/2; r++){
            int[] temp = matrix[r];
            matrix[r] = matrix[n-1-r];
            matrix[n-1-r] = temp;
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
}

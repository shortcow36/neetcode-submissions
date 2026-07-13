class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            HashSet<Character> dupR = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if (board[i][j] == '.') 
                    continue;
                if(dupR.contains(board[i][j])){
                    return false;
                }
                else{
                    dupR.add(board[i][j]);
                }
            } 
        }
        for(int j = 0; j < 9; j++){
            HashSet<Character> dupC = new HashSet<>();
            for(int i = 0; i < 9; i++){
                if (board[i][j] == '.') 
                    continue;
                if(dupC.contains(board[i][j])){
                    return false;
                }
                else{
                    dupC.add(board[i][j]);
                }
            } 
        }
        for(int squa = 0; squa < 9; squa++){
            HashSet<Character> squ = new HashSet<>();
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    int row = (squa / 3) * 3 + i;
                    int col = (squa % 3) * 3 + j;
                    if(board[row][col] == '.')
                        continue;
                    if(squ.contains(board[row][col])){
                        return false;
                    }
                    else{
                        squ.add(board[row][col]);
                    }
                }
                
                
            } 
        }

        return true;
    }
}

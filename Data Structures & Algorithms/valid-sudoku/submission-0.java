class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row=new HashSet[9];
        HashSet<Character>[] column=new HashSet[9];
        HashSet<Character>[] box=new HashSet[9];
        for(int i1=0;i1<9;i1++)
        {
            row[i1]=new HashSet<>();
            column[i1]=new HashSet<>();
            box[i1]=new HashSet<>();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    continue;
                }
                if(row[i].contains(board[i][j]) || 
                column[j].contains(board[i][j]) ||
                box[(i/3)*3+(j/3)].contains(board[i][j]))
                {
                       return false;
                }
                row[i].add(board[i][j]);
                column[j].add(board[i][j]);
                box[(i/3)*3+(j/3)].add(board[i][j]);
            }
        }
        return true;
    }
}

class Solution {
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        boolean[][] visited=new boolean[row][col];
        
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(board[i][j] == word.charAt(0) && search(i,j,0,board,word,visited))
                    return true;
            }
        }
        return false;
    }
    
    public boolean search(int i, int j, int indx, char[][]board, String word, boolean[][] visited)
    {
        if(word.length() == indx)
            return true;
       
        
        if(i<0 || j<0 || i>=board.length || j>= board[0].length ||board[i][j]!=word.charAt(indx) || visited[i][j] == true)
            return false;
        
        visited[i][j] =true;
        if(search(i+1,j,indx+1,board,word,visited) || search(i-1,j,indx+1,board,word,visited) ||
          search(i,j+1,indx+1,board,word,visited) || search(i,j-1,indx+1,board,word,visited))
            return true;
        visited[i][j] =false;
        return false;
    }
}
    
   
class Solution {
  
    public List<List<String>> solveNQueens(int n) {
     char [][] board = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                board[i][j]='.';
        }
        List<List<String>> res = new ArrayList<List<String>>();
        int leftr[]= new int[n];
        int upperDiagonal[]= new int[2*n-1];
        int lowerDiagonal[]= new int[2*n-1];
        solve(0,board,res,leftr,lowerDiagonal,upperDiagonal);
        return res;
    }
    
    public void solve(int col,char[][]board,List<List<String>> res,int leftr[],int lDiagonal[], int uDiagonal[])
    {
        if(col == board.length)
        {
            res.add(construct(board));
            return;
        }
        
        for(int row=0;row<board.length;row++){
            if(leftr[row] == 0 && lDiagonal[row+col] ==0 && uDiagonal[board.length-1+col-row] == 0)
            {
                board[row][col] ='Q';
                leftr[row]=1;
                lDiagonal[row+col]=1;
                uDiagonal[board.length-1+col-row]=1;
                solve(col+1,board,res,leftr,lDiagonal,uDiagonal);
                board[row][col]='.';
                leftr[row]=0;
                lDiagonal[row+col]=0;
                uDiagonal[board.length-1+col-row]=0;
            }
        }
    }
    
    public List<String> construct(char[][]board)
    {
        List<String> res = new LinkedList<String>();
        for(int i=0;i<board.length;i++)
        {
            String s= new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
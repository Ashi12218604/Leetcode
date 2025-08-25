class Solution {
    private boolean func(char[][] board, int i, int j, String w, int k)
    {
        if(k==w.length())
        {
            return true;
        }
        if(i<0||j<0||i>=board.length||j>=board[0].length||w.charAt(k)!=board[i][j])
        {
            return false;
        }
        char temp=board[i][j];
        board[i][j]=' ';
        boolean ans=func(board, i+1, j,w,k+1)||func(board, i-1, j,w,k+1)||func(board, i, j+1,w,k+1)||func(board, i, j-1,w,k+1);
        board[i][j]=temp;
        return ans;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(func(board, i, j, word,0))
                    {
                        return true;
                    }
                }
            }
        }
       return false; 
    }
}
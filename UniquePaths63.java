public class UniquePaths63 {
    // You are given an m*n integer array grid.
    // A robot starts at the top left corner and aims to reach the botton right corenr
    // The robot can move only down or right at any point.
    // obstrcaes are represented by 1,and free spaces are represent by 0;

    // retun the number of unique paths the robot can take to reach
    // the botton right corner

    public static int uPWO(int[][]oG){
        int m=oG.length;
        int n=oG[0].length;
        if(oG[0][0]==1||oG[m-1][n-1]==1){
            return 0;
        }
        int[][]dp=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(oG[i][j]==1){
                    dp[i][j]=0;
                }else{
                    if(i>0)dp[i][j]+=dp[i-1][j];
                    if(j>0)dp[i][j]+=dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        int[][]oG={
            {0,0,0},
            {0,1,0},
            {0,0,0}
        };
        System.out.println("The Number of Unique paths are :"+uPWO(oG));
    }
    
}

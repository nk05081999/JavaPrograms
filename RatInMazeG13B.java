import java.util.ArrayList;
import java.util.List;

public class RatInMazeG13B {
    private static void fP(int[][]maze,int x,int y,int n,boolean[][]vist,String path,List<String>paths){
        if(x==n-1&&y==n-1){
            paths.add(path);
            return;
        }
        int[]dx={1,0,-1,0};
        int[]dy={0,1,0,-1};
        char[]move={'D','R','U','L'};
        for(int i=0;i<4;i++){
            int newX=x+dx[i];
            int newY=y+dy[i];
            if(isSafe(newX, newY, n, maze, vist)){
                vist[newX][newY]=true;
                fP(maze, newX, newY, n, vist, path+move[i], paths);
                vist[newX][newY]=false;

            }
        }
    }
    private static boolean isSafe(int x,int y,int n,int[][]maze,boolean[][]vist){
        return x>=0&&y>=0&&x<n&&y<n&&maze[x][y]==1&&!vist[x][y];
    }
    public static List<String>FPIM(int[][]maze){
        List<String>paths=new ArrayList<>();
        int n=maze.length;
        if(maze[0][0]==0||maze[n-1][n-1]==0)return paths;
        boolean[][]vist=new boolean[n][n];
        vist[0][0]=true;
        fP(maze, 0, 0, n, vist, "", paths);
        return paths;
    }
    public static void main(String[] args) {
        int[][]maze={
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,1},
            {1,1,1,1}
        };
        List<String>res=FPIM(maze);
        System.out.println("All Possible paths :"+res);
    }
    
}

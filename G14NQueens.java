import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class G14NQueens {
    public static List<List<String>>sNQ(int n){
        List<List<String>>res=new ArrayList<>();
        char[][]brd=new char[n][n];
        for(char[]r:brd){
            Arrays.fill(r, '.');
        }
        sol(brd, 0, res);
        return res;


    }
    private static void sol(char[][]brd,int r,List<List<String>>res){
        if(r==brd.length){
            res.add(cB(brd));
            return;

        }
        for(int col=0;col<brd.length;col++){
            if(isSaf(brd, r, col)){
                brd[r][col]='Q';
                sol(brd, r+1, res);
                brd[r][col]='.';
            }
        }

    }

    private static List<String>cB(char[][]brd){
        List<String>res=new ArrayList<>();
        for(char[]r:brd){
            res.add(new String(r));
        }
        return res;
    }

    private static boolean isSaf(char[][]brd,int r,int col){
        int n=brd.length;
        for(int i=0;i<r;i++){
            if(brd[i][col]=='Q')return false;
        }
        for(int i=r,j=col;i>=0&&j>=0;i--,j--){
            if(brd[i][j]=='Q')return false;
        }
        for(int i=r,j=col;i>=0&&j<n;i--,j++){
            if(brd[i][j]=='Q')return false;
        }
        return true;    
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(sNQ(n));
    }
    
}

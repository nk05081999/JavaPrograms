public class TowersOfhanaoie {
    // you are given three rods     and n disks.
    // stacked on a rod in incresing order. of size     from top to bottom.
    // only one disc can be moved at a time
    // A larger disc cannot be placed on smaller disc.
    // you can use only 3 rods.

    // T(N)=2T(N-1)+1
    // Base Case=T(1)=1
    // Time Complexity: O(2^n)
    // Space Complexity: O(n)

    public static void solveHa(int n,char sou,char aux,char dest){
        if(n==1){
            System.out.println("Move disk 1 from "+sou+" to" +dest);
            return;
        }
        solveHa(n-1, sou, dest, aux);
        System.out.println("Move Disk "+n+" from "+sou+" to "+dest);
        solveHa(n-1, aux, sou, dest);
        
    }
    public static void main(String[] args) {
        int n=3;
        solveHa(n, 'A', 'B', 'C');
    }
    
}

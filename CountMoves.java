public class CountMoves {
    public static int count(int n){
        if(n==1) return 1;
        return 2*count(n-1)+1;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("Total Moves "+count(n));
    }

    
}

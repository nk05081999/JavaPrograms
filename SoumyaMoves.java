public class SoumyaMoves {
    public static int countMov(int n){
        if(n==1) return 1;
        return 2*countMov(n-1)+1;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println("Total Moves "+countMov(n));
    }
    
}

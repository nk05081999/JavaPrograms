public class G14MovesCount {
    public static int countmove(int n){
        if(n==1)return 1;
        return 2*countmove(n-1)+1;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(countmove(n));
    }
    
}

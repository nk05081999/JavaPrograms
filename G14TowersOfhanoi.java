public class G14TowersOfhanoi {
    public static void sh(int n,char source,char aux,char dest){
        if(n==1){
            System.out.println("move disk 1 from "+source+" to "+dest);
            return;
        }
        sh(n-1, source, dest, aux);
        System.out.println("Move disk "+n+" from "+source+" to "+dest);
        sh(n-1, aux, source, dest);
    

    }
    public static void main(String[] args) {
        int n=3;
        sh(n, 'A', 'B', 'C');
    }
    
}

public class TowersOFHanoi {
    public static void solve(int n,char source,char rod,char desi){
        if(n==1){
            System.out.println("Move Disk 1 from "+source+" to "+desi);
            return;
        }
        solve(n-1, source, desi, rod);
        System.out.println("Move Disk "+n+" from "+source+"to "+desi);
        solve(n-1, rod, source, desi);

    }
    public static void main(String[] args) {
        int n=3;
        solve(n, 'A', 'B', 'C');
    }

    
}

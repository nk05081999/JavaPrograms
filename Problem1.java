import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        int n=50;
        System.out.println("prime numbers upto 50 are "+sieve(n));
        
    }
    public static List<Integer> sieve(int n){{
        boolean[]isPrime=new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int p=2;p*p<=n;p++){
            if(isPrime[p]){
                for(int multiple=p*p;multiple<=n;multiple+=p){
                    isPrime[multiple]=false;
                }
            }
        }
        List<Integer>primes=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }
        return primes;
    }

    }
    
}

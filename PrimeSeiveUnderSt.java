public class PrimeSeiveUnderSt {
    public static void main(String[] args) {
        // What is Prime Sieve?
        // The prime Sieve is an algo to efficiently generate all the prime 
        // numbers up to a specified limit N.

        // Steps:
        // Create a boolean array isPrime[] where each index represent 
        // if the number us prime

        // initially mark all the numbers from 2 to N
        // as true

        // Starting from the first prime(2) mark all multiples of 2 as false;

        // Move to teh next number that is still mark true,
        // and mark its all multiples as false;

        // Continue this until you reach square root of N.
    }
    
}

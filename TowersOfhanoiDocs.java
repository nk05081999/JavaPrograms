public class TowersOfhanoiDocs {
    // You are given three rods and N dics stacked on one rod
    //  in increasing order of size from top to buttom.
    // Set of rules:

    // only one disc can be moved at a time.
    //A larger disc cannot be placed on a smaller disc
    // you can use only 3 rods.


    // Mathematical Analyisis:

    // Recursive Formula: T(N)=2t(N-1)+1
    // Base Case: T(1)=1
    // Time Complexity: O(2^n)
    // Space Complexity: O(n)


    // Algorithm:

    // Move N-1 disks from source to Auxiliry (use destination as helper.)
    // Move Nth disk source to desination

    // Move N-1 disks from Aux to desi(source as helper,.)
    
}

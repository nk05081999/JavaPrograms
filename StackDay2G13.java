public class StackDay2G13 {
    // Given an circular array of integers,we need to find the next greater
    // element for each element.
    // if no such element exits return -1.


    // input=  num={1,2,1}
    // output={2,-1,-1 }


    // input nums={3,8,4,1,2};
    // out: {8,-1,8,2,3}

    // Approach :Monotonic Stack:
    // A monotonic decresing stack helps efficiently find the next greater element
    // we use stack to track the eleents that needs greater value



    // Optimized way:

    // use a stack:
    // store indices of an element in monotonic decresing order
    // process rthe array twice


    // process elemets twice(2N loop)
    // iterate 2*n times
    // use i%n to acces the actual index in the array



    
    
}

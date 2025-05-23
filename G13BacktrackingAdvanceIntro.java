public class G13BacktrackingAdvanceIntro {
    // Recursion and Backtracing are powerfull tech used to solve
    //  complex problems on matrice and grids.


    // given m*n grid of characters  and string word , return true if word 
    // exits in the grid.
    // The word can be constructed from letters in adjacent cells(hor and ver)
    // The same letter cell cannot be used more than once.

    // Approach:
    // Use DFS(Depth first search) with backtracking.
    // Strat from the each cell,try to match the first letter of the word.
    // Explore in all four possible directions.
    // if the characters iof the word matches, return true.
    // if the path is incorrect backtrack and mark all the cell as unvisted
    
}

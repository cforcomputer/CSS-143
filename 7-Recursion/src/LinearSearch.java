/**
 * LinearSearch implements the LinearSearch algorithm by
 * overriding the methods in the parent class
 * SearchAlgorithm
 * @author Patrick O'Brien
 * @version 11/7/2019
 * */

public class LinearSearch extends SearchAlgorithm {

    /**
     * The iterative version of the LinearSearch algorithm
     * Iterates through the entire array containing longwords.txt until
     * it finds the matching word.
     *
     * @param array = array containing longwords.txt names
     * @param wordToFind = the target word to locate in the array
     * @throws ItemNotFoundException = if item not found
     * */
    @Override
    public int search(String[] array, String wordToFind) throws ItemNotFoundException {
        // n is the array length
        int n = array.length;
        // iterate through the array
        for (int i = 0; i < n; i++) {
            incrementCount(); // record the comparisons
            // if the word is found, return i (+1 for proper index location)
            if (array[i].equals(wordToFind))
                return i + 1;
        }
        // if word not found, reset the count and throw exception
        resetCount();
        throw new ItemNotFoundException("Item was not found for LinearSearch (iterative)");
    }

    /**
     * The recursive version of the linear search algorithm
     * @param array = array containing longwords.txt names
     * @param wordToFind = the target word to locate in the array
     *
     * @return the recSearch for recursion
     * @throws ItemNotFoundException = if item not found
     * */

    @Override
    public int recSearch(String[] array, String wordToFind) throws ItemNotFoundException {
        incrementCount(); // record the number of comparisons

        int i = 0;
        if (i >= array.length) { // Base case - not found | wip always true, var not necessary
            throw new ItemNotFoundException("The word was not found using LinearSearch (recursive)");
        }
        if(array[i].equals(wordToFind)) { // Base case - found
            return i; // return the index
        }
        // Recursive case
        return recSearch(array, wordToFind);
    }
}

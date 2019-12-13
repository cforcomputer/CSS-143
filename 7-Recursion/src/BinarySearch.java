/**
 * BinarySearch class extends parent class
 * SearchAlgorithm and overrides two methods
 * search and recSearch to implement a BinarySearch
 * algorithm
 * @author Patrick O'Brien
 * @version 11/7/2019
 * */

public class BinarySearch extends SearchAlgorithm{

    /**
     * search method is for running through the array and delivering
     * the final result. Since longwords.txt is already sorted, we do not
     * need to sort the array before continuing with the binary search.
     * search class calls the recursive search class
     * recSearch to return the appropriate result.
     *
     * @param array = the array input holding words in longwords.txt
     * @param wordToFind = the target word to locate in the array
     * @throws ItemNotFoundException = if item not found
     * */
    @Override
    public int search(String[] array, String wordToFind) throws ItemNotFoundException {
        // local variables
        int lowIndex = 0;
        int highIndex = array.length - 1;
        int midIndex;

        // search through each half of total array index
        while (lowIndex <= highIndex) {
            incrementCount();
            midIndex = (lowIndex + highIndex) / 2;

            if (array[midIndex].compareTo(wordToFind) < 0) {
                lowIndex = midIndex + 1;
            } else if (array[midIndex].compareTo(wordToFind) > 0) {
                highIndex = midIndex - 1;
            } else {
                return midIndex;
            }
        }
        // if word not found, throw exception
        throw new ItemNotFoundException(" Item was not found for BinarySearch (iterative)");
    }

    /**
     * Takes the values from the search method. Overrides the SearchAlgorithm
     * class method recSearch to perform a binary search on the string
     * array array containing the contents from longwords.txt
     *
     * @param array = the array input holding words in longwords.txt
     * @param wordToFind = the target word to locate in the array
     * @throws ItemNotFoundException = if item not found
     * */
    @Override
    public int recSearch(String[] array, String wordToFind) throws ItemNotFoundException {
        int lowIndex = 0;
        int highIndex = array.length;
        int midIndex = highIndex / 2;

        if(highIndex < lowIndex){
            // if the word was not found, throw item not found exception
            resetCount();
            throw new ItemNotFoundException("Item was not found in recSearch (recursive)");
        } else if(wordToFind.equals(array[midIndex])) {
            incrementCount();
            return midIndex;
        } else if(wordToFind.compareTo(array[midIndex]) < 0) {
            String[] split = new String[midIndex];
            System.arraycopy(array, 0, split, 0, midIndex);
            return recSearch(split,wordToFind);
        } else {
            String[] split = new String[highIndex - midIndex - 1];

            for(int i = 0; i < highIndex - midIndex - 1; i++){
                split[i] = array[midIndex + i + 1];
            }
            return recSearch(split, wordToFind);
        }
    }
}
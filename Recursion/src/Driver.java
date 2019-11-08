/**
 * @author Patrick O'Brien
 * @version 11/7/2019
 *
 * Driver class for FindFile
 * */

public class Driver {

    /**
     * Main class
     *
     * */
    public static void main(String[] args) {
        String targetFile = "longwords.txt";// target file name, replace it with yours
        String pathToSearch = "C:\\Users\\Pat\\Desktop\\CSS-143\\Recursion";//starting directory
        FindFile finder = new FindFile(10);//maximum files to find- 10

        try {
            System.out.println("Searching for " + targetFile);
            //searching for file
            finder.directorySearch(targetFile, pathToSearch);

        } catch (Exception e) {
            //displaying exception details
            System.out.println(e.getMessage());
        }

        // Printing the results
        System.out.println("Results: ");
        System.out.println("Count: " + finder.getCount());
        String[] files = finder.getFiles();

        for (int i = 0; i < finder.getCount(); i++) {
            System.out.println(files[i]);
        }
    }
}
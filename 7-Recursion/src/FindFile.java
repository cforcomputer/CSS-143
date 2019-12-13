import java.io.File;

/**
 * FindFile class, searches directory and all child directories
 * for a file with the specified name.
 *
 * @author Patrick O'Brien
 * @version 11/4/2019
 *
 * Stepwise Refinement Step N
 * while (more directories to examine) {
 *     Get a directory
 *
 *     If a file, check for match
 *
 *     If a directory,
 *      for (each file and directory in the directory) {
 *
 *          if a file, check for a match and return if found
 *
 *          if a directory, save this in a structure
 *      }
 * }
 *  return if not found
 * */

public class FindFile {

    private int maxFiles;
    private int count;
    private String[] foundLocations;

    /**
     * constructor FindFile
     * @param maxFiles- maximum number of files to find
     */
    public FindFile(int maxFiles) {
        this.maxFiles = maxFiles;
        count = 0;
        foundLocations = new String[maxFiles];//initializing array
    }

    /**
     * getCount method
     * @return the count of files found
     */
    public int getCount() {
        return count;
    }

    /**
     * getFiles method
     * @return the list of found file paths
     */
    public String[] getFiles() {
        return foundLocations;
    }

    /**
     * method to search recursively for a target file starting from a given path
     * @throws Exception - if starting directory is not valid, or if maximum files are found
     */
    void directorySearch(String target, String dirName) throws Exception {
        File dir = new File(dirName);//creating a file

        // throw arg exception if not valid directory
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException(
                    "Given directory is not valid.");
        }

        // listing files in the path
        String[] list = dir.list();
        if (list != null) {
            // looping through all files
            // checking to see if the current file is in the target file
            for (String s : list) {
                // checking to see if the current file is in the target file
                if (s.equals(target)) {
                    // adding to the found file paths array
                    foundLocations[count] = dirName + "\\" + target;
                    count++;

                    if (count == maxFiles) {
                        // throwing exception as maximum limit reached
                        throw new Exception("Maximum number of files found!");
                    }
                } else {
                    // creating a file object
                    File aFile = new File(dirName + "\\" + s);

                    if (aFile.isDirectory()) {
                        // recursively repeat if a directory exists
                        directorySearch(target, aFile.getAbsolutePath());
                    }
                }
            }
        }
    }
}
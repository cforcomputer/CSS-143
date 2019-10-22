/**
 * @author Patrick O'Brien
 * @version 10-17-2019
 *
 * ArrayList-like Interface
 * Without using the ArrayList built into java
 * */

public class ArrayList {

    private Object[] list = new Object[150]; // Data structures should objects of the class object --> objectList
    private int counter;

    /**
     * This class inserts the specified object at the index
     * @param obj = The ArrayList list
     * @param index = the input index value for the ArrayList list
     * */
    public void insert(Object obj, int index)
    {
        if (obj == null || index < 0) // if the index is out of bounds or the object is not initialized
        {
            System.exit(0);
            //throw IndexOutOfBoundsException;
        }
        else if (index > list.length) // if the index is larger than the list
        {
            increaseArraySize(index);
        }
        else if (index > counter)
        {
            this.counter = index;

            // shift to right
            if (size() - index >= 0) System.arraycopy(list, index, list, index + 1, size() - index);
            list[index] = obj;
            counter++;
        }
        if (counter - index >= 0) System.arraycopy(list, index, list, index + 1, counter - index);
        list[index] = obj;
        counter++;
    }

    /**
     * Method is called when the array size must be increased to fit the new object
     * @param index = the required index from the method calling increaseArraySize
     * */
    private void increaseArraySize(int index)
    {
        Object[] resizedList = new Object[index+5]; // +5 in case new indexes are added, reducing the need to call
        // copy all the old elements over to the new list
        System.arraycopy(list, 0, resizedList, 0, list.length);
        list = resizedList; // overwrite old list with the new resized list
        counter = index;
        // shift elements
        if (size() >= 0) System.arraycopy(list, 0, list, 1, size());
        counter++;
    }

    /**
     * Remove and return the object at the specified index
     * @param index = the specified index to remove
     * */
    public Object remove(int index)
    {
        if (index < 0 || list[index] == null)
        {
            System.exit(0); // end program (WIP, should be smooth close)
        }
        Object val = list[index]; // val is now storing the value that was at the index location
        // remove the value, then shift the elements to the left, closing the space
        if (size() - 1 >= 0) System.arraycopy(list, 1, list, 0, size() - 1);
        list[counter] = null; // assign the last value to null to clear it
        counter--; // reduce counter by 1 since we've reduced the total by 1
        return val; // return the object that was removed
    }

    /**
     * Return the size of the arrayList
     * */
    public int size()
    {
        return list.length;
    }

    /**
     * Return the string of all the contents of the list?
     * */
    @Override
    public String toString()
    {
        String val = ""; // declare and init string to return
        for (int i = 0; i < size(); i++)
        {
            if (list[i] == null) // the value is equal to null, it can be skipped
            {
                continue; //skip ?unnecessary
            }
            else
            {
                val = list[i] + ", "; // Concat with string
            }
        }
        return val; //return the string
    }

    /**
     * Return true or false dependent on whether the list is empty or not
     * */
    public boolean isEmpty()
    {
        int null_count = 0;
        int count = 0;
// WIP isEmpty - ignore
//        if (list == null) // if the list is equal to null
//        {
//            return true; // the list is empty
//        }
//        // Iterate through the array and check to make sure every index is empty of an object value
//        for (int i = 0; i < size(); i++)
//        {
//            if (null_count == list.length) // if all the values are null, then
//            {
//                return false;
//            }
//            if (list[i] == null) // record the number of null
//            {
//                null_count++;
//            }
//        }
//        return true;

        // Takes two counts and checks them to see if the array is empty or not
        for (int i = 0; i < size(); i++)
        {
            if (list[i] == null)
            {
                null_count++;
            }
            else
            {
                count++;
            }
        }
        return count <= 0;
    }

    /**
     * Method checks to see if the object is present in the list. If the object is present, then return the
     * value of the index where it is located.
     * @return the value at the current index
     * @param a = the arrayList whose index is being checked
     * */
    public int indexOf(Object a)
    {
        int val = 0;  // initialize the return value

        // Iterate through the array until the value is located
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] == a) // if the value is equal
            {
                val = i; // val is equal to the value of the index
            }
        }
        return val; // return the index
    }

    /**
     * Overrides the original equal method
     * check if object param is valid
     * check size and elements if it is, checks to see if the arrays are equivalent
     * @return whether or not the sizes and elements in the data structure are equal.
     * @param a = the ArrayList input
     * */
    @Override
    public boolean equals(Object a)
    {
        if (a instanceof ArrayList)
        {
            ArrayList arrayComp = (ArrayList) a; // casting a to be an arraylist

            if (size() == arrayComp.size())
            {
                for (Object o : list) // testing, probably a logic error
                {
                    return o == arrayComp.list;
                }
            }
        }
        return false;
    }

    /**
     * @return returns the object at the specified index
     * Object is the ArrayList.
     * @param index = the index in the ArrayList to be checked.
     * */
    public Object get(int index)
    {
        if (!(index > list.length) && !(index < list.length) )
        {
            System.exit(0); //temp
        }
        return list[index];
    }
}

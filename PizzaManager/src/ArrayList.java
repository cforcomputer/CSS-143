/**
 * This ArrayList class will have an array of Objects that will be able to be
 * modified by inserting and removing elements by specifying the Object and
 * an index. When inserting, all elements after the index will be shifted to
 * the right to make room for that new element, and when removing, all elements
 * to the right of the index will be shifted to left to close the gap.
 *
 * There will be a toString to print out the results, and an equals() method
 * to check if two ArrayList objects are equivalent.
 *
 * @author Patrick O'Brien
 * @version 12/4/2019
 */

public class ArrayList<TBA extends Comparable> {
    //instance vars
    private Object[] arrayList = new Object[100]; //arrayList to hold all objects
    private int numElements = 0; //numElements  to store number of elements in array


    /**
     * dynamic resize method is a way to exapnd
     * the array if there are more things added
     * than the original size of the array
     *
     * @param index = int
     */
    public Object[] resize(int index) {
        Object[] temp = new Object[index];
        //create a temporary array with new size that's larger than previous
        // goes for the length of data
        //copy over elements
        System.arraycopy(arrayList, 0, temp, 0, arrayList.length);
        return temp;
        //return the object array
    }

    /**
     * compareTo uses the comparable interface to
     * compare objects in the arraylist
     *
     * @param o = ArrayList with TBA
     */
    public int compareTo(ArrayList<TBA> o) {
        //null check and instanceof check
        //if fail, throw exception & break
        if (o == null) {
            throw new RuntimeException("BAD params ):");
        }
        //if true, cast input param to ArrayList type

        //compareto checking equivalence
        return Integer.compare(this.numElements, o.numElements);
    }

    /**
     * Insert method is what allows you to insert elements to arraylist
     * and uses a dynamic resize
     *
     * @param in
     * @param spot
     */
    public void insert(TBA in, int spot) {
        //store the input TBA ("object") as a variable

        //null check and if negative index
        if (in == null || spot < 0) {
            throw new PizzaException("Bad params");
        }
        //if the highest spot is out of bounds, RESIZE the array!!!
        if (spot >= arrayList.length) {
            arrayList = resize(spot + 1);
        }

        if (arrayList[spot] == null) {
            arrayList[spot] = in;

        } else {
            if (numElements + 1 >= arrayList.length) {
                arrayList = resize(arrayList.length + 1);
            }
            shiftRight(spot); // shifting right at the param index
            arrayList[spot] = in;
            numElements++; // updates the highest point
        }


        if (spot > numElements) {
            numElements = spot;
        }
        //if param is larger, change numElements to the new highest spot



    }

    /**
     * remove method allows you to remove elements of the arraylist
     * and then return the thing you removed.
     * it also changes the number of elements in the array
     *
     * @param index
     * @return TBA
     */
    public TBA remove(int index) {
        if (arrayList[index] == null) { //null check for objectat index and if negative index
            throw new PizzaException("bad params");
        }

        TBA retVal = (TBA) arrayList[index]; //cast the input to a TBA type

        shiftLeft(index);
        //shift left at index
        arrayList[numElements] = null;
        //sets last spot in list to null
        numElements--;
        //subtract one from number of elements
        return retVal;
    }

    /**
     * shiftleft method called in the remove method
     *
     * @param start
     */
    private void shiftLeft(int start) {
        //iterate over array
        for (int first = start; first < numElements; first++) {
            arrayList[first] = (TBA) arrayList[first + 1];
            //shift left

        }
    }

    /*
     * shiftright method called in the insert method
     *
     * @param int
     */
    private void shiftRight(int start) {
        //iterate over array
        //shift right
        if (numElements + 1 - start >= 0)
            System.arraycopy(arrayList, start, arrayList, start + 1, numElements + 1 - start);
    }

    /**
     * size method returns the size of the array
     * goes through the array and increments a counter to
     * keep track
     */
    public int size() {
        int count = 0;
        //iterate over array
        for (int i = 0; i <= numElements; i++) {
            //if it's not null
            if (arrayList[i] != null) {
                //add a counter
                count++;
            }
        }
        return count; //return size
    }

    /**
     * toString() method puts all elements in a string to be printed
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     *
     * @return String
     */
    public String toString() {
        StringBuilder retVal = new StringBuilder();
        //declare a return value String type

        for (Object o : arrayList) {
            //iterate over array
            if (o == null) {
                //null check
                continue;
            } else {
                retVal.append(o).append("\n ");
                //if not null add this to return value
            }
        }
        return retVal.toString(); //return string
    }

    /**
     * isempty returns a boolean telling if the array is empty or not
     *
     * @return boolean
     */
    public boolean isEmpty() {
        for (int first = 0; first < numElements; first++)
            //iterate over aray

            if ((TBA) arrayList[first] != null) {
                //check null
                return false;
            }
        return true; //else case
    }

    /**
     * swap method is used in the quick sorts, where you
     * have to swap indices to sort arrays
     *
     * @param idx1 = int
     * @param idx2 = int
     */
    public void swap(int idx1, int idx2) {
        TBA temp = (TBA) arrayList[idx1];
        // sets a temp variable to first object


        arrayList[idx1] = arrayList[idx2];
        //swap
        arrayList[idx2] = temp;
    }

    /**
     * equals method compares to objects to see if theyre equal
     *
     * @param o = Object to be compared
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object o) {

        if (o instanceof ArrayList) {
            ArrayList newAL = (ArrayList) o;
            if (this.size() == (newAL.size())) {
                for (int i = 0; i <= size(); i++) {
                    //iterate over array
                    return (TBA) this.arrayList[i] == (TBA) newAL.arrayList[i];
                }
            }
        }
        return false;
    }


    /**
     * index of returns the index of an object that is contained in the array
     *
     * @param value = TBA
     */
    public int indexOf(TBA value) {
        //null check
        if (value == null) {
            throw new PizzaException();
        }
        //iterate over the array
        for (int i = 0; i < numElements; i++) {

            if (arrayList[i].equals(value)) {

                return i;
            }
        }
        return -1;
        //else case
    }


    /**
     * object at method returns object at specified
     * index in the array
     *
     * @param index = int
     */
    public Object objectAt(int index) {
        if (index > numElements) { //if index is more than number of the elements, error
            throw new IllegalArgumentException();
        }
        //return the object at index if in bounds
        return arrayList[index];
    }
}

/**
 * @author Patrick O'Brien
 * @version 10-17-2019
 *
 * Queue Interface (FIFO)
 * */

public class Stack {

    private Object[] stack = new Object[150]; // Object array to represent the stack
    private int counter = 0; // store the number of indexes
    /**
     * Add a value to the top of the stack
     * @param s = the object list from the
     * */
    public void push(Object s)
    {
        if (s == null)
        {
            System.exit(0); // temp, should throw error
        }
        if (counter < stack.length)
        {
            stack[counter++] = s; // add object to array
        }
        else
        {
            stack = increaseStackSize();
        }
    }

    /**
     * This method resizes the stack so that it can fit new objects.
     * @return the resized object array
     * */
    private Object[] increaseStackSize()
    {
        Object[] resizedStack = new Object[counter];
        System.arraycopy(stack, 0, resizedStack, 0, stack.length); // copy over elements
        return resizedStack; // return the larger array
    }

    /**
     * Remove a value from the top of the stack
     * */
    public Object pop()
    {
        return stack[counter--]; // return the last element
    }

    /**
     * Return the number of indexes in the stack
     * @return the number of elements
     * */
    public int size()
    {
        return counter; // counter keeps track of how many items have been added
    }

    /**
     * A stack should print from the last item added to the stack --> to the first value added to the stack
     * 11 12 12 14 --> print 14 12 12 11
     * @return The string that displays the elements present in the stack
     * */
    @Override
    public String toString()
    {
        StringBuilder val = new StringBuilder(); // initialize string value for return
        // Use StringBuilder to add each element in the list to the string
        for (int i = 0; i < counter; i++)
        {
            val.append(stack[i]).append(", ");
        }
        return val.toString();
    }

    /**
     * Checks to see if two stacks are equal.
     * @return true or false; true if equal, false if not
     * */
    public boolean equals(Object s)
    {
        if (s instanceof Stack)
        {
            Stack stackComp = (Stack) s; // cast

            if (this.size() == (stackComp.size()))
            {
                for (int i = 0; i <= size(); i++) // does not loop
                {
                    return this.stack[i] == stackComp.stack[i];
                }
            }
        }
        return false; // if already null, return false
    }

    /**
     * Checks to see if the stack is empty or not.
     * @return true or false; true if empty, false if not
     * */
    public boolean isEmpty()
    {
        for (int i = 0; i < counter; i++)
        {
            if (stack[i] != null) // if there are no null elements, then the array is not empty
            {
                return false; // so return false
            }
        }
        return true; // otherwise the stack is empty
    }
}

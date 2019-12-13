/**
 * @author Patrick O'Brien
 * @version 10-17-2019
 *
 * Queue Interface (FIFO)
 *
 * */

public class Queue {

    private Object[] queue = new Object[150]; // create the object list to represent the queue
    private int counter; // stores the index number
    /**
     * Add a value to the start of the queue
     * @param q = The queue ObjectList
     * */
    public void enqueue(Object q)
    {
        if (q == null)
        {
            System.exit(0); // temp
        }
        if (counter < queue.length)
        {
            queue[counter++] = q;
        }
        else
        {
            queue = increaseQueueSize();
            queue[counter] = q;
        }
    }

    /**
     * If the enqueue method is used too many times, this method will be called to allocate new space.
     * */
    private Object[] increaseQueueSize()
    {
        Object[] resizedQueue = new Object[counter];
        // Copies old array to the new array
        System.arraycopy(queue, 0, resizedQueue, 0, queue.length);
        return resizedQueue;
    }
    /**
     * Remove a value from the end of the queue
     * @return the value that was de-queued
     * */
    public Object dequeue()
    {
        Object val = queue[0]; // start of the queue (FIFO)
        if (counter >= 0) System.arraycopy(queue, 1, queue, 0, counter); // array copy to shift left
        return val;
    }

    /**
     * Return the size of the array (number of elements)
     * */
    public int size()
    {
        return this.counter; // returns recorded number of index
    }

    /**
     * Overrides the regular toString() class
     * Shows the contents of the data structure in "natural ordering" - for a queue this means top on down or
     * front to back. 11 12 12 14 15 --> 11 12 12 14 15
     * */
    @Override
    public String toString()
    {
        StringBuilder val = new StringBuilder(); // create string of all objects in queue using StringBuilder
        for (int i = 0; i < counter; i++)
        {
            val.append(queue[i]).append(", ");
        }
        return val.toString();
    }

    /**
     * Checks to see if the queue is empty or not
     * @return false if the queue is not empty, true if it is
     * */
    public boolean isEmpty()
    {
        for (int i = 0; i < counter; i++) // iterate through the array
        {
            if (queue[i] != null) // if one of the values are equal to null
            {
                return false; // then the queue is not empty
            }
        }
        return true; // otherwise it is empty
    }

    /**
     * This method checks to see if two queues are equal
     * @return boolean, true if equal, false if not
     * @param q = the queue
     * */
    @Override
    public boolean equals(Object q)
    {
        if (q instanceof Queue)
        {
            Queue queueComp = (Queue) q; // cast

            if (this.size() == (queueComp.size()))
            {
                for (int i = 0; i <= size(); i++){ // statement does not loop, fix
                    //to see if all the elements are the same
                    //if they are all the same return true
                    return this.queue[i] == queueComp.queue[i]; //if they aren't all the same, return false
                }
            }
        }
        return false;
    }
}

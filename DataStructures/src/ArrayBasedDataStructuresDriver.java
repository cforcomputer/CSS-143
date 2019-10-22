import javax.sound.midi.SysexMessage;

/**
 * @author Patrick O'Brien
 * @version 10-17-2019
 *
 * Driver Class (sample base)
 * */

public class ArrayBasedDataStructuresDriver
{
	/**
	 * This method runs the test cases for the different classes
	 * */
	public static void main(String[] args)
	{
		System.out.println("\nStack Tests: \n");
		stackTests();
		System.out.println("--------- End Stack tests ---------");
		System.out.println("\nQueue Tests: \n");
		queueTests();
		System.out.println("--------- End Queue tests ---------");
		System.out.println("\nArrayList Tests: \n");
		arrayListTests();
		System.out.println("--------- End ArrayList tests ---------\n");
	}

	/**
	 * This method runs test cases on the ArrayList class
	 * */
	private static void arrayListTests()
	{
		try {

			//todo: make more tests here
			ArrayList a = new ArrayList();
			ArrayList b = new ArrayList(); // second ArrayList for comparison checks

			// Insert object at specified index
			a.insert('B', 0);
			a.insert('a', 0);
			a.insert('t', 1);

			System.out.println(a.toString()); // print the arrayList

			System.out.println(a.size()); // size method testing

			System.out.println(a.get(4)); // get testing

			// IndexOf Testing
			System.out.println(a.indexOf('a'));
			System.out.println(a.indexOf('z'));


			while (a.isEmpty()) // while array is not empty
			{
				System.out.println("Removing: ");
				System.out.println(a.remove(0));
			}

			// Double insert at index 0 test
			b.insert('n', 0);
			b.insert('t', 0);
			b.insert('l', 1);

			System.out.println(b.toString());
			System.out.println();

			while (b.isEmpty()) // while the array is not empty
			{
				System.out.println("Removing: ");
				System.out.println(b.remove(0));
			}
		}
		catch (Exception e)
		{
			System.out.println("Problem with arrayListTests a.remove");
		}
	}

	/**
	 * This method runs test cases on the Queue class
	 * */
	private static void queueTests()
	{
		//todo: make more tests here
		Queue a = new Queue();
		Queue b = new Queue(); // comparison queue

		// testing the enqueue method
		a.enqueue('B');
		a.enqueue('a');
		a.enqueue('t');

		System.out.println(a.size());
//		// Testing the dequeue method
		a.dequeue();
		a.dequeue();

		// allocating comp array
		b.enqueue('B');
		b.enqueue('a');
		b.enqueue('t');

		// checking if equal works
		System.out.println(a.equals(b)); // pass -- comment earlier dequeue for checks

		System.out.println(a.toString());

		while(!a.isEmpty()) // while the queue is not empty
		{
			System.out.println(a.dequeue());
		}
	}

	/**
	 * This method runs test cases on the Stack class
	 * */
	private static void stackTests()
	{
		//todo: make more tests here
		Stack a = new Stack();
		Stack b = new Stack();

		System.out.println(a.size());
		// Push the objects to the stack
		a.push('B');
		a.push('a');
		a.push('t');

		// allocating values to comparison stack
		b.push('B');
		b.push('a');
		b.push('t');

		// equal method check
		System.out.println(a.equals(b));


//		System.out.println("Testing pop functionality \n");
		// Testing pop
		a.pop();
		a.pop();
		a.push('l');
		System.out.println(a.toString());

		while(!a.isEmpty()) // while not empty
		{
			System.out.println(a.pop()); // pop remaining values
		}
	}


}

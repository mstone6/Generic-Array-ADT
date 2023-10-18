package week3;

import week3.ArrayADT.GenericArray;

/** Generic Array ADT Implementation
 *@author Mushka Stone
 *Part 2: Testing and Demonstrating the ADT

Create a Java class named ArrayDemo with a main method.
In the main method, demonstrate the functionality of the GenericArray class by performing the following tasks:
    Create an instance of GenericArray to store integers.
    Populate the array with a few integer values.
    Retrieve and print elements from the array.
    Modify the array by setting new values.
    Check the size and emptiness of the array.
Additionally, create an instance of GenericArray to store strings, and demonstrate its 
functionality using similar operations as in the previous step.
 
 */
public class ArrayDemo {
	public static void main(String[]args) {
		 GenericArray<Integer> genericArray = new GenericArray<Integer>(5);
		
		 genericArray.set(0, 3);
		 genericArray.set(1, 15);
		 genericArray.set(2, 32);
		 genericArray.set(3, 54);
		 genericArray.set(4, 76);
		 
		System.out.println("This is the list of integers found in the array: ");
		
		//Now lets retrieve and print elements.
		for(int i = 0; i< genericArray.size(); i++ ) {
			System.out.println(genericArray.get(i));
		
		}
		
		//Now lets modify the array
		genericArray.set(0, 46);
		genericArray.set(2, 29);
		
		//Now lets check the size of the array
		if(genericArray.isEmpty()) {
			System.out.println("\nThe array is empty.");
		}else {
			System.out.println("\nThe size of the array is: " + genericArray.size());
		}
		
		
		GenericArray<String> stringArray = new GenericArray<String>(4);
		
		stringArray.set(0, "Bob");
		stringArray.set(1, "Sam");
		stringArray.set(2, "Charlie");
		stringArray.set(3, "Fred");

		//Now lets retrieve and print elements.
		for(int i = 0; i< stringArray.size(); i++ ) {
			System.out.println(stringArray.get(i));
		
		}
		
		//Now lets modify the array
		stringArray.set(2, "Kennedy");
		stringArray.set(3, "Robert");
		
		//Now lets check the size of the array
		if(stringArray.isEmpty()) {
			System.out.println("\nThe array is empty.");
		}else {
			System.out.println("\nThe size of the array is: " + genericArray.size());
		}
		
		
	}
}
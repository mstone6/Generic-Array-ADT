package week3;

/**
 * @author Mushka Stone
 * Part 1: Implementing the Generic Array ADT

Create a Java class named GenericArray<T> that represents a generic array ADT. The class should have the following methods:
    GenericArray(int size): A constructor that initializes the array with a given size.
    T get(int index): Returns the element at the specified index.
    void set(int index, T value): Sets the element at the specified index to the given value.
    int size(): Returns the current size of the array.
    boolean isEmpty(): Returns true if the array is empty, false otherwise.
Implement the GenericArray class to store elements of any data type using Java generics.
 
 */

public class ArrayADT {
	
	public static class GenericArray<T> {
		//This class represents a generic array adt
		
		//Lets create an object arrayto store the generic
		private Object[] array;
		
		public GenericArray(int size) {
			//This is a constructor class that initializes the array with a given size.
			this.array = new Object[size];
		}
		
		public T get(int index) {
			//Returns the element at the specified index.
			if(index < 0 || index >= array.length) {
				throw new IndexOutOfBoundsException("The index is out of bounds: " + index);
			}
				return (T)array[index];
		}
		
		public void set(int index, T value) {
			//Sets the element at the specified index to the given value.
			if(index <0 || index >= array.length) {
			throw new IndexOutOfBoundsException("The index is out of bounds: " + index);
			}
			array[index] = value;
		}
		
		public int size() {
			//Returns the current size of the array.
			return array.length;
		}
		
		public boolean isEmpty() {
			//Returns true if the array is empty, false otherwise.
			if(array.length == 0) {
				return true;
			}else {
				return false;
			}
		}
	}
	
	
		
		
	}



/**Assignment: Generic Array ADT Implementation


Part 3: Submission

Commit and push your code to a GitHub repository. 
In your GitHub repository, create a README.md file that explains how to compile and run your code.
Submit the GitHub repository link on Canvas. In the Canvas submission, provide any additional details or comments you would like to relay regarding your code.
Only GitHub submissions will be accepted from this point forward. 
***/
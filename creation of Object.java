
// Java program to Illustrate Creation of Object
// Method 1 : Using new keyword

/*
class Astik {

	// Declaring and initializing string
	// Custom input string
	String name = "GeeksForGeeks";

	// Main driver method
	public static void main(String[] args)
	{
		// As usual and most generic used we will
		// be creating object of class inside main()
		// using new keyword
		Astik obj = new Astik();

		// Print and display the object
		System.out.println(obj.name);
	}
}
*/

// Java program to Illustrate Creation of Object
// Method 2 : Using new Instance

/*
class Astik {

	// Declaring and initializing string
	String name = "GeeksForGeeks";

	// Main driver method
	public static void main(String[] args)
	{
		// Try block to check for exceptions
		try {

			Class cls = Class.forName("Astik");

			// Creating object of main class
			// using instance method
			Astik obj = (Astik)cls.newInstance();

			// Print and display
			System.out.println(obj.name);
		}

		// Catch block to handle the exceptions

		// Catch block 1
		// Handling ClassNotFound Exception
		catch (ClassNotFoundException e) {

			// Display the exception along with line number
			// using printStacktrace() method
			e.printStackTrace();
		}

		// Catch block 2
		// Handling InstantiationException
		catch (InstantiationException e) {

			e.printStackTrace();
		}

		// Catch block 2
		// Handling IllegalAccessException
		catch (IllegalAccessException e) {

			e.printStackTrace();
		}
	}
}
*/

// Java program to Illustrate Creation of Object
// Method 3 : Using clone() method

// Main class
// Implementing Cloneable interface

/*
class Astik implements Cloneable {

	// Method 1
	@Override
	protected Object clone()
		throws CloneNotSupportedException
	{
		// Super() keyword refers to parent class
		return super.clone();
	}

	// Declaring and initializing string
	String name = "GeeksForGeeks";

	// Method 2
	// main driver method
	public static void main(String[] args)
	{
		Astik obj1 = new Astik();

		// Try block to check for exceptions
		try {

			// Using the clone() method
			Astik obj2 = (Astik)obj1.clone();

			// Print and display the main class object
			// as created above
			System.out.println(obj2.name);
		}

		// Catch block to handle the exceptions
		catch (CloneNotSupportedException e) {

			// Display the exception
			// using printStackTrace() method
			e.printStackTrace();
		}
	}
}
*/

// METHOD 4 : Deserialization
// Java Program Illustrate Serializing an Object

/*
// Importing input output classes
import java.io.*;

// Main class
// Implementing the Serializable interface
class Astik implements Serializable {

	// Member variables
	private String name;
	Astik(String name)
	{
		// This keyword refers to current object itself
		this.name = name;
	}

	// Main driver method
	public static void main(String[] args)
	{
		// Try block to check for exceptions
		try {
			// Creating object of class in main() method
			Astik d = new Astik("GeeksForGeeks");

			FileOutputStream f
				= new FileOutputStream("file.txt");
			ObjectOutputStream oos
				= new ObjectOutputStream(f);
			oos.writeObject(d);
			oos.close();

			// Freeing up memory resources
			f.close();
		}

		// Catch block to handle the exceptiona
		catch (Exception e) {
			// Display the exception along with line number
			// using printStacktrace() method
			e.printStackTrace();
		}
	}
}
*/


//METHOD 5: 

// Java program to illustrate creation of Object
// using newInstance() method of Constructor class

// Importing required classes from java.lang package
import java.lang.reflect.*;

// Main class
class Astik {

	// Member variables of this class
	private String name;

	// Constructor of this class
	Astik() {}

	// Method 1
	// To set name ofthe string
	public void setName(String name)
	{
		// This method refers to current object itself
		this.name = name;
	}

	// Main driver method
	public static void main(String[] args)
	{
		// Try block to check for exceptions
		try {
			Constructor<Astik> constructor
				= Astik.class.getDeclaredConstructor();

			Astik r = constructor.newInstance();

			// Custom passing
			r.setName("GeeksForGeeks");
			System.out.println(r.name);
		}

		// Catch block to handle the exceptions
		catch (Exception e) {

			// Display the exception on console
			// using printStackTrace() method
			e.printStackTrace();
		}
	}
}




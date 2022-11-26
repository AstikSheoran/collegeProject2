// Compile Time polymorphism

// Method Overloading

// Java program to demonstrate the working of method
// overloading by changing the number of parameters

// Use one Prototypes at a time, comment rest


public class MethodOverloading {
	
	// 1 parameter
	void show(int num1)
	{
		System.out.println("number 1 : " + num1);
	}

	// 2 parameter
	void show(int num1, int num2)
	{
		System.out.println("number 1 : " + num1
						+ " number 2 : " + num2);
	}

	public static void main(String[] args)
	{
		MethodOverloading obj = new MethodOverloading();
	
		// 1st show function
		obj.show(3);
	
		// 2nd show function
		obj.show(4, 5);
	}
}


// operator overloading
// Java program to demonstrate the
// working of operator overloading

public class GFG {

	// function for adding two integers
	void add(int a, int b)
	{
		int sum = a + b;
		System.out.println(" Addition of two integer :"
						+ sum);
	}

	// function for concatenating two strings
	void add(String s1, String s2)
	{
		String con_str = s1 + s2;
		System.out.println("Concatenated strings :"
						+ con_str);
	}

	public static void main(String args[])
	{
		GFG obj = new GFG();
	
		// addition of two numbers
		obj.add(10, 10);
	
		// concatenation of two string
		obj.add("Operator ", " overloading ");
	}
}


// RUN TIME polymorphism

class Bike{  
  void run(){System.out.println("running");}  
}  
class Splendor extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    Bike b = new Splendor();//upcasting  
    b.run();  
  }  
} 
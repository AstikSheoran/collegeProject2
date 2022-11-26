// Java program to illustrate the

// 1 ) concept of single inheritance

import java.io.*;
import java.lang.*;
import java.util.*;

class one {
	public void print_Astik()
	{
		System.out.println("Astik");
	}
}

class two extends one {
	public void print_Sheoran() { System.out.println("Sheoran"); }
}
// Driver class
public class inheritance {
	public static void main(String[] args)
	{
		two g = new two();
		g.print_Astik();
		g.print_Sheoran();
		g.print_Astik();
	}
}

// Java program to illustrate the

// 2 ) concept of Multilevel inheritance

import java.io.*;
import java.lang.*;
import java.util.*;

class one {
	public void print_geek()
	{
		System.out.println("Astik");
	}
}

class two extends one {
	public void print_Sheoran() { System.out.println("Sheoran"); }
}

class three extends two {
	public void print_Astik()
	{
		System.out.println("Astik");
	}
}

// Drived class
public class inhertance {
	public static void main(String[] args)
	{
		three g = new three();
		g.print_Astik();
		g.print_Sheoran();
		g.print_Astik();
	}
}

// Java program to illustrate the

// 3 ) concept of Hierarchical inheritance

class A {
	public void print_A() { System.out.println("Class A"); }
}

class B extends A {
	public void print_B() { System.out.println("Class B"); }
}

class C extends A {
	public void print_C() { System.out.println("Class C"); }
}

class D extends A {
	public void print_D() { System.out.println("Class D"); }
}

// Driver Class
public class inheritance {
	public static void main(String[] args)
	{
		B obj_B = new B();
		obj_B.print_A();
		obj_B.print_B();

		C obj_C = new C();
		obj_C.print_A();
		obj_C.print_C();

		D obj_D = new D();
		obj_D.print_A();
		obj_D.print_D();
	}
}

// Java program to illustrate the

// 4 ) concept of Multiple inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

interface one {
	public void print_Astik();
}

interface two {
	public void print_Sheoran();
}

interface three extends one, two {
	public void print_Astik();
}
class child implements three {
	@Override public void print_Astik()
	{
		System.out.println("Astik");
	}

	public void print_Sheoran() { System.out.println("Sheoran"); }
}

// Drived class
public class inheritance {
	public static void main(String[] args)
	{
		child c = new child();
		c.print_Astik();
		c.print_Sheoran();
		c.print_Astik();
	}
}

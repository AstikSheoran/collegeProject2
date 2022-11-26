// Use one Prototypes at a time, comment rest
//Default prototype

class prototypes
{
	public static void main(String[] args)
	{
		System.out.println("Main Method by Astik");
	}
}


// Variants of string array arguments - 1
class prototypes
{
	public static void main(String []args)
	{
		System.out.println("Main Method Astik");
	}
}

// variant - 2
class prototypes
{
	public static void main(String args[])
	{
		System.out.println("Main Method by Astik");
	}
}

// args or anything
class prototypes{

	public static void main(String[] prototypes){
		System.out.println("Instead of args we have written by Astik");
	}
}

//Java code-> using Var-Args instead of the array
//please note these code may not run in gfg IDE, better run it on other IDEs e.g, eclipse
class prototypes{
	
	final public static void main(String... args){
		System.out.println("Var-args main method Astik");
	}
}

// final modifier
class prototypes
{
	public static void main(final String[] args)
	{
		System.out.println("Main Method Astik");
	}
}


// synchronized keyword
//Java code having Synchronized main method
//please note these code may not run in gfg IDE, better run it on other IDEs e.g, eclipse
class prototypes
{
	public synchronized static void main(String[] args)
	{
		System.out.println("Main Method");
	}
}

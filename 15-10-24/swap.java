class swap // using different ways (5 ways)
{
	public static void main(String ar[])
	{
		int a=10,b=20;
	
	System.out.println("numbers Before Swap"+ "  " + a + " " + b);

	LOGIC 1- using third variable temp
	int temp=a;
	a=b;
	b=temp;
	
	System.out.println("numbers After Swap"+ "  " + a + " " + b);
	
	// LOGIC 2- without using third variable use + , - operator
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("numbers After Swap"+ "  " + a + " " + b); 
	
	//LOGIC 3- without using third variable use * , / operator
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("numbers After Swap"+ "  " + a + " " + b); 

	//LOGIC 4- without using third variable use bitwise operator
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("numbers After Swap"+ "  " + a + " " + b); 
	
	//LOGIC 5- in one line Statment(IMP FOR TIME COMPLEXITY)
	b=a+b-(a=b);
	System.out.println("numbers After Swap"+ "  " + a + " " + b);
	
	}
}
	
class stringreverse // reverse a string using three different methods
{
	public static void main(String ar[])
	{
		String str="ABCD";
		String rev=" ";
		
		LOGIC 1- using concadnation + operator
		int len= str.length();
		for(int i=len-1; i>=0; i--)
		{
			rev= rev+str.charAt(i);
		}
		System.out.println("reverse string is:" + rev); 
	
	
		//LOGIC 2- convert into array
		char a[]= str.tocharArray();
		for(int i=a.length-1; i>=0; i--)
		{
			rev= rev+a[i];
		}
		System.out.println("reverse string is:" + rev);
	
	}
}
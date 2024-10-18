class arrayEx7 // print elements present on even position and odd position
{
	public static void main(String ar[])
	{
		int arr[]={1,2,3,4,5};
			
		System.out.println("for even position");
		for(int i=0; i<arr.length; i++)
		{
			
			if(i % 2 == 0)
			{
				
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("for odd position");
		for(int i=0; i<arr.length; i++)
		{	
			if(i % 3 == 1)
			{	
				System.out.println(arr[i]);
			}
		}
	}
}
	
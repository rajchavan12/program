class arrayEx6 // print all elements in reverse order
{
	public static void main(String ar[])
	{
		int arr[]= {1,2,3,4,5};
		
		System.out.println("print element in forward order");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("print elements in reverse order");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
	
	}
}
	
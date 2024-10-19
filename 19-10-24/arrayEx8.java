class arrayEx8 // print the largest element
{
	public static void main(String ar[])
	{
		int arr[]={25,11,7,75,56};
		
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]> max)
			{
				max=arr[i];
			}
		}
		System.out.println("max is:" + max);
		
	}
}
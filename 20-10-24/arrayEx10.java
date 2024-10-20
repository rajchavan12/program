class arrayEx10 //sum of all elements in array
{
	public static void main(String ar[])
	{
		int arr[]={1,2,3,4,5};
		
		int sum=0;
		 
		for(int i=0; i<arr.length; i++)
		{
			sum= arr[i] + sum;
		}
		System.out.println("sum is :" +  sum);
	}
}
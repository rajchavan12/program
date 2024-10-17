class arrayEx5 //duplicate element print
{
	public static void main(String ar[])
	{
		int arr[] = {1,2,3,4,2,7,8,8,3};

		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}
}
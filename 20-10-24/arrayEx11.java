class arrayEx11 //elements in ascending order
{
	public static void main(String ar[])
	{
		int arr[]={5,2,8,7,1};
		
		int temp=0;
		int i,j;
		
		System.out.println("elements before sorted");
		for(i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("elements after sorted");
		for( i=0; i<arr.length; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
		}
		for(i=0; i<arr.length; i++)
		{
		
			System.out.println(arr[i]);
		}
	}
}
class arrayEx12 //descending order
{
	public static void main(String ar[])
	{
		int arr[]={5,2,8,7,1};
		int i,j;
		int temp=0;
		
		System.out.println("before sorting");
		for(i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("after sorting");
		
		for(i=0; i<arr.length; i++)
		{
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
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
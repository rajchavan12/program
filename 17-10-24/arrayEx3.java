class arrayEx3  //copy
{
	public static void main(String ar[])
	{
		int first[]= {2,3,4,1,5,7,9};
		int second[]= new int[7];
		
	
		for(int i=0; i<7; i++)
		{
			
			second[i]=first[i];
		}
		
		for(int i=0; i<7; i++)
		{
			System.out.println(second[i]);
		}
	}
}
				
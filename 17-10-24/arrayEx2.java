import java.util.*; //check index
class arrayEx2
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter n");
		int n,i;
		n=sc.nextInt();
		
		int ex[]=new int[n];
		
		System.out.println("enter the elements");
		
		
		for(i=0; i<n; i++)
		{
			ex[i]=sc.nextInt();

		}
		
		for(i=0; i<n; i++)
		{
			System.out.println(ex[i]);

		}
		
		System.out.println("enter the elements for the search");
		int x= sc.nextInt();
		
		
		for(i=0; i<ex.length; i++)
		{
			if(x==ex[i])
			{	
				System.out.println("the selected element is :" + i);
			}
		}
	}
}
			
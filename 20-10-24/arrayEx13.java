import java.util.Arrays;
class arrayEx13 //sort with sort method
{
	public static void main(String ar[])
	{
		int arr[]={2,4,67,4,7,9,5,7,77,65};
		
		Arrays.sort(arr);

		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
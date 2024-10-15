import java.util.*;
class palindrome // check palindrome or not
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter the number");
		num=sc.nextInt();
		
		int org_num=num;
	
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		
		if(org_num == rev)
		{
			System.out.println(org_num + "is palindrome");
		}
		else
		{
			System.out.println(org_num + "is not palindrome");
		}
	}
}
		
import java.util.*;
class reverse // reverse a number in 3 different ways
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter number");
		num=sc.nextInt();
		
		LOGIC 1- using algorithm
		
		int rev=0; 
		while(num!=0) //1234
		{
			rev= rev * 10 + num % 10; // rev=0,, 0+1234%10 = 0+4 = 4, 40+3 = 43, 430+2 = 432, 4320+1 = 4321 the final is 			4321

			num= num/10;
		}
		System.out.println("the reverse number is:" + rev); 
		
		//LOGIC 2- using string buffer class method
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		StringBuffer rev= sb.reverse();
		System.out.println("the reverse number is:" + rev);
	
	
		//LOGIC 3- using string Builder class method
		StringBuilder sb= new StringBuilder();
		sb.append(num);
		StringBuilder rev= sb.reverse();
		System.out.println("the reverse number is:" + rev);
	}
}
		
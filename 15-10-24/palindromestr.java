class palindromestr // palindrome string
{
	public static void main(String ar[])
	{
		String str="rajkumar";
		String org_str=str;
		String rev=" ";
		
		int len=str.length();
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(org_str == rev)
		{
			System.out.println(str + "is palinddrome");
		}
		else
		{
			System.out.println(str + "is not palinddrome");
		}
	}
}
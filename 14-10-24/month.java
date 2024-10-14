class month 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("enter the number");
		number=sc.nextInt();
		switch(number)
		{
		case 1:System.out.println("month is January");
			break;
		case 2:System.out.println("month is februry");
			break;
		case 3:System.out.println("month is march");
			break;			
		case 4:System.out.println("month is April");
			break;
		case 5:System.out.println("month is may");
			break;
		case 6:System.out.println("month is Jun");
			break;
		case 7:System.out.println("month is July");
			break;
		case 8:System.out.println("month is August");
			break;
		case 9:System.out.println("month is september");
			break;
		case 10:System.out.println("month is October");
			break;
		case 11:System.out.println("month is November");
			break;
		case 12:System.out.println("month is December");
			break;
		default:System.out.println("invalid number");
			break;
	
		}
	}
}
		

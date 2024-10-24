class missing_arr
{
    public static void main(String ar[])
    {
        int a[]={1,2,3,5};

        int sum1=0;
        int sum2=0;

        for(int i=0; i<a.length; i++)
        {
            sum1 = sum1 + a[i];
        }
        System.out.println("sum is" + sum1);

        for(int i=1; i<=5; i++)
        {
            sum2 = sum2 + i;
        }
        System.out.println("sum is" + sum2);

        System.out.println("missing element is" + (sum2 - sum1));


    }
}
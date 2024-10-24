class sum_arry
{
    public static void main(String ar[]) // using for each loop
    {
        int a[]={2,4,3,5,6,8,4,6,90};

        int sum=0;

        for(int k:a)
        {
            sum = sum + k;
        }
        System.out.println(sum);
    }
}
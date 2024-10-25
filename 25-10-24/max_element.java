class max_element
{
    public static void main(String ar[])
    {
        int a[] = {20,34,54,5,656,35,6,7};

        int max = a[0];

        for(int i=0; i<a.length; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }

        }
        System.out.println("Maximum no is" + max);
    }
}
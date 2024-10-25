class min_element
{
    public static void main(String ar[])
    {
        int a[] = {20,34,54,5,656,35,6,7};

        int min = a[0];

        for(int i=0; i<a.length; i++)
        {
            if(min > a[i])
            {
                min = a[i];
            }

        }
        System.out.println("Minimum no is" + min);
    }
}
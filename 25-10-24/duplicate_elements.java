class duplicate_elements
{
    public static void main(String ar[])
    {
        int a[] = { 2,34,5,3,3,5,5,4,4,67,55,55};

        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i] == a[j])
                {
                    System.out.println("Duplicate elements are" + a[j]);
                }
            }
        }
    }
}
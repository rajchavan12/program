class copy
{
    public static void main(String args[])
    {
        int a[]={1,2,4,5,3,9,6,2,46,6};
        System.out.println(a.length);

        int b[]=new int[7];
        int i;

        for(i=0; i<a.length; i++)
        {
            b[i]=a[i];
        }
        a=b;
        System.out.println(a.length);
    }
}
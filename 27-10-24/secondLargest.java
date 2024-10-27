class secondLargest
{

    public static void secondLargest(int arr[])
    {
        int size = arr.length;

        if(size < 2)
        {
            System.out.println("invalid array");
            return;
        }

        Arrays.sort(arr);

        for(int i=size-1; i>=0; i--)
        {
            if(arr[i] != arr[size-1])
            {
                System.out.println("Second largest num is" + arr[i]);
                return;
            }
        }
        System.out.println("no largest present");
    }
    public static void main(String ar[])
    {
        int arr[] = {1,4,5,35,35,34};
        secondLargest(arr);
    }
}
class thirdLargest1
{

    public static void thirdLargest(int arr[])
    {
        int size = arr.length;

        if(size < 3)
        {
            System.out.println("invalid array");
            return;
        }

        Arrays.sort(arr);

        for(int i=size-1; i>=0; i--)
        {
            if(arr[i] != arr[size-2])
            {
                System.out.println("third largest num is" + arr[i]);
                return;
            }
        }
        System.out.println("no largest present");
    }
    public static void main(String ar[])
    {
        int arr[] = {1,4,5,35,35,34};
        thirdLargest(arr);
    }
}
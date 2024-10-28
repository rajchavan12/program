class rotation //rotation of array
{
    public static void main(String ar[])
    {
        int arr[] = {3,9,7,8,12,6,15,5,4,10};

        int temp = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        for(int x:arr)
        {
            System.out.println(x + ",");
            System.out.println(" ");
        }
    }
}
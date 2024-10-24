import java.util.*;
class arr_equal
{
    private static Object arrays;

    public static void main(String ar[])
    {
        int a1[]={1,2,3,4,5};
        int a2[]={1,2,3,4,5};

        boolean status = arrays.equals(a1);

        if(status == true)
        {
            System.out.println("array is equal");
        }
        else
        {
            System.out.println("array not equal");
        }
    }
}
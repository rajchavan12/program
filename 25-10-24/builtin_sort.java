import java.util.Arrays;
import java.util.Collections;

class builtin_sort
{
    public static void main(String ar[])
    {
        int a[] = {20,40,10,30,50};
        
        Object arrays;
        System.out.println("arrays before sort" + Arrays.toString(a));
       Arrays.parallelSort(a);
       Arrays.sort(a);
        System.out.println("arrays After sort" + Arrays.toString(a));

        
    }
}
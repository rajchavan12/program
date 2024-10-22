

import java.util.*;

class Stackexample
{
    public static void main(String ar[])
    {
        Stack <String> x=new ArrayList<>();

        x.add("rajkumar");
        x.add("aniket");
        x.add("malesh");
        x.add("amit");
        x.add("ajit");

        for(int i=0;i<x.size();i++)
        {
            System.out.println("the name is "+x.get(i));
        }
        

        
    }
}
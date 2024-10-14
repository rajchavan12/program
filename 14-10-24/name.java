
import java.util.Scanner;

public class name
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("what is your name");
        String name;
        name=sc.nextLine();
        System.out.println("welcome mr/ms: " + name);
    }
}
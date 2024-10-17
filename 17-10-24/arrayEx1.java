import java.util.Scanner;

class arrayEx1
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,number;
        System.out.println("enter n");
        n=sc.nextInt();
        int input[]=new int[n];

        for(int i=0; i<n; i++)
        {
            input[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            System.out.println(input[i]);
        }

    }
}
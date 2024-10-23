class gcd 
{
    static int gcd(int m,int n)
    {
        for (int i=0; i<n; i++)
        {
            if(m>n)
            {
                return m=m-n;
            }
            else 
            {
                return n=n-m;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        System.out.println(gcd(35,56));
    }
}


class mailcheck
{
    public static void main(String ar[])
    {
        String str = "rajkumarchavan.entc.nbnstic@gmail.com";

        int i = str.indexOf("@");

        String Uname=str.substring(0,i);
        String Domain=str.substring((i+1), str.length());

        System.out.println("Username" + " " + Uname);
        System.out.println("Domain" + " " + Domain);

        System.out.println(Domain.startsWith("gmail"));

        int j=Domain.indexOf(".");

        String name = Domain.substring(0,j);

        System.out.println(name.equals("gmail"));


    }
}
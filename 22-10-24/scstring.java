public class scstring
{
    public static void main(String args[])
    {
        String str="rajkumarchavan@gmail.com";
        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        System.out.println("username is: " + uname);
        String domain=str.substring(i+1,str.length());
        System.out.println("domain is:" + domain);
        



    }
}
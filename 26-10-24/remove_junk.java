class remove_junk
{
    public static void main(String ar[])
    {
        String str="rajkumar chavan231423542$%#%%@#$%@##$";

        String s=str.replaceAll("[^a-zA-Z0-9]" , " "); // these line prints the only elements betn [a-z A-Z 0-9] these
        System.out.println(s);
    }
}
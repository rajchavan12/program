class remove_whitespaces
{
    public static void main(String ar[])
    {
        String str = "NBN sinhgad technical institute campus pune";

        System.out.println("beffore removing spaces");

        System.out.println(str);

        String s = str.replaceAll("\\s" , "");

        System.out.println("After removing spaces");
        
        System.out.println(s);
    }
}
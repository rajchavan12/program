class character_occurance
{
    public static void main(String ar[])
    {
        String str = "java programing oops java";

        int total_count = str.length();

        int total_count_without = str.replaceAll("a" , "").length();

        int count = total_count - total_count_without;

        System.out.println("the number of letter a repeted in above string is " + count);
    }
}
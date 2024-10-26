import java.util.*;
class count_words
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("entr the string");
        String str = sc.nextLine();

        int count = 1;

        for(int i=0; i<str.length()-1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i+1) != ' '))
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
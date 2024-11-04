// given a string, The task is to count the number of alphabets present in the string.

class Solution
{
    static int Count(String S)
    {
        // code here
        int count = 0;
        for (int i = 0; i < S.length(); i++)
        {
            if (Character.isLetter(S.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }
}


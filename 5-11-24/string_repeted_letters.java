import java.util.HashMap;

class string_repeted_letters  //Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.
{
    static char nonRepeatingChar(String s) 
    {
        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char c : s.toCharArray())
        {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray())
        {
            if (frequency.get(c) == 1) 
            {
                return c;
            }
        }

        return '$';
    }
}

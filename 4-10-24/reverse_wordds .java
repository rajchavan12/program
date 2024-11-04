class reverse_wordds
 {
    String reverseWords(String str) 
    {
        String[] words = str.split("\\.");
        
        StringBuilder rev = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) 
        {
            rev.append(words[i]);
            if (i != 0) 
            {
                rev.append(".");
            }
        }
        
        return rev.toString();
    }
}
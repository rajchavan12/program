class swap_using_list //swap in one line approach
{
    static List<Integer> get(int a,int b)
    {
        // code here
        
        List<Integer> output = new ArrayList<>();
        b= a + b - (a = b);
        output.add(a);
        output.add(b);
        
        return output;
    
    }
}
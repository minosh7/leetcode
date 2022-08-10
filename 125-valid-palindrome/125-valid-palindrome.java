class Solution {
    public boolean isPalindrome(String s) {
    String fixedstring = "";
        
    for (char c : s.toCharArray())
    {
        if(Character.isDigit(c) || Character.isLetter(c))
        {
            fixedstring = fixedstring + c;
        }
    }
    
        
    fixedstring = fixedstring.toLowerCase();
        
    int l_pointer = 0;
    int r_pointer = fixedstring.length()-1;
        
    while (l_pointer <= r_pointer)
    {
        if(fixedstring.charAt(l_pointer) != fixedstring.charAt(r_pointer))
        {
            return false;
        }
        
        l_pointer = l_pointer + 1;
        r_pointer = r_pointer - 1;
    }
        return true;
    }
}
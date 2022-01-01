class Solution {
    public boolean isPalindrome(int x) {
    String converted = Integer.toString(x);
    String test = "";
        for(int i = converted.length()-1; i >= 0; i--)
        {
            test = test + converted.charAt(i);
        }
        if (test.equals(converted))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Solution 
{
    public boolean arrayStringsAreEqual(String[] letter, String[] letter1) 
    {
        return String.join("", letter).equals(String.join("", letter1));
    }
}

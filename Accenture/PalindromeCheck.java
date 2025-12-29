package Accenture;

public class PalindromeCheck 
{
    public static void main(String[] args) 
    {
        String s = "abba";
        System.out.println(func(s));
    }

    public static boolean func(String s)
    {
        int left = 0;
        int right = s.length() -1;

        while(left < right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;

            }
            left++;
            right--;
        } 
        return true;
    }
}

//Another variant is to check if the alphanumeric text is palindrome or not by making everything lowercaes and removing non alphanumeric elements
/* 
class Solution 
{
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char i : s.toCharArray()) 
        {
            if (Character.isLetterOrDigit(i)) 
            {
                newStr.append(Character.toLowerCase(i));
            }
        }
        int l = 0, r = newStr.length() - 1;
        while (l < r) 
        {
            if (newStr.charAt(l++) != newStr.charAt(r--)) return false;
        }
        return true;
    }
} 
*/
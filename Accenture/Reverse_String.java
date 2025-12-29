package Accenture;
public class Reverse_String
{
    public static void main(String[] args)
    {
        char [] s = {'a', 'b', 'c', 'd', 'e'};
        func(s);
        System.out.println(new String (s));
    }

    public static void func(char [] s)
    {
        int first_var = 0;
        int last_var = s.length - 1;

        while(first_var < last_var)
        {
            char temp = s[first_var];
            s[first_var] = s[last_var];
            s[last_var] = temp;
            first_var++;
            last_var--;
        }
    }

    
}
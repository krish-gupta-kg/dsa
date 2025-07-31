package String;

public class SB {

    /* StringBuilder is mutable and offers a lower time complexity since it doesn't store previous iterations of Strings instead it 
    makes changes on the existing string */

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++)
        {
            char eg = (char)('a' + i);
            sb.append(eg);
        } 
        System.out.println(sb);
    }
    
}

        /* Normal String functions will give a higher time complexity since it saves each iteration of the string

        String series = "B";
        for(int i = 0; i < 26; i++)
        {
            char eg = (char)('a' + i);
            series = series + eg;
        } 
        System.out.print(series); */
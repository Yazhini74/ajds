public class upper {
    public static void main(String[] args)
    {
        String s ="My Name is Yazhini@74";
        int upper=0;
        int lower=0;
        int digit=0;
        int spl=0;
        for(char ch : s.toCharArray())
        {
            if(Character.isUpperCase(ch))
            {
                upper++;
            }else if(Character.isLowerCase(ch))
            {
                lower++;

            }else if(Character.isDigit(ch))
            {
                digit++;
            }
            else{
                spl++;
            }

        }
    System.out.println("Uppercase:"+upper);
    System.out.println("Lowercase:"+lower);
    System.out.println("Digits:" +digit);
    System.out.println("Special char:" +spl);
    }
    
}

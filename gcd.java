public class gcd {
    public static int swap(int a,int b)

    {
        int big=Math.max(a, b);
        int small=Math.min(a, b);
        while(small!=0)
        {
            int rem = big%small;
            big=small;
            small=rem;
        }
        return big;
       
    }
    public static void main(String[] args)
    {
        int a=35;
        int b=25;
        int gcd = swap(a,b);
        System.out.println(gcd);
    }

    
}

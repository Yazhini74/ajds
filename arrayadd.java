public class arrayadd {
    public static void main(String[] args)
    {
        int[] a= {10,11,12,13,14,15,16};
        int lt=0;
        int rt=a.length-1;
        
        while(lt<=rt)
        {
            if(lt==rt){
                System.out.println(a[lt]);
            }
            lt++;
            rt--;
            System.out.println((a[lt]+a[rt]));

            
          

        }

    }
    
}

public class prime {
    public static void main(String[] args) {
        boolean f;
        int d;
        int m;
        for(int i=200;i<300;i++){
            f=true;
            m=i;
            while(m!=0)
            {
                d=m%10;
                if(d!=2 && d!=3 && d!=5 && d!=7)
                {
                    f=false;
                    break;

                }
                m=m/10;
            }
            if(f)
                {
                    System.out.println(i);
                }
            }

        }

    }
   


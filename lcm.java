public class lcm {

    public static int abc(int a, int b) {
        int big=Math.max(a, b);
        int small=Math.min(a, b);
        int s = big;

        while (true) {
            if (big%small == 0)
                break;

            big=big+s;
        }

        return big;
    }

    public static void main(String[] args) {
        int[] a={8,10,12,15,4,20,18};

        int lcm = a[0];

        for (int i=1; i<a.length; i++) {
            lcm = abc(lcm, a[i]);
        }

        System.out.println("The LCM is: " + lcm);
    }
}
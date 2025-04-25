public class Lab4Exer4 {
    public static void main(String[] args) {

        System.out.println("Sum:" + sumDigits(126));
        //works for 49
    }

    public static int sumDigits(int n) {
        System.out.println("n = " + n );
        System.out.println("n  % 10 start= " + (n % 10) );
        int total;
        total = n % 10;
        System.out.println(" pre total = " + total );

        if ((n / 10) < 0.1) {
            return n; //or 0?
        }
        else {
            total = n % 10;
            total += n / 10;
            System.out.println("n % 10 = " + n );
            System.out.println("else total = " + total );

            return total;

        }

    }
    /*  (49) = 13
     * 49 % 10 = 9
     * 49 / 10 = 4.9 = 4
     * 4 % 10 = 4
         * if u 4/10 = 0.4 --> 0.4 % 10 = 0.4

    
    sumDigits(126) = 9
     * 
     * 126 % 10 = 6 (right most digit)
     * 126 / 10 = 12.6 = 12 (removes right most digit)
     * 12 % 10 = 2
     * 12 /10 =1.2 = 1
     * 1 % 10 = 1
     * 

     * 
     */


}

public class Lab4Exer4 {
    public static void main(String[] args) {
        int digit = 126;
        System.out.println("Digit:" + digit);
        System.out.println("\n\nSum = " + sumDigits(digit));
        //works for 49
    }

    public static int sumDigits(int n) {
        int total;

        System.out.println("1n = " + n );
        System.out.println("2n  % 10 start= " + (n % 10) );
        total = n % 10;
        if (n / 10 > 1){
        System.out.println("\nSum steps: ");
        System.out.print("total = " + total );}

        if (n / 10 > 1) {
            //while ( n > 1) {
                n = n / 10;
                System.out.println("3n = " + n );
                //n = n % 10;
                total = total + (n % 10);

                System.out.println(", 4n = " + n );
                //total = total + n;
                System.out.print(", then total = " + total );

            //}
            sumDigits(n);

            return total;
        }
        else {
            return n; //or 0?

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

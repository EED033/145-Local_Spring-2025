public class Lab4Exer4 {
    public static void main(String[] args) {
        int digit = 12;
        System.out.println("Digit:" + digit);
        System.out.println("\n\nSum3 = " + sumDigits(digit));
    }

    public static int sumDigits(int n) {
        int total;

        System.out.println("\n1n = " + n );
        System.out.println("2n  % 10 = " + (n % 10) );
        total = n % 10; // t = 9, n =49
        // t = 2, n = 12
        System.out.print("total 1 = " + total );

        if (n > 1){
            if (n / 10 > 1 || n == 1) { // if n /10 = 4
                if ( n / 10 < 1) {
                n = n / 10;  
                // n = 4
                total = total + n % 10;
                System.out.print("\n, then total2 = " + total );
                }
                else {
                    n = n / 10; // n = 2
                    total = total + n % 10;
                    System.out.print("\n, then t = " + total + ", n = " + n);
                    System.out.println("\n3n = " + n );
                    total = total + n / 10;
                    System.out.print("\n, then total3 = " + total );
                    n = n / 10;
                    System.out.println("\n..n = " + n );
                }

                if ( n > 1) {
                    System.out.println("\n4n = " + n );
                    total = total + (n % 10);
                    n = n % 10;
                    System.out.print("\n, then total4 = " + total );
                    
                    if (n / 10 < 1) {
                        n = n / 10;
                        total = total + (n % 10);
                        System.out.print("\n, then total5 = " + total );

                    }
                }
                else if (n / 10 < 1) {
                    return total;
                }
                     
            }
            else {                
                sumDigits(n);
            }

            
            return total;
        }

         
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




//javac Lab4.java
//java Lab4
/* The sum to the first n natural numbers is Sn = 1 + 2 + 3 + ... + n.

Write two versions of the function.

The first version, sumIter, uses a loop to calculate the sum to n and return the result.

The second version, sumRecur, uses recursion to calculate the sum to n and return the result. */

public class Lab4Exer1 {
    //NOT FINISHED sumIter --> look at Recursion in Java slides, slide 6
    /* public static int sumIter(int m) {
        int m = 1;
        for (int i = 1; i <= m; i++) {
        m -= i;
        }
        return m;
        } */

        //__________________________________
        //System.out.println("i = " + m);

        /* while (m != 1) {
            for (int i = 0; i <= m; i++) {
                System.out.println("m1 = " + m);
                System.out.print(", i = " + i);
                m -= i;
                System.out.print(", m2 = " + m);
            }
            return m;
        }

        return 1;
 */
//____________________________________________
        /* if (m ==1) {
            return 1;
        }
        else {
            for (int i = 1; i <= m; i++) {
                System.out.print(" m1 = " + m);
                System.out.println("i = " + i);
                m -= i;
                System.out.println("m2 = " + m +", ");
            }
            return m;
        } */
//________________________________
        /* if (n==1) {//base case
            return 1;
        }
        else {
            for (int i; )
        }  */



    //below works! 
        //only question is if we're supposed to call it with 4--Yes! as long as it works.
    public static int sumRecur(int n){
        System.out.print("n = " + n + ", ");
        if (n==1) {//base case
            return 1;
        }
        else {
            return n + sumRecur(n - 1);
        }
    }

    public static void main(String[] args) {
        //System.out.println("Loop:\n");
        //System.out.println(sumIter(8));


        System.out.println("Recursion:");
        System.out.println(sumRecur(4));
        
        //Lab4(sumRecur(4));
    }
}
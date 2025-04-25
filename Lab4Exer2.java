public class Lab4Exer2 {
    public static int bunnyEars(int bunnies) {
        int ears = bunnies;

        System.out.println("Number of bunnys = " + bunnies);
        System.out.print(", ears = " + ears);

/*         System.out.println("Number of ears = " + ears);
 */        //int numEars;

        if (bunnies == 1) {
            return ears;
        }
        else {
            ears += 2;
            return ears + bunnyEars(bunnies - 1);
            
        }


        //public static int bunnyEars(int bunnies, int ears) {
        /* if (bunnies == 1) {
            return ears;
        }
        else {
            //numEars += 2;
            System.out.println("bunnies: " + bunnies);
            return bunnies + bunnyEars((bunnies - 1), (ears + 2));

        } */

        /* if (numEars == 2 * numBun) { ///yet no multiplication allowed
            return numEars;
        } */


    }


    public static void main(String[] args) {
        int numBunnies = 6;
        //int numEarsEach = 2;
        int result = bunnyEars(numBunnies);
        System.out.println("Total ears = " + result);
        System.out.println("Should be " + (2 * 6));


    }
}

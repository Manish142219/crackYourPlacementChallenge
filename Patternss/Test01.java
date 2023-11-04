/*

   *                   // printing this Pattern 
  ***
 *****
*******

 */

public class Pattern {
    public static void main(String[] ar) {
        int i, j, k, l;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4 - i; j++) // here we are managing the the space
            {
                System.out.print(" ");
            }

            for (k = 1; k <= i; k++) // creating the left triangle
            {
                System.out.print("*");
            }

            for (l = 2; l <= i; l++) // creating the right side triangle
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}

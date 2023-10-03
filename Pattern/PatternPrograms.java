public class PatternPrograms {
    public static void main(String[] args) {
        pattern12(5);

    }
    static void pattern1(int n){
        for (int row = 1; row < n; row++) {
            for (int cul = 1; cul <=n; cul++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    /*
    output will be
     * * * * *
     * * * * *
     * * * * *
     * * * * *
    */

    static void pattern2(int n){
        for (int row = 0; row <n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*"+" ");
            }
            System.out.println( );

        }
    }
     /*
    pattern2 output will be like:
     *
     * *
     * * *
     * * * *
    */

    static void pattern3(int n){
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n-row+1; col++) {
                System.out.print("*" + " ");
            }
            System.out.println( );

        }
    }
    /*
    pattern3 output will be like:
     * * * *
     * * *
     * *
     *

    */

    static void pattern4(int n){
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < row+1; col++) {
                System.out.print(col);
            }
            System.out.println( );

        }
    }
    /*
    pattern4 output will be like:
     1
     12
     123
     1234
    */

    static void pattern5(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int afterRowISFineshed = row > n ? 2 * n - row : row;
            for (int col = 1; col < afterRowISFineshed; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
    }
    /*
    pattern5 output will be like:
      *
      * *
      * * *
      * * * *
      * * *
      * *
      *
    */

    static void pattern6(int n){
        for (int row = 0; row < n; row++) {
            for(int col= n ; col >=row ; col--){
                System.out.print(" ");
            }
            for (int col1 = 0; col1 <= row; col1++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
      /*
    pattern6 output will be like:
      *
     * *
    * * *
   * * * *
  * * * * *

    */

    static void pattern7(int n){
        for (int row = 0; row<=n; row++) {
            for (int col =row; col <= n; col++) {
                System.out.print(" ");
            }
            for(int col = 1; col <=row ; col++){
                System.out.print("*");
            }
            System.out.println( );

        }
    }

      /*
    pattern6 output will be like:
       *
      **
     ***
    ****
   *****

    */

    static void pattern8(int n){
        for(int row = 0; row<n;row++){
            for(int speace= row; speace < n; speace++){
                System.out.print(" ");
            }
            for(int col=0; col < row ;col++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }


    static void pattern9(int n){
        for(int row = 0; row< 2*n ;row++){

            int totalColsInRow = row > n? 2*n - row: row;
            int noOfSpeace = n - totalColsInRow;

            for(int speace= 0; speace < noOfSpeace; speace++){
                System.out.print(" ");
            }

            for(int col=0; col < totalColsInRow ;col++){
                System.out.print("* ");
            }

            System.out.println( );
        }
    }
/* output will be like
     *
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
 */

    static void pattern10(int n){
        for(int row = 0; row<n;row++){
            for(int speace= 0; speace < row; speace++){
                System.out.print(" ");
            }
            for(int col=0;col <=n-1-row;col++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    /* output will be like

     * * * * *
      * * * *
       * * *
        * *
         *
     */


    static void pattern11(int n){
        for (int row = 0; row <n; row++) {
            for (int col = 0; col < n-row-1; col++) {
                System.out.print("*"+" ");
            }
            System.out.println( );

        }
    }

    /* output will be like

     * * * *
     * * *
     * *
     *

     */

    static void pattern12(int n){
        for (int row = n; row >=1; row--) {

            for(int speace = n; speace > row; speace--){
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            System.out.println( );
        }
    }

    /* output will be like

     * * * *
       * * *
         * *
           *

     */

}

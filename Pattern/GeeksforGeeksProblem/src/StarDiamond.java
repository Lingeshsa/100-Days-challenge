public class StarDiamond {
    public static void main(String[] args) {
        nStarDiamond(3);
    }


    public static void nStarDiamond(int n) {

        for(int row= 0; row<n;row++){

            for(int col=0;col < n-row-1; col++ ){
                System.out.print(" ");
            }

            for(int col=0;col < 2*row+1; col++ ){
                System.out.print("*");
            }

            for(int col=0;col < n-row-1; col++ ){
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int row= 0; row<n;row++){

            for(int col=0;col < row; col++ ){
                System.out.print(" ");
            }

            for(int col=0;col < 2*n-(2*row+1); col++ ){
                System.out.print("*");
            }

            for(int col=0;col < row; col++ ){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

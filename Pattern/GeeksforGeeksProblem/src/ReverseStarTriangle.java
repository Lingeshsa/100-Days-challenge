public class ReverseStarTriangle {
    public static void main(String[] args) {
        nStarTriangle(3);
    }
    public static void nStarTriangle(int n) {
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

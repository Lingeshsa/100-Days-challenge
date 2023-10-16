public class AlphaRamp {
    public static void main(String[] args) {
        alphaRamp(4);
    }
    public static void alphaRamp(int n) {

        for(int row=0;row<n;row++){
            char ch= (char) ('A'+row);
            for(int col=0;col<=row;col++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

}

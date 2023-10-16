public class AlphaHill {
    public static void main(String[] args) {
        alphaHill(3);
    }
    public static void alphaHill(int n) {

        for(int row=0;row<n;row++) {
            for(int col=0;col < n-row-1; col++ ){
                System.out.print(" ");
            }

            char ch ='A';
            int breakPoint =(2*row+1)/2;
            for(int col=1;col <=2*row+1; col++ ){
                System.out.print(ch+" ");
                if(col<=breakPoint){
                    ch++;
                }else{ch--;}
            }

            for(int col=0;col < n-row-1; col++ ){
                System.out.print(" ");
            }
            System.out.println();
        }
        }

}


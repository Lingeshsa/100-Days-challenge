import java.util.ArrayList;
import java.util.List;

public class Recursion {
    public static void main(String[] args) {
        printNos(5);

    }


    public static int[] printNos(int x) {
        int count = 0;
        int i = x;
        int[] arr = new int[x];

        if( count >= x ){
            return arr;
        }
        else{
            arr[count] = count+1;
            count++;
            System.out.print(count);
            printNos(count);
        }

        return arr;
    }


}

//output : 1 2 3 4 5
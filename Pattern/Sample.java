import javax.swing.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Sample {
    public static void main(String[] args) {
//        long n = 6;
        int arr[] = {4,3,6,2,7,1,8};
        //System.out.println(search(arr,5,3));
        long a[]={6,4,1,1000,4,5};

//        System.out.println(getMinMax(a,n));
//        reverString();
//        reversIntArray();

        print2largest(arr);
    }

    static int search(int arr[], int N, int X)
    {
        return IntStream.range(0, N).filter(i -> arr[i] == X).findFirst().orElse(-1);

    }
    static void reverString(){
        String input ="ABCD";
        String result ="";

        char ch;
        for(int i=0;i<input.length();i++){
            ch = input.charAt(i);
            result = ch+result;
        }
        System.out.println(result);
    }

    static void reversIntArray(){
        int[] arr={1,3,4,5,6,7};
        int[] a =  new int[arr.length];
        int j = a.length;

        for (int k : arr) {
            a[j - 1] = k;
            j--;
        }
        for (int k : a) {
            System.out.print(k);
        }
    }

    static void reverNumber(int arr[],int n)
    {
        int[] rev = new int[n];
        int var = rev.length;
        for(int i=0 ;i<n;i++){
            rev[var-1]=arr[i];
            var--;
        }
        for(int i=0;i<rev.length;i++){
            System.out.print(rev[i]+" ");
        }
    }


    static int print2largest(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]) {
                    int temp =0;
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]);
        }
        int n = arr.length;
        System.out.println(arr[n-2]);

        return  Integer.MIN_VALUE;
    }

    static long getMinMax(long a[], long n)
    {
        for(int i=0;i<a.length;i++){
            long ans = a[0];
            if(a[i] > ans){
                ans = a[i];

            }
            if(a[i]<ans){
                ans = a[i];
                return ans;
            }

        }
        return -1;

    }
}

public class CeilingNumber {
    public static void main(String[] args) {
        int[] ceiling ={-5, -2, 0, 4, 5, 7, 9, 11, 12};
        int target = 8;
        int ans = binarySearch(ceiling,target);
        System.out.println(ans);

    }
    //    return the index
//    What is Ceiling ?
//    Smallest element in array greater or equal to target.
    static int binarySearch(int arr[], int target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
//            find the mid first
            int mid = start +(end-start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return start;
    }
}

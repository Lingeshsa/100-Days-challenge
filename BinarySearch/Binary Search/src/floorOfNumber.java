public class floorOfNumber {
    public static void main(String[] args) {
        int[] floor ={-5, -2, 0, 4, 5, 7, 9, 11, 12};
        int target = -6;
        int ans = binarySearch(floor,target);
        System.out.println(ans);

    }

//    return the index: greater number <= target.
//    What is floor ?
//    Bigest number smaller than equal to target.
    static int binarySearch(int arr[], int target){

//        In case the target is greater than the greatest number in the array.
        if(target > arr[arr.length-1]){
            return -1;
        }

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
        return end;
    }
}

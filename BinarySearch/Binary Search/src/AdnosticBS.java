public class AdnosticBS {
//    which means if the give array is doesn't know whether it's ascending or descending

    public static void main(String[] args) {
        int[] arr ={8,7,6,5,4,3,2,0,-1,-5,-8};
        int target = -5;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    static int binarySearch(int arr[], int target){

        int start = 0;
        int end = arr.length-1;
//        first we just find the array is asc or des
        boolean isAsc = arr[start] <= arr[end];

            while (start <= end){
//            find the mid first
                int mid = start +(end-start)/2;

                if(target == arr[mid]){
                    return mid;
                }

                if(isAsc){
                    if(target < arr[mid]){
                        end = mid -1;
                    }else{
                        start = mid+1;
                    }
                }else {
                    if(target > arr[mid]){
                        end = mid -1;
                    }else{
                        start = mid+1;
                    }
                }
            }

        return -1;
    }
}

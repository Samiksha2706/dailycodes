public class bitonicarray {
    
    public static void main(String[] args) {
        int[] arr2 = {1,3,5,7,9,11,7,6,5};
        int ans = head(arr2);
        System.out.print(ans);

    }
    public static int head(int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while(end>start){
            int mid = start + (end-start)/2;
            if( arr[mid+1]< arr[mid]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        
    }
    return end;
    
    }  
}

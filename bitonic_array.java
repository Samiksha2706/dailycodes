import javax.lang.model.util.ElementScanner14;
import javax.xml.stream.events.StartElement;


public class bitonic_array{
    public static void main(String[] args) {
        int[] arr2 = {1,3,5,7,9,11};
        int ans = head(arr2);
        System.out.print(ans);

    }
    public static int head(int[] arr){
        int start = 0;
        int end = arr1.length-1;
        
        while(end>=start){
            int mid = start + (end-start);
            if( arr[mid+1]< arr[mid]){
                end = mid-1;
            }
            else if(arr[mid+1]> arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
            

    }
    return -1;
    }   
}

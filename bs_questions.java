/*public class bs_questions {
    public int[] searchRange(int[] nums, int target) {

        int[] ans= {-1,-1};
        int start = search(nums,target,false);
        int stop = search(nums,target,true);

        ans[0]=start;
        ans[1]=stop;
        return ans;

    }
    int search(int[] arr,int target,boolean furtherright){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start);
            if(target < arr[mid]){
                end= mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                ans= mid;
                if(furtherright){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return ans;

    }
    
}*/

// search in mountain aray
// occurence of element in mounted array and returning the index
/* 
public class bs_questions{
    public static void main(String[] args) {  

        int[] arr = {1,2,4,5,6,7,8,9,6,3,2,1};
        int target = 4;

        int ans = search(arr,target);
        System.out.println(ans);

    }
    public static int mountain_array(int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while(end>start){
            int mid = start + (end-start)/2;
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

    public static int binarySearch(int[] arr1, int target,int start, int end){

        boolean asc = arr1[start] < arr1[end];

        while(end>start){
        int mid = start +(end-start)/2;

        if(arr1[mid] == target){
            return mid;
        }
        if(asc){
            if(target>arr1[mid]){
                start = mid+1;
            }
            else if(target <arr1[mid]){
                end = mid-1;
            }
        }
        else{
            if(target<arr1[mid]){
                start = mid+1;
            }
            else if(target >arr1[mid]){
                end = mid-1;
            }
        }

    }
    return -1;  
}
    public static int search(int[] arr, int target){

        int ma = mountain_array(arr);
        int ans = binarySearch(arr, target, 0, ma);
        if(ans!=-1){
            return ans;
        }
        return binarySearch(arr, target, ma+1 ,arr.length-1);

    }
}
*/

public class bs_questions{
    public static void main(String[] args) {
        
    }


    static int search(int[] arr, int target){
        
        int pivot = rotate(arr);
        int firsthalf =binarySearch(arr,target,0, pivot-1);
        if(target==arr[pivot]){
            return pivot;
        }
        else if(pivot == -1){
            return binarySearch(arr, target, 0, arr.lenght-1);
        }
        else {
            if(firsthalf==-1){
                return binarySearch(arr,target,pivot+1, arr.lenght-1);
            }
            return firsthalf;

        }
        return -1;

    }

    static int rotate(int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while(start<end){
            int mid = start +(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            else if(arr[mid]<arr[mid-1]){
                return mid;
            }
            else if(start >=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }    
        
    }

    static int binarySearch(int[] arr1, int target,int start, int end){

        while(end>start){
        int mid = start +(end-start)/2;

        if(arr1[mid] == target){
            return mid;
        }
        else if(arr1[mid]<target){
            
            start = mid+1;
        }    
        else{
            end = mid-1;
            }

    }
    return -1;  
}


}*/
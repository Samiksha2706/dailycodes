import javax.lang.model.util.ElementScanner14;
import javax.xml.stream.events.StartElement;

// for both asc and des order array
/*public class bs {
    public static void main(String[] args) {
        int arr[]={1,3,4,6,7,8,89};
        int target = 89;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    public static int binarySearch(int arr1[], int target){
        
        
        int start = 0;
        int end = arr1.length -1;
        boolean asc = arr1[start]<arr1[end];

        while(end>=start){
        int mid = start +(end-start);

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
}*/

/*   //leetcode string , here we do not want our target value but value which is after our target value and letter wrap
public class bs{
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = searchb(arr,target);
        System.out.println(ans);
    }

    static int searchb(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(end>=start){
            int mid = start + (end-start);
            if(target < nums[mid]){
                end= mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            
        }
        return nums[start%nums.length];
    }
}

/*public class bs{
    public static void main(String[] args) {
        int[] arr2 = {1,3,5,7,9,11};
        int target = 4;
        int ans = binarysearch(arr2,target);
        System.out.print(ans);
    }

    public static int binarysearch(int[] arr1,int target){
        int start = 0;
        int stop = arr1.length-1;
        
        boolean asc = arr1[start]<arr1[stop];

        while(stop>=start){
            int mid = (start + stop)/2;
            if(arr1[mid]==target){                        //target = mid
                return mid;
            }
            if(asc){
                if(arr1[mid]>target){
                    stop = mid -1;
                }
                else if(arr1[mid]<target){
                start = mid+1;
                }
            
        }
            else{
                if(arr1[mid]<target){
                    stop = mid -1;
                }
                else if(arr1[mid]>target){
                start = mid+1;
                }
                
            }
        
    }
    return stop;
}
}*/


//when array in infinite means we dont use array.length ,instead we use chunks
public class bs{
    public static void main(String[] args) {
        
    }

    static int chunk(int[]arr,int target){
        //first start with box size of 2

        int start = 0;
        int end = 1;

        //condition that target lies within range
        while(target>arr[end]){
            int newstart = end+1;
            //now new end would be doubled
            //end is index number
            end = end + (end-start+1)*2;
            start=newstart;
        }      
        return infinite(arr,target,start,end);   
    }

    public static int infinite(int[] arr1,int target,int start,int end){

        while(end>=start){
            int mid = start + (end-start);
            if(target < nums[mid]){
                end= mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }

    }
    return -1;
}
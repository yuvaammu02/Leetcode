// Last updated: 12/08/2026, 12:01:28
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(mid==0){
             l=mid+1;
             continue;
            }
            if(mid==arr.length-1)
            {
                h=mid-1;
                continue;
            }
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            return mid;
            if(arr[mid]<arr[mid-1]){
           h=mid-1;
            
            }
            else
            l=mid+1;
        }
        return -1;
    }
}
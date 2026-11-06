class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int low = 1;
  int hig = n-2;
  while(low<hig){
      int mid = (low+hig)/2;
      if(arr[mid] > arr[mid-1] && arr[mid]>arr[mid+1]){
          return mid;
      } else if (arr[mid]>arr[mid-1] && arr[mid] < arr[mid+1] ) {
           low = mid +1;
      }else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){
           hig =  mid -1;
      }
  }
  return low;
  }

}
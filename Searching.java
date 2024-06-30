public class Searching {

  //linear Search
  public static void linearSearch(int arr[], int el){
    int n = arr.length;
    for(int i=0; i<n; i++){
      if(arr[i] == el){
        System.out.println("Element found at index : " + i);
        return;
      }
    }
    System.out.println("Element not found");
    return;
  }

  //binary search
  public static void binarySearch(int arr[], int el){
    int n = arr.length;
    int left = 0;
    int right = n-1;
    while(left <= right){
      // int mid = ( left + right )/ 2;
      int mid = left + (right - left) / 2;
      if(arr[mid] == el){
        System.out.println("element fount : " + mid);
        return;
      }
      else if(arr[mid] < el){
        left = mid+1;
      }
      else{
        right = mid-1;
      }
    }
    System.out.println("Element not found");
    return;
  }
  

  public static void main(String args[]){
    int arr[] = {1,2,3,4,5,6,7,8,9,10};
    int a = 5;
    int b = 8;
    linearSearch(arr, a);
    binarySearch(arr, b);

  }
  
}

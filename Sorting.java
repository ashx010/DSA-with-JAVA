import java.util.*;

public class Sorting {

  //print array
  public static void printArr(int arr[]) {
    for (int i : arr){
      System.out.print(i + " ");
    }
    System.out.println();
    return;
  }

  //bubble sort
  public static void bubbleSortCustom(int arr[]){
    int n = arr.length;
    for (int i=0; i<n-1; i++){
      for (int j=0; j<n-i-1; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    printArr(arr);
    return;
  }

  //Selection Sort
  public static void selectionSortCustom(int arr[]){
    int n = arr.length;
    for(int i=0; i<n-1; i++){
      int min = i;
      for (int j=i+1; j<n; j++){
        if(arr[j]<arr[min]){
          min=j;
        }
      } 
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }

    printArr(arr);
    return;
  }

  //Insertion Sort
  public static void insertionSortCustom(int arr[]){
    for (int i=1; i<arr.length; i++){
      int curr = arr[i];
      int j = i-1;
      while (j>=0 && arr[j]>curr){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = curr;
    }

    printArr(arr);
    return;
  }

  //Counting Sort (used for positive and low quantity array)
  public static void countingSortCustom(int arr[]){
    int maxel = Integer.MIN_VALUE;
    for (int i=0; i<arr.length; i++){
      maxel = Math.max(arr[i], maxel);
    }
    int count[] = new int[maxel+1]; //in this we consider using 0 to maxel  
    
    for(int i=0; i<arr.length; i++){
      count[arr[i]]++;
    }

    int j=0;
    for(int i=0; i<count.length; i++){
      while(count[i] > 0){
        arr[j] = i;
        j++;
        count[i]--;
      }
    }

    printArr(arr);
    return;
  }

  public static void main(String[] args) {

    int arr[] = {3,5,8,2,4,10,1};
    int arr2[] = {3,5,8,2,4,10,1};
    int arr3[] = {3,5,8,2,4,10,1};
    int arr4[] = {3,5,8,2,4,10,1};


    bubbleSortCustom(arr); // n^2
    selectionSortCustom(arr2); // n^2
    insertionSortCustom(arr3); // n^2

    //inbuit sort 
    Arrays.sort(arr4); // n logn
    printArr(arr4);

    //reverse sorting

    // for inbuilt array reverse sort using collections and collections only take object data type (like Integer) instead of primitive one's i.e int
    Integer arr5[] = {3,5,8,2,4,10,1}; 

    Arrays.sort(arr5, Collections.reverseOrder());

    for (Integer i : arr5){
      System.out.print(i + " ");
    }
    System.out.println();

    int arr6[] = {3,5,8,2,4,10,1};
    countingSortCustom(arr6); // ~~n  sometimes, n + range
  }
  
}

import java.util.*;

public class java1{

    // returnType Name(){
    //     //code
    //     return value;
    //}
    // below we create a function name helloWorld, return type is void as we are not returning anything
    public static void helloWorld(){
        System.out.println("Hello World");
    }

    public static int binarySearch(int sortarr[], int k){
        int start = 0;
        int end = sortarr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(sortarr[mid] == k){
                return mid;
            }
            else if(sortarr[mid] < k){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        } 
        return -1;
    }

    public static void main(String args[]){

        /* 
        Basics of java
        */

        // print statements 
        // System.out.print("Hello"); //print statement : print
        // System.out.print("Hello");
        // System.out.print("Hello\n"); // give next line : \n
        // System.out.println("Hello World"); //give next line : println
        // System.out.print("Hello World"); 
        // System.out.println("Hello World");

        // // variables
        // int a =10;
        // System.out.println(a);
        // byte b = 127; // -128 to 127 : 256
        // System.out.println(b);

        // //sum
        // int c = a + b;
        // System.out.println(c);

        // //input 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");

        // //int
        // int d = sc.nextInt();
        // System.out.println(d);

        // //float
        // float e = sc.nextFloat();
        // System.out.println(e);

        // //string
        // String g = sc.next();
        // System.out.println(g);

        // //type casting
        // int f = (int) e;
        // System.out.println(f);

        // char h = 'a'; // char can be converted to int not string starting from a = 97
        // int i = h;
        // System.out.println(i);

        // //if-else
        // if(a>b){
        //     System.out.println("a is greater");
        // }
        // else{
        //     System.out.println("b is greater");
        // }

        // //terenary operators
        // int j =  (a>b) ? b : a;
        // System.out.println(j);

        // int[] ab = {1,2,3,4};
        // System.out.println(ab[2]);

        // int[] sortarr = {1,342,32,23,53,231,124};
        // int k = 23;
        // Arrays.sort(sortarr);
        // for(int i=0; i<sortarr.length; i++){
        //     System.out.print(sortarr[i]+ " ");
        // }
        // System.out.println();
        
        // //Binary Search
        // // int index = Arrays.binarySearch(sortarr, 23);

        // //mannual
        // int index = binarySearch(sortarr, k);
        // if(index == -1){
        //     System.out.println("Element not found");
        // }
        // else{
        //     System.out.println("Element "+k+ " found at index : " + index);
        // }

        //bubble sort

        int[] arr = {5,4,6,3,2,1};
        for (int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        

    }
}
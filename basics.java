import java.util.*;

public class basics {

  //creating a new function to print hello world,
  //the return type will be void as there is nothing to return here

  public static void helloWorld(){
    System.out.println("Hello World inside function");
  }

  public static void main(String args[]){

    //print statement, ln refers to make new line just like \n
    System.out.println("Hello World");

    //Data Types
    int a=10;
    double b=2.3;
    char c='A';
    String d="Hello World";
    boolean e=true;
    float f = 12.12f;

    // to print multiple things, we use +
    System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f); 

    //other data types
    byte g = 127; // -128 to 127 : 256
    System.out.println(g);
    short h = 32767; // -32768 to 32767 : 65536
    System.out.println(h);
    long i = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807 : 18446744073709551616
    System.out.println(i);

    //To call a function
    helloWorld();

    //now to take imput we use Scanner class from java.utils
    //first create an object such as sc, can be named anything

    Scanner sc = new Scanner(System.in); //new keyword refers to create a new object

    //to take input from user, we use nextInt() for integer, nextFloat() for float, nextLine() for whole string,
    // next() for a word in a String
    System.out.println("Enter a number");
    int j = sc.nextInt();

    System.out.println("Enter a word : string");
    String k = sc.next();

    System.out.println(j + "\n" + k);

    sc.nextLine(); 
    // it is used here to handle and consume the newline from the input buffer
    // as to use nextLine() after any imputs

    System.out.println("Enter a sentence : string");
    String l = sc.nextLine();

    System.out.println(l);

    //conditional statement in java
    if(j>10){
      System.out.println("Ok");
    }
    else if (j==100){
      System.out.println("Perfect");
    }
    else{
      System.out.println("Not Ok");
    }

    //ternary operator
    int m = (j==100) ? 1 : (j>10) ? 2 : 3; //if j is 100 then m=1, if j>10 then m=2, else m=3

    //loops

    //for loop
    for(int el = 0; el<10; el++){
      System.out.println(el);
    }

    //while loop
    int el=0;
    while(el<10){
      System.out.println(el);
      el++;
    }

    //do while loop
    int el1 = 10;
    do{
      System.err.println(el);
    }
    while(el1<10); // here if even the condition is not true the loops iterate atleast 1 time

    //switch case
    System.out.println("Enter the option from menu: \na (10) \nb (20)");
    char option = sc.next().charAt(0);

    sc.close();

    switch (option) {
      case 'a':
        System.out.println(option + " is ok.");
        break;
      case 'b':
        System.out.println(option + " is not ok.");
        break;

      default:
        System.out.println("Good thats predicted.");
        break;
    }


  }
  
}

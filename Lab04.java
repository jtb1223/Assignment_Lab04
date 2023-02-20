/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04;

/**
 *
 * @author shtpo
 */
public class Lab04 {

   static void countDown(int num) {

      if (num == 0) // test

                  System.out.println("Blastoff!");

       else {

                  System.out.println("...");

                    countDown(num-1); // recursive call

             } 

}

//what is the output of this code?
/*... these lines occur for whatever n is
...
...
Blastoff! when n == 0 this line prints
*/
   
//- modify it so that it prints only the even numbers. 
//if(num % == 0)
   
//- what is the time complexity of this algorithm and why?
//linear because a step in the process increases based off of n


///Task 02) Run the following code:

static int gcd(int x, int y) {

      if (x % y == 0) //base case

             return y;

       else

             return gcd(y, x % y);

}

//what is the output of this code?
//it outputs the greatest common demoniator between the 2 values, if (80, 16) it will return 16.
//- modify it to find the gcd using subtraction instead of %.
/*while (y!=x) {
    if(x > y) { y = y -x;}

    else { x = x - y;} }*/

//Task 03) Run the following code:


static int fib(int n) {

      if (n <= 0) { // base case 1

            return 0; // 1
       }
      else if (n == 1) {// base case //1

             return 1; //1
      }
      else{
          
          return fib(n-1) + fib(n-2); //2^n bc in n times n-1 + n-2
          //
      }

}

//what is the time complexity of this algorithm and why?
//2^n because in n times, these 2 functions run f(1)(n-1) + f(2)(n-2) 

    //Write a function that prints "Hello World" n times recursively. 
    static void printHello(int n) {
        if (n==1){
            System.out.println("Hello World");
        }
        else{
            System.out.println("Hello World");
            printHello(n-1);
        }
    }
    
    //Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion
    static int getSum7(int x, int y) {
        
        if (x > y) { 
            return 0;
        } 
        else if (x % 7 == 0) { 
            return x + getSum7(x + 7, y);
        } 
        else { 
        return getSum7((x) + 1, y);
    }
}
    
    //Write a function that implements the binary search algorithm recursively.
    //int l and int r are left and right of the arr and z is the given int
    static int binarySSR(int[] arr, int l, int r, int z) {
        //checks too see if left is less than the arr and if right is bigger than left
        while (r >= l && l <= arr.length- 1) {
            int mid = l+ (r-1) /2; //setting the midpoint
            
            if(arr[mid] == z) {
                
                return mid;
            }
            if(arr[mid] > z) {//is mid is greater than the given value, mid-1 is int r's new value
                
                return binarySSR(arr, l, mid-1, z);
            }
            else { //if mid is less than the given value, mid+1 is the new left value
                
                return binarySSR(arr, mid+1, r, z);
            }
        }
            return 0;
        }
    
    //it only gives me stack overflow when z = 8,7, and 6, but the rest print out z-1?
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10}; //sorted arr[]
        int n = arr.length; //used to put the arr into the binary search 
        int z = 9;
        //countDown(3);
        //System.out.println(gcd(80,16));
        //System.out.println(fib(5));
        
        printHello(4);
        System.out.println(getSum7(7 , 16));
        System.out.println(binarySSR (arr, 0, n-1, z));
        //
    }
}

package Recurssion.Basics;

public class numbersEg {

    //write a function that takes 5numbers and print it
    //print first 5numbers
/*  
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        System.out.println(n);
        print1(2);
    }
    static void print1(int n){
        System.out.println(n);
        print2(3);
    }
    static void print2(int n){
        System.out.println(n);
        print3(4);
    }
    static void print3(int n){
        System.out.println(n);
    }
*/
    
//Instead of this, the function can be written in generalised form

public static void main(String[] a){
    print(1);
}
static void print(int n){
    if(n==5){
        return;
    }
    System.out.println(n);
    print(n+1);
}
//this is called tail recurssion
//this is the last function call
}

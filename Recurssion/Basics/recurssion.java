package Recurssion.Basics;

//recurssion means calling the function again and again

public class recurssion{
    public static void main(String[] a){
        message();
    }
    static void message(){
        System.out.println("Hello world");
        message1();
    }
    static void message1(){
        System.out.println("Hello world"); 
        message2();
    }
    static void message2(){
        System.out.println("Hello world"); 
        message3();
    }
    static void message3(){
        System.out.println("Hello world"); 
        message4();
    }
    static void message4(){
        System.out.println("Hello world"); 
    }
}
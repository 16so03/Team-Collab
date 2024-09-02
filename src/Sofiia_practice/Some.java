package Sofiia_practice;

public class Some {
    public static void method1(){
        System.out.println("method1");
    }
    public static void method2(){
        method1();
        System.out.println("method2");
    }
}

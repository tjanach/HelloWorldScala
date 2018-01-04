package main.scala.interoperability;

public class ExceptionDemo {
    public static void main(String[] args){
        ThrowExceptionClass tec = new ThrowExceptionClass();
        try {
            tec.doThrow();
        } catch (Exception e){
            System.out.println("Caught it");
        }
    }
}

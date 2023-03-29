package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void getException(int value) throws NoSuchMethodException {
        if(value == 1){
            throw new NoSuchMethodException();
        }
        else System.out.println(value);
}
}
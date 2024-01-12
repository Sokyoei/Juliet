package com.ahri;

public class Lambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Ahri")).start();
    }

}

package com.ahri;

public class InterfaceExample implements Interface {

    @Override
    public void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        InterfaceExample ie = new InterfaceExample();
        ie.sayHello();
    }
}

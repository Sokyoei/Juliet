/**
 * Java Generic 泛型
 */
package com.ahri;

public class Generic<T> {
    private final T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public static void main(String[] args) {
        Generic<Integer> gi = new Generic<Integer>(123);
        System.out.println(gi.getKey());
        Generic<String> gs = new Generic<String>("Ahri");
        System.out.println(gs.getKey());
    }
}

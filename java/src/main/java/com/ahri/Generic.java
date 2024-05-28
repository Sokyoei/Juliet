/**
 * Java Generic 泛型
 */
package com.ahri;

/**
 * 泛型类
 *
 * @param <T>
 */
public class Generic<T> {
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    /***
     * 静态泛型方法，其中 T 相当于局部变量使用，不受类中的 T 的影响
     *  1. 关键字 extends 和 super 分别限定了类型的上下边界（类型之间是继承关系）
     * @param t 打印的第一个参数
     * @param v 打印的第二个参数
     * @param <T> 任何 Number 类型的子类
     * @param <V> 任何类型
     */
    public static <T extends Number, V> void printTwoDiffType(T t, V v) {
        System.out.println(t);
        System.out.println(v);
    }

    public static void main(String[] args) {
        Generic<Integer> gi = new Generic<Integer>(123);
        System.out.println(gi.getKey());
        Generic<String> gs = new Generic<String>("Ahri");
        System.out.println(gs.getKey());

        printTwoDiffType(1, "Sokyoei");
    }
}

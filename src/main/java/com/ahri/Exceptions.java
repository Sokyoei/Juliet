package com.ahri;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.io.EOFException;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * Java Error and Exception
 * X{@link Throwable}
 * X    {@link Exception}
 * X        {@link IOException}
 * X            {@link EOFException}
 * X            {@link FileNotFoundException} 文件未找到
 * X        {@link RuntimeException}
 * X            {@link ArithmeticException} 算术异常
 * X            {@link ArrayStoreException}
 * X            {@link ClassCastException} 类型转换异常
 * X            {@link IllegalArgumentException} 非法参数异常
 * X                {@link IllegalThreadStateException}
 * X                {@link NumberFormatException}
 * X            {@link IllegalMonitorStateException}
 * X            {@link IllegalStateException}
 * X            {@link IndexOutOfBoundsException}
 * X                {@link ArrayIndexOutOfBoundsException} 数组下标越界异常
 * X                {@link StringIndexOutOfBoundsException}
 * X            {@link NegativeArraySizeException}
 * X            {@link NullPointerException} 空指针异常
 * X            {@link SecurityException}
 * X            {@link UnsupportedOperationException}
 * X        {@link ReflectiveOperationException}
 * X            {@link ClassNotFoundException}
 * X            {@link IllegalAccessException}
 * X            {@link InstantiationException}
 * X            {@link NoSuchFieldException}
 * X            {@link NoSuchMethodException}
 * X        {@link SQLException}
 * X        {@link CloneNotSupportedException}
 * X        {@link InterruptedException}
 * X    {@link Error}
 * X        {@link AssertionError}
 * X        {@link IOError}
 * X        {@link LinkageError}
 * X            {@link ClassCircularityError}
 * X            {@link ClassFormatError}
 * X            {@link ExceptionInInitializerError}
 * X            {@link IncompatibleClassChangeError}
 * X                {@link AbstractMethodError}
 * X                {@link IllegalAccessError}
 * X                {@link InstantiationError}
 * X                {@link NoSuchFieldError}
 * X                {@link NoSuchMethodError}
 * X            {@link NoClassDefFoundError}
 * X            {@link UnsatisfiedLinkError}
 * X        {@link ThreadDeath} 线程死锁
 * X        {@link VirtualMachineError}
 * X            {@link OutOfMemoryError} 内存溢出
 * X            {@link StackOverflowError}
 * X            {@link UnknownError}
 */
public class Exceptions {

    public static void main(String[] args) {
        try {
            throw new AhriException("AhriException");
        } catch (AhriException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}

/**
 * AhriException
 */
class AhriException extends RuntimeException {
    public AhriException() {
        super();
    }

    public AhriException(String message) {
        super(message);
    }

    public AhriException(String message, Throwable cause) {
        super(message, cause);
    }

    public AhriException(Throwable cause) {
        super(cause);
    }
}

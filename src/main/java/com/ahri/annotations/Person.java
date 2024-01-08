/**
 * Java Annotation 注解
 */

package com.ahri.annotations;

import java.lang.annotation.*;

/**
 * 可重复注解类
 */
@Retention(RetentionPolicy.RUNTIME) // 保留期
@Documented // 文档
@Target(ElementType.TYPE) // 目标，指示注解被用到的地方
// @Inherited // 继承
@Repeatable(Persons.class)
public @interface Person {
    String name();

    int age() default 20;
}

/**
 * 容器注解类
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@interface Persons {
    Person[] value();
}

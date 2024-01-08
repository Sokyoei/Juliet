package com.ahri.annotations;

@Person(name = "Ahri")
@Person(name = "Sokyoei")
public class AnnotationsExample {
    @Deprecated
    public void old() {
        System.out.println("old() is deprecated");
    }

    public static void main(String[] args) {
        AnnotationsExample ae = new AnnotationsExample();
        if (AnnotationsExample.class.isAnnotationPresent(Persons.class)) {
            Persons persons = AnnotationsExample.class.getAnnotation(Persons.class);
            for (Person person : persons.value()) {
                System.out.println("name: " + person.name() + " age:" + person.age());
            }
        }
        ae.old();
    }
}

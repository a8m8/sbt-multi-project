package impl;

import api.IJavaTestB;

public class JavaTestB implements IJavaTestB {

    @Override
    public void sayBothHello() {
        JavaTest javaTest = new JavaTest();
        javaTest.sayHello();
        System.out.println("Hello from B");
    }
}

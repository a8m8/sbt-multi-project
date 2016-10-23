package impl;

import api.IJavaTest;

public class JavaTest implements IJavaTest {

    @Override
    public void sayHello() {
        System.out.println("Hello I'm your java class");
    }
}

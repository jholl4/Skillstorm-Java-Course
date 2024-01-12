package com.skillstorm;

public class TestClass {
    public static void main(String[] args) {
        try {
            doTest();
        } catch (MyException me) {
            System.out.println(me);
        }
    }

    static void doTest() throws MyException {
        int[] array = new int[10];
        array[10] = 1000;
        doAnotherTest();
    }

    static void doAnotherTest() throws MyException {
        throw new MyException("Exception from doAnotherTest");
    }
}

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

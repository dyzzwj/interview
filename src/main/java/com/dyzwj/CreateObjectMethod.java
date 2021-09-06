package com.dyzwj;

import java.lang.reflect.Constructor;

/**
 * 创建对象的过程
 */
public class CreateObjectMethod {

    public static void main(String[] args) throws Exception {

        /**
         * 获取Class对象的三种方式
         */
        Class<Test> testClass = Test.class;
        Test test = new Test();
        test.getClass();

        /**
         * 反射创建对象的两种方式：
         */
        Class<?> aClass = Class.forName("com.dyzwj.Test");
        Object o = aClass.newInstance();
        System.out.println(o);

        Constructor<?> constructor = aClass.getConstructor();
        System.out.println(constructor.newInstance());

    }
}


class Test{

}

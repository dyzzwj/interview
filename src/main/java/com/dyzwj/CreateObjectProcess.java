package com.dyzwj;

public class Test1 {


    /**
     * 对象实例化的过程：
     *
     * 父类的类构造器<clinit>(静态变量和静态代码块) -> 子类的类构造器<clinit>(静态变量和静态代码块) -> 父类的成员变量和实例代码块 -> 父类的构造函数 -> 子类的成员变量和实例代码块 -> 子类的构造函数
     */
    public static void main(String[] args) {
        new Son();
    }

}


class Father{

    static {
        System.out.println("Father静态代码块");
    }

    {
        System.out.println("Father实例代码块");
    }


    public Father(){
        System.out.println("Father构造器");
    }
}

class Son extends Father{
    static {
        System.out.println("Son静态代码块");
    }

    {
        System.out.println("Son实例代码块");
    }


    public Son(){
        System.out.println("Son构造器");
    }
}
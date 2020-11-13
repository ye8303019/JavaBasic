package com.chris.closure_test;

/**
 * Concept:
 * 可以理解为，闭包是指将使用了自由变量的方法作为一级公民，并可以作为参数传递
 * 其存在的意义是可以将行为作为函数对象或者匿名函数，持有着上下文，进行传递和保存。
 * 如下面的例子中，在 @see ClosureTest 类中，有自由变量 count， 通过一个实现了IPlay接口的内部类Player，完成了对 count 的 -- 操作
 *
 * 更多细节可以参考博客：
 * https://www.cnblogs.com/chenjunbiao/archive/2011/01/26/1944417.html
 */
public class ClosureTest {
    private int count = 10;

    interface IPlay{
        public void play();
    }

    class Player implements IPlay{
        public void play(){
            count--;
            System.out.println(count + " play times left.");
        }
    }

    public Player getPlayer(){
        return new Player();
    }

    public static void main(String[] args) {
        ClosureTest closureTest = new ClosureTest();
        closureTest.getPlayer().play();
    }
}

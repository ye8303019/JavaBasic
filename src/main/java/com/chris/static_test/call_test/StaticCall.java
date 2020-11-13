package com.chris.static_test.call_test;

/**
 * Created by ye830 on 4/21/2018.
 */

/**
 * <p>This test class present that static method could only call static method
 * <p>The theory is:
 * <p>The static resource will been initialized during the class loading,
 * so for non-static resource, it's not been initialized right now.
 * But we could call a non-static method by initialing an Object,
 * cause the static resource already been initialized,
 * so we could call the non-static resource in a static method
 *
 */
public class StaticCall {
    int value = 666;
    public static void main(String[] args) {
        new StaticCall().printValue();

        //printValue();
    }

    private void printValue(){
        int value = 888;
        System.out.println(this.value);
    }

}

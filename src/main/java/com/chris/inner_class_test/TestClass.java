package com.chris.inner_class_test;

/**
 * Created by ye830 on 2/22/2018.
 */
public class TestClass {
    public static void main(String[] args) {
        Parcel1 parcel1 = new Parcel1();

        System.out.println(parcel1.setInnerCount());

//        Parcel1.Selector selector = parcel1.new Selector();
//        parcel1 = selector.getParcel1();

        Parcel1.Interface1 interface1 = parcel1.getInnerClass1();
        System.out.println(interface1.sayMyName());

        Parcel1.Interface2 interface2 = parcel1.getInnerClass2();
        System.out.println(interface2.sayMyCount());

//        Parcel1.InnerClass1 innerClass1 = parcel1.new InnerClass1();
    }
}

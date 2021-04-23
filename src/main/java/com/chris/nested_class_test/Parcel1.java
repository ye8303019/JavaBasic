package com.chris.nested_class_test;

/**
 * Created by ye830 on 2/22/2018.
 */
public class Parcel1 {

    private String myName;

    private int count = 0;

//    public class innerClass{
//        static {
                //inner-class can not have static declarations
//
//        }
//    }


    interface Interface1 {
        String sayMyName();
    }

    interface Interface2 {
        Integer sayMyCount();
    }

    private class InnerClass1 implements Interface1 {

        private void setMyName(){
            myName = "Chris!";
        }

        private String getMyName(){
            return myName;
        }

        @Override
        public String sayMyName(){
            this.setMyName();
            return myName;
        }
    }

    private class InnerClass2 implements Interface2 {
        private int innerCount = 0;

        @Override
        public Integer sayMyCount(){
            return ++innerCount;
        }
    }

    private class Selector {
        public Parcel1 getParcel1(){
            return new Parcel1();
        }
    }

    public Interface1 getInnerClass1(){
        return new InnerClass1();
    }

    public Interface2 getInnerClass2(){
        return new InnerClass2();
    }

    public int setInnerCount(){
        InnerClass2 innerClass2 = new InnerClass2();
        innerClass2.innerCount = 1;
        return innerClass2.innerCount;
    }



    public static void main(String[] args) {
        Parcel1 parcel1 = new Parcel1();

        System.out.println(parcel1.setInnerCount());

        Parcel1.Selector selector = parcel1.new Selector();
        parcel1 = selector.getParcel1();

        Interface1 interface1 = parcel1.getInnerClass1();
        System.out.println(interface1.sayMyName());

        Interface2 interface2 = parcel1.getInnerClass2();
        System.out.println(interface2.sayMyCount());

        Parcel1.InnerClass1 innerClass1 = parcel1.new InnerClass1();

        System.out.println(StaticNestedClassOuter.StaticNestedClassInner.name_cn);

        // 这个是会报错的，name has private access in some class
        //System.out.println(StaticNestedClassOuter.StaticNestedClassInner.name);

    }
}

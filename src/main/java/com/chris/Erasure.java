import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

/**
 * Created by ye830 on 2017/5/7.
 */
public class Erasure {

    private final String finalStr = "finalStr";

    public Erasure(){
        System.out.println("I am in Constructor");
        System.out.println(finalStr);
    }

//    public static <T> List<T> convert(String str){
//        List<T> a1 = new ArrayList<T>();
//        a1.add((T)str);
//        return a1;
//    }
//
//    public static void main(String[] args) {
////        Class c1 = new ArrayList<String>().getClass();
////        Class c2 = new ArrayList<Integer>().getClass();
////        System.out.println(c1 == c2);
////        System.out.println(c1);
////        System.out.println(c2);
//
////        List<Integer> l1 = new ArrayList<Integer>();
////        Map<String,Integer> m1 = new HashMap<>();
////        System.out.println(Arrays.toString(l1.getClass().getTypeParameters()));
////        System.out.println(Arrays.toString(m1.getClass().getTypeParameters()));
//
////        int[] a = {1,2,3,4,5};
////        System.out.println(Arrays.toString(a));
//
//        List<Long> l = convert("aaaa");
//        for(Long lo : l){
//            System.out.println(lo);
//        }
//    }

    @Resource
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        accept(al);
    }

    public static void accept(ArrayList<Object> al) {
        for (Object o : al)
            System.out.println(o);
    }
}

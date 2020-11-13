package com.chris.design_pattern.factory.abstract_factory;


import encryption.DESUtils;

/**
 * Created by ye830 on 4/7/2018.
 */
public class Home {
    public static void main(String[] args) {
        new PS4(new PS4GameFactory()).play("Biohazard7");

        DESUtils desObj = new DESUtils("gyf7L", "ROBh", "Fyq");
        String data = "ab225208-1cd7-4491-b57a-46125fde89ac";
        String str = desObj.strEnc(data);
        System.out.println(str);
        String dec = desObj.strDec(str);
        System.out.println(dec);
    }
}

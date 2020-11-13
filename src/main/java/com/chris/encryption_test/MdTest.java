package com.chris.encryption_test;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by ye830 on 9/30/2017.
 */
public class MdTest {
    private String md5Encryption(){
        return "";
    }

    public static void main(String... arg){
        String message = "Chris Ye";

        byte[] messageBytes = message.getBytes();

        for(byte messageByte : messageBytes){
            String hexStr = Integer.toHexString(messageByte & 0xff);
            System.out.println(hexStr);
        }

        System.out.println(EncryptUtils.byte2hex(message.getBytes()));

        String bs = Integer.toBinaryString(-10);
        System.out.println(bs);


        BASE64Encoder encoder = new BASE64Encoder();
        System.out.println(encoder.encode(messageBytes));

        BASE64Decoder decoder = new BASE64Decoder();
        try {
            System.out.println(new String(decoder.decodeBuffer(encoder.encode(messageBytes))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.chris.encryption_test;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/**
 * Created by ye830 on 10/20/2017.
 */
public class RSATest {

    private static String privateKey;

    private static String publicKey;

    public static void generateKeys(){
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");

            keyPairGenerator.initialize(1024, new SecureRandom());

            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            PrivateKey privateKey = keyPair.getPrivate();

            PublicKey publicKey = keyPair.getPublic();

            System.out.println("Algorithm: " + privateKey.getAlgorithm());

            System.out.println("Format: " + privateKey.getFormat());

            System.out.println("Private Key Encoded:" + new String(Base64.getEncoder().encode(privateKey.getEncoded())));

            System.out.println("Public Key Encoded:" + new String(Base64.getEncoder().encode(publicKey.getEncoded())));


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static String encryption(String plainText){

        Cipher cipher = null;

        try {
            cipher = Cipher.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }

        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(privateKey));




        //cipher.init(Cipher.ENCRYPT_MODE, new PrivateKey());

        return "";
    }

    public static void main(String... args){

        System.out.println("Generate the key pairs");

        generateKeys();

        System.out.println("Encryption");



        System.out.println("Decryption");
    }

}

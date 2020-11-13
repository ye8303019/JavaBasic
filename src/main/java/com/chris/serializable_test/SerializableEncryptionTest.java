package com.chris.serializable_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by ye830 on 8/31/2018.
 */
public class SerializableEncryptionTest {
    public static void main(String[] args) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("encryption_result.yz"));
            objectOutputStream.writeObject(new EncryptionExample());
            objectOutputStream.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("encryption_result.yz"));
            try {
                EncryptionExample example = (EncryptionExample)objectInputStream.readObject();
                System.out.println("password is:"+example.getPassword());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

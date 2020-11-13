package com.chris.serializable_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by ye830 on 8/31/2018.
 */
public class SerializableTest1 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("result.yz"));
            Example example = new Example();
            example.setAge(29);
            example.setName("Chris");
            example.setSex("male");
            objectOutputStream.writeObject(example);
            objectOutputStream.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("result.yz"));
            try {
                example = (Example)objectInputStream.readObject();
                System.out.println(example.getName());
                System.out.println(example.getAge());
                System.out.println(example.getSex());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.chris.serializable_test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by ye830 on 8/31/2018.
 */
public class EncryptionExample implements Serializable{
    private static final long serialVersionUID = 1L;

   private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void readObject(ObjectInputStream objectInputStream){
        try {
            ObjectInputStream.GetField getField = objectInputStream.readFields();
            String myPassword = (String)getField.get("password","");
            System.out.println("Encrypted Password is:"+myPassword);
            password = "pass";
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream){
        try {
            ObjectOutputStream.PutField putField = objectOutputStream.putFields();
            password = "pass";
            System.out.println("Original password is:"+password);
            putField.put("password","encryptionPass");
            objectOutputStream.writeFields();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

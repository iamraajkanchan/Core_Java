package Serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Chinki";
        user.password = "ilovechicken";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("userinfo.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(user);
            outputStream.close();
            fileOutputStream.close();
            System.out.println("Object info is saved!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

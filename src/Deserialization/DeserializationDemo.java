package Deserialization;
import Serialization.User;

import java.io.*;

public class DeserializationDemo {
    public static void main(String[] args) {
        User user = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Programming\\Java\\CodingWithJohn\\userinfo.ser");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            user = (User) inputStream.readObject();
            inputStream.close();
            fileInputStream.close();
            user.sayHello();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

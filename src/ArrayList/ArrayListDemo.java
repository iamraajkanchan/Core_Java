package ArrayList;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        LinkedList<String> nameLinkedList = new LinkedList<>();
        nameLinkedList.add("Lucky");
        nameLinkedList.add("Ivy");
        nameLinkedList.add("Oreo");
        nameLinkedList.add("Brownie");
        nameLinkedList.add("Casie");
        nameLinkedList.add("Tom");
        System.out.println(nameLinkedList);

        ArrayList<String> nameArrayList = new ArrayList<>();
        nameArrayList.add("Lucky");
        nameArrayList.add("Ivy");
        nameArrayList.add("Oreo");
        nameArrayList.add("Brownie");
        nameArrayList.add("Casie");
        nameArrayList.add("Tom");
        System.out.println(nameArrayList);
    }
}
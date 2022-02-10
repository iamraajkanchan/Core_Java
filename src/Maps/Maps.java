package Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> empIds = new HashMap<>();
        HashMap<String, Integer> studentIds = new HashMap<>();
        empIds.put("Shirley", null);
        empIds.put("Raaj", 24372);
        empIds.put("Abhishek", 10082);
        empIds.put("Rahul", 10032);

        studentIds.put("Chinki", 1);
        studentIds.put("Minki", 2);
        studentIds.put("Prince", 3);
        studentIds.put("Golu", 4);
        studentIds.put("Nikku", 5);
        studentIds.put("Bittu", 6);
        studentIds.put("Nilu", 7);
        studentIds.put("Tom", 8);
        studentIds.put("Casie", 9);
        studentIds.put("Brownie", 10);
        studentIds.put("Oreo", 11);
        studentIds.put("Ivy", 12);
        studentIds.put("Lucky", 13);

        System.out.println(empIds);
        System.out.println(empIds.get("Abhishek"));
        System.out.println(empIds.containsKey("Ravi"));
        System.out.println(empIds.containsValue(10032));
        System.out.println(empIds.putIfAbsent("Raaj", 24373));
        System.out.println(empIds.replace("", 24389));
        empIds.remove("Rahul");
        System.out.println(empIds);

        System.out.println(studentIds);
    }
}

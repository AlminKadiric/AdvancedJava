package collection;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Adis");
        nameList.add("Alden");
        nameList.add("Zejd");
        nameList.add("Anja");
        nameList.add("Anja");
        nameList.add("Dejla");
        for (int i=0;i<nameList.size();i++){
            String name = nameList.get(i);
            System.out.println(name);
        }

        System.out.println("Set: ");
        Set<String> setOfNames = new TreeSet<>();
        setOfNames.add("Alden");
        setOfNames.add("Alden");
        setOfNames.add("Amar");
        setOfNames.add("Nedim");
        setOfNames.add("Ajdin");

        for (String name: setOfNames) {
            System.out.println(name);
        }

    }
}

package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> members = new HashMap<>();

        members.put("go", 20);
        members.put("gO", 20);
        members.put("Go", 20);
        members.put("GO", 20);
        System.out.println("총 Entry 수 : " + members.size());

        int age = members.get("go");
        System.out.println("go : " + age);

        Set<String> keys = members.keySet();
        Iterator<String> elements = keys.iterator();
        while (elements.hasNext()) {
            final String key = elements.next();
            final int value = members.get(key);
            System.out.println(key + " : " + value);
        }

        Set<Entry<String, Integer>> entries = members.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entries.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            final String key = entry.getKey();
            final int value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        final int value = members.remove("GO");
        System.out.println("value = " + value);
        System.out.println(members.size());
    }
}

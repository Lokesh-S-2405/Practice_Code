package Collections.LearnMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/*
*  HashMap provides basic implementation of Map interface and is used to store key-value pairs.
*  There should be only one null key and can have any number of null values.
*  If you try to insert the duplicate key then its value will be replaced with new value.
*  order is not maintained.
*
*/

public class LearnHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Akshay");
        map1.put(2, "Bina");
        map1.put(3, "Chintu");
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "Chintu");
        map2.put(2, "Bina");
        map2.put(1, "Akshay");
        HashMap<Integer, String> map3 = new HashMap<>();
        // Add Entry to map
        map3.put(1, "Akshay");
        map3.put(4, "Binod");
        map3.put(3, "Chintu");
        /*
        There are different ways of comparing the hashmap
        1. Compare Entry
        2. Compare Keys
        3. Compare Values
        */
        hashmapMethod_equals(map1,map2,map3);
    }

    private static void hashmapMethod_equals(HashMap<Integer, String> map1, HashMap<Integer, String> map2, HashMap<Integer, String> map3) {

        /*
        1. Compare Entry
        it returns true if the maps have same key-value pairs that means the same entry.
        */
        System.out.println("***********Compare Entry*************");
        // here .equals method is from AbstractMap class
        System.out.println(map1.equals(map2)); // true
        System.out.println(map1.equals(map3)); // false

        /*
        2. Compare Keys
        We can check if two hashmap object contains same keys by comparing their keys obtained using the keySet() method
        */
        System.out.println("***********Compare Keys*************");
        System.out.println(map1.keySet().hashCode() + " "+ map2.keySet().hashCode());
        //here .equals method is from Set.java interface
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));

        /*
        3. Compare Values
        We can compare if values contained in the map objects are the same or not converting all the map values to set using values() method
        */
        System.out.println("***********Compare Values*************");
        System.out.println(map1.values().hashCode());
        System.out.println(map2.values().hashCode());
        System.out.println(map1.values());
        System.out.println(map2.values());
        // Since hashMap.values() returns Collections<T> we cannot compare using equals method of Collection.java interface
        System.out.println(map1.values().equals(map2.values())); // false
        System.out.println(map1.values().equals(map3.values())); // false

        HashSet<String> strings = new HashSet<>(map1.values());
        HashSet<String> strings1 = new HashSet<>(map2.values());
        HashSet<String> strings2 = new HashSet<>(map3.values());

        System.out.println(strings.equals(strings1));
        System.out.println(strings.equals(strings2));
    }

}

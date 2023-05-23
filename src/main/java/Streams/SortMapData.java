package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortMapData {
    public static void main(String[] args) {
        HashMap<String,Employee> map= new HashMap<>();
        map.put("Development",new Employee(1,"loks","Development",new City("123","Bangalore","560078")));
        map.put("Ops",new Employee(23,"pavan","Ops",new City("123","Chennai","560060")));
        map.put("Develo",new Employee(44,"saran","Development",new City("123","Bangalore","560078")));
        map.put("Develo1",new Employee(34,"sarani","Development",new City("123","Bangalore","560060")));
        map.put("Testing",new Employee(12,"john","Testing",new City("123","Kerala","560541")));
        //map.entrySet().forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getEmployeeName))).forEach(System.out::println);
        System.out.println("--------------------------------");

        /*ArrayList<Map.Entry<String,Employee>> arrayList = new ArrayList<>(map.entrySet());
        // Sorting map of data using Collections.sort
        Collections.sort(arrayList, Comparator.comparing(((o1) ->o1.getValue().getId())));
        //arrayList.forEach(System.out::println);
        System.out.println("--------------------------------");
        // Sorting map of data using stream by keys
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("--------------------------------");
        // Sorting map of data using stream by value - Ascending
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getId))).forEach(System.out::println);
        System.out.println("--------------------------------");
        // Sorting map of data using stream by value -Descending
        Stream<Map.Entry<String, Employee>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getId).reversed()));
        sorted.collect(Collectors.toList()).forEach(System.out::println);*/

    }
}

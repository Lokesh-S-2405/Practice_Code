package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    private static boolean isDepartmentAndCityName(Map.Entry<String, Employee> x) {
        return  x.getValue().getCity().getCityName().equalsIgnoreCase("Bangalore") && x.getValue().getCity().getPincode().equalsIgnoreCase("560078");
    }
    public static void main(String[] args) {
        /*HashMap<String,Employee> stringEmployeeHashMap= new HashMap<>();
        stringEmployeeHashMap.put("Development",new Employee(1,"loks","Development",new City("123","Bangalore","560078")));
        stringEmployeeHashMap.put("Ops",new Employee(23,"pavan","Ops",new City("123","Chennai","560060")));
        stringEmployeeHashMap.put("Develo",new Employee(44,"saran","Development",new City("123","Bangalore","560078")));
        stringEmployeeHashMap.put("Develo1",new Employee(34,"sarani","Development",new City("123","Bangalore","560060")));
        stringEmployeeHashMap.put("Testing",new Employee(12,"john","Testing",new City("123","Kerala","560541")));
        List<Map.Entry<String, Employee>> collect = stringEmployeeHashMap.entrySet().stream().filter(MainClass::isDepartmentAndCityName).collect(Collectors.toList());
*/
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"loks","Development"));
        employees.add(new Employee(2,"saran","DevOps"));
        employees.add(new Employee(3,"backya","DevOps"));
        employees.add(new Employee(4,"govind","Development"));
        employees.add(new Employee(4,"govind","Development"));
        employees.add(new Employee(5,"ramya","Development"));
        employees.add(new Employee(6,"kalai","Cyber Security"));
        employees.add(new Employee(7,"sham","Testing"));
        employees.stream().filter(x->x.getEmployeeDepartment().equalsIgnoreCase("Development")).peek(e-> System.out.println(e.getId())).map(x->x.getEmployeeName()).distinct().forEach(System.out::println);
        //Collections.sort(employees,Comparator.comparing(Employee::getEmployeeName).reversed());
        //employees.stream().forEach(System.out::println);
        //segregrateEmployeeBasedOnDepartmentUsingNormalLogic(employees);
        //segregrateEmployeeBasedOnDepartmentUsingStream(employees);

        //System.out.println(collect.size());
/*        Collections.sort(collect,Comparator.comparing(Employee::getId));
        collect.stream().sorted(Comparator.reverseOrder()).forEach();
        for (Map.Entry<String, Employee> entryList:
             collect) {
            System.out.println(entryList.getValue());
        }*/
        /*List<String> collect1 = stringEmployeeHashMap.values().stream().map(x -> x.getCity().getCityName()).collect(Collectors.toList());
        System.out.println(collect1.get(4));*/
        //Collection<Employee> values = stringEmpl
        // oyeeHashMap.values();
        //System.out.println(values);
        /*List<Map.Entry<String, Employee>> development = stringEmployeeHashMap.entrySet().stream().filter(x -> x.getValue().getEmployeeDepartment().equalsIgnoreCase("Ops")).collect(Collectors.toList());
        System.out.println(development.get(0));
        System.out.println("########");
        Map<String, List<Employee>> collect = stringEmployeeHashMap.values().stream().collect(Collectors.groupingBy(Employee::getEmployeeDepartment));
        Collection<List<Employee>> values = collect.values();*/
        //System.out.println(values);
        /*for (Map.Entry<String,List<Employee>> stringListEntry:
             collect.entrySet()) {
            System.out.println(stringListEntry);
        }*/
        //collect.entrySet().stream().filter(x->x.getKey().equalsIgnoreCase("Development")).forEach(System.out::println);
        System.out.println("------------");
        /*for (Map.Entry<String, Employee> employeeEntry:
        stringEmployeeHashMap.entrySet()) {
            System.out.println(employeeEntry);
        }*/

    }

    private static void segregrateEmployeeBasedOnDepartmentUsingStream(List<Employee> employees) {
        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Employee::getEmployeeDepartment));
        collect.entrySet().forEach(System.out::println);
    }

    private static void segregrateEmployeeBasedOnDepartmentUsingNormalLogic(List<Employee> employees) {
        Map<String,List<Employee>> departmentListMap = new HashMap<>();
        for (Employee employee:
                employees) {
            String department = employee.getEmployeeDepartment();
            List<Employee> employees1=departmentListMap.get(department);
            if(employees1==null){
                employees1=new ArrayList<>();
                departmentListMap.put(department,employees1);
            }
            employees1.add(employee);
        }
        departmentListMap.entrySet().stream().forEach(System.out::println);
    }


}

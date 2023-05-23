package Streams;

public class Employee {
    private long id;
    private String employeeName;
    private String employeeDepartment;

    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Employee() {
    }

    public Employee(long id, String employeeName, String employeeDepartment, City city) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.city = city;
    }
    public Employee(long id, String employeeName, String employeeDepartment) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
    }

/*
    public Employee(long id, String employeeName, String employeeDepartment) {
        this.id = id;
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
    }
*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

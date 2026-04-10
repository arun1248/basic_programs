package collection;

public class Employee {

    String name;

    public Employee(String name) {
        this.name = name;
    }

//    public Employee(City city) {
//        this.name = city.name;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}

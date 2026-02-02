package oops.inheritance.isa;

public class RunInheritance {

    public static void main(String[] args) {
        Employee ganesh = new Employee();
        System.out.println(ganesh.name);
        System.out.println(ganesh.empId);

        Person ganeshPerson = new Person();
        System.out.println(ganeshPerson.name);
    }

}

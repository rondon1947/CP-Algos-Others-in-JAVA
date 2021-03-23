package rohan.nishant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee {
    String employeeFirstName;
    String employeeLastName;
    int employeeId;

    public Employee(String employeeFirstName, String employeeLastName, int employeeId) {
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.employeeId = employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return getEmployeeId() == employee.getEmployeeId() &&
                getEmployeeFirstName().equals(employee.getEmployeeFirstName()) &&
                getEmployeeLastName().equals(employee.getEmployeeLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmployeeFirstName(), getEmployeeLastName(), getEmployeeId());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Rohan", "Nishant", 12));
        employeeList.add(new Employee("Melissa", "Benoist", 23));
        employeeList.add(new Employee("Lili", "Reinhart", 34));

        employeeList.forEach(System.out::println);

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(0, new Employee("Ron", "the Don", 56));

        employeeList.forEach(System.out::println);

        System.out.println(employeeList.size());

        employeeList.add(2, new Employee("Kaley", "Cucuo", 78));

        employeeList.forEach(System.out::println);

        System.out.println(employeeList.size());

        Employee[] employees = employeeList.toArray(new Employee[0]);

        for (Employee employee : employees)
            System.out.println(employee);

        System.out.println(employeeList.contains(new Employee("Lili", "Reinhart", 34)));

        employeeList.remove(employeeList.size()-1);

        employeeList.forEach(System.out::println);
    }
}
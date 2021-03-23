package rohan.nishant;

import java.util.Iterator;
import java.util.LinkedList;
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
        Employee rohanNishant = new Employee("Rohan", "Nishant", 12);
        Employee melissaBenoist = new Employee("Melissa", "Benoist", 23);
        Employee liliReinhart = new Employee("Lili", "Reinhart", 34);

        LinkedList<Employee> employeeList = new LinkedList<>();

        System.out.println(employeeList.isEmpty());

        employeeList.addFirst(liliReinhart);
        employeeList.addFirst(melissaBenoist);
        employeeList.addFirst(rohanNishant);

        Iterator employeeListIterator = employeeList.iterator();
        while (employeeListIterator.hasNext()) {
            System.out.println(employeeListIterator.next());
        }

    }
}
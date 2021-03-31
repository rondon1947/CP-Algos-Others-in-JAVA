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

class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}

class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode currentNode = head;
        System.out.print("HEAD -> ");
        while (currentNode != null) {
            System.out.print(currentNode + " -> ");
            currentNode = currentNode.getNext();
        }
        System.out.println("null");
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public EmployeeNode removeFromFront() {
        if(isEmpty())
            return null;
        EmployeeNode nodeToBeRemoved = head;
        head = head.getNext();
        size--;
        nodeToBeRemoved.setNext(null);
        return nodeToBeRemoved;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee rohanNishant = new Employee("Rohan", "Nishant", 12);
        Employee melissaBenoist = new Employee("Melissa", "Benoist", 23);
        Employee liliReinhart = new Employee("Lili", "Reinhart", 34);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(rohanNishant);
        list.addToFront(melissaBenoist);
        list.addToFront(liliReinhart);

        System.out.println(list.getSize());

        list.printList();

        System.out.println(list.isEmpty());

        EmployeeNode removedNode = list.removeFromFront();

        System.out.println(removedNode);
        list.printList();
    }
}
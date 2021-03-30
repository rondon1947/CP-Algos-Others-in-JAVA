package rohan.nishant;

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
    private EmployeeNode previous;

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

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

class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        newNode.setNext(head);
        if (isEmpty())
            tail = newNode;
        else
            head.setPrevious(newNode);
        head = newNode;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);
        newNode.setPrevious(tail);
        if (isEmpty())
            head = newNode;
        else
            tail.setNext(newNode);
        tail = newNode;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode currentNode = head;
        System.out.print("HEAD -> ");
        while (currentNode != null) {
            System.out.print(currentNode + " <-> ");
            currentNode = currentNode.getNext();
        }
        System.out.println("TAIL");
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public EmployeeNode removeFromFront() {
        if(isEmpty())
            return null;
        EmployeeNode nodeToBeRemoved = head;
        if (head.getNext() == null)
            tail = null;
        else
            head.getNext().setPrevious(null);
        head = head.getNext();
        size--;
        nodeToBeRemoved.setNext(null);
        return nodeToBeRemoved;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty())
            return null;
        EmployeeNode nodeToBeRemoved = tail;
        if (tail.getPrevious() == null)
            head = null;
        else
            tail.getPrevious().setNext(null);
        tail = tail.getPrevious();
        size--;
        nodeToBeRemoved.setPrevious(null);
        return nodeToBeRemoved;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee rohanNishant = new Employee("Rohan", "Nishant", 12);
        Employee melissaBenoist = new Employee("Melissa", "Benoist", 23);
        Employee liliReinhart = new Employee("Lili", "Reinhart", 34);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(rohanNishant);
        list.addToFront(melissaBenoist);
        list.addToFront(liliReinhart);

        System.out.println(list.getSize());

        list.printList();

        System.out.println(list.isEmpty());

        Employee daniellePanabaker = new Employee("Danielle", "Panabaker", 90);

        list.addToEnd(daniellePanabaker);
        list.printList();

        System.out.println(list.removeFromFront());
        list.printList();

        System.out.println(list.removeFromEnd());
        list.printList();
    }
}
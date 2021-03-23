package com.company;

import java.util.Scanner;

class listNode {
    int data;
    listNode next;

    listNode() {}

    listNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    static listNode head;

    public static void insert(listNode list, int data) {
        listNode new_node = new listNode(data);
        new_node.next = null;
        if (head == null) {
            head = new_node;
        } else {
            listNode last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public static void printList(Main list) {
        listNode currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        listNode list = new listNode();
        for (int i = 0; i < n; ++i)
            listNode.insert(list, sc.nextInt());
        listNode ans = oddEvenList(list);
        for (int i = 0; i < n; ++i) {
            System.out.println(ans.data + " ");
            ans = ans.next;
        }
    }

    private static listNode oddEvenList(listNode head) {
        if (head == null)
            return null;
        listNode oddHead = null;
        listNode oddTail = null;
        listNode evenHead = null;
        listNode evenTail = null;
        listNode temp = head;
        boolean isOdd = true;
        while (temp != null) {
            if (isOdd) {
                if (oddHead == null)
                    oddHead = oddTail = temp;
                else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
                temp = temp.next;
                oddTail.next = null;
            } else {
                if (evenHead == null)
                    evenHead = evenTail = temp;
                else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
                temp = temp.next;
                evenTail.next = null;
            }
            isOdd = !isOdd;
        }
        oddTail.next = evenHead;
        return oddHead;
    }
}

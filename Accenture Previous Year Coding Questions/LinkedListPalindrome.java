/*
Problem Statement 

Given the head of a singly linked lsit, retun true if it is a plaindrome or false otherwise.

Input: head = [1, 2, 2, 1]
Output: true

*/

import java.util.*;

public class LinkedListPalindrome {

    public static Node head;
    public static Node tail;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to reverse the linked list
    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Method to check if the linked list is a palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; // Single node or empty list is always a palindrome
        }

        Node slow = head;
        Node fast = head;

        // To find the middle of the linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        Node revHead = reverse(slow); // Reverse the second half from the middle
        Node curr = head;

        // Compare the first half with the reversed second half
        while (revHead != null) {
            if (curr.data != revHead.data) {
                return false;
            }
            curr = curr.next;
            revHead = revHead.next;
        }
        return true;
    }

    // Method to add nodes to the linked list
    public static void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the linked list: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            addNode(element);
        }

        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }

        sc.close();
    }
}

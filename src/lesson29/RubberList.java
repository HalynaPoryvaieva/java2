package lesson29;

import org.w3c.dom.Node;

public class RubberList {

    private int size = 0;

    private Node first;

    private Node last;

    public int size() {
        //TODO Home Work
        int count = 0;
        for (int i = 0; i < size; i++) {
            count++;
        }
        return count;
    }

    public int get(int idx) {

        if (idx == 0) {
            return first.item;
        } else {
            int index = 0;
            Node cursor = first;
            while (cursor.next != null) {
                cursor = cursor.next;
                index++;
                if (idx == index) {
                    return cursor.item;
                }
            }
        }

        return -1;
    }

    public void add(int value) {
        if (size == 0) {
            first = new Node(null, value, null);
        } else if (size == 1) {
            last = new Node(first, value, null);
            first.next = last;
        } else {
            Node newLast = new Node(last, value, null);
            last.next = newLast;
            last = newLast;
        }
        size++;
    }

    public void add(int value, int idx) {
        //TODO Home Work
        Node current = first;
        while (current != null) {
            if (current.item == value) {
                Node newNode = new Node(current, value, current.next);
                current.next = newNode;
                if (newNode.next == null) {
                    last = newNode;
                } else {
                    newNode.next.prev = newNode;
                }
                size++;
                return;
            }
            current = current.next;
        }
    }

    public void remove(int idx) {
        if (idx == 0) {
            if (size == 1) {
                first = null;
            } else {
                Node newFirst = first.next;
                newFirst.prev = null;
                first = newFirst;
            }
            size--;
        } else {
            int index = 0;
            Node cursor = first;
            while (cursor.next != null) {
                cursor = cursor.next;
                index++;
                if (idx == index) {
                    Node left = cursor.prev;
                    Node right = cursor.next;
                    left.next = right;
                    if (right != null) {
                        right.prev = left;
                    }
                    cursor.prev = null;
                    cursor.next = null;
                    size--;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        if (size > 0) {
            sb.append(first.item);
        }
        if (size > 1) {
            Node cursor = (Node) first;
            while (cursor.next != null) {
                cursor = cursor.next;
                sb.append(",").append(cursor.item);
            }
        }
        return sb.append("]").toString();
    }

    private static class Node {

        int item;
        Node next;
        Node prev;

        public Node(Node prev, int element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}

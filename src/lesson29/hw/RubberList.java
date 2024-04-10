package lesson29.hw;

import org.w3c.dom.Node;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw29
 * @version 22-Mar-24
 * @author Halyna Poryvaieva
 */
public class RubberList {

    private int size = 0;

    private Node first;

    private Node last;

    private int findIndex;

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int size() {
        //TODO Home Work
        int count = 0;
        for (int i = 0; i < size; i++) {
            count++;
        }
        return count;
    }

    public Integer get(int idx) {
        Node findNode = findByIndex(idx);
        if (findNode != null) {
            return findNode.item;
        }
        return null;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;

    }

    public int indexOf(int value) {
        Node node = findByValue(value);
        if (node != null) {
            return findIndex;
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
        } else if (idx == size - 1) {
            Node newLast = last.prev;
            newLast.next = null;
            last.prev = null;
            last = newLast;
            size--;
        } else {
            Node findNode = findByIndex(idx);
            if (findNode == null) {
                return;
            }
            Node nodeA = findNode.prev;
            Node nodeC = findNode.next;
            nodeA.next = nodeC;
            nodeC.prev = nodeA;
            findNode.prev = null;
            findNode.next = null;
            size--;
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

    private Node findByIndex(int idx) {
        if (idx == 0) {
            return first;
        }
        if (idx == size - 1) {
            return last;
        }
        findIndex = 0;
        Node cursor = first;
        while (cursor.next != null) {
            cursor = cursor.next;
            findIndex++;
            if (idx == findIndex) {
                return cursor;
            }
        }
        return null;
    }

    private Node findByValue(int value) {
        if (size == 0) {
            return null;
        }
        findIndex = 0;
        if (first.item == value) {
            return first;
        }
        Node cursor = first;
        while (cursor.next != null) {
            cursor = cursor.next;
            findIndex++;
            if (cursor.item == findIndex) {
                return cursor;
            }
        }
        return null;
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

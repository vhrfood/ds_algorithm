package vhr.list;

public class MyList<T> {

    public ListNode<T> root;

    public boolean addLast(T data) {
        ListNode<T> listNode = new ListNode<>(data, null);
        ListNode<T> temp = this.root;
        if (this.root == null) {
            this.root = listNode;
            return true;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = listNode;
        return true;

    }

    public void removeListNode(T data) {
        ListNode<T> temp = this.root;
        while (temp != null && temp.next != null && !temp.next.data.equals(data)) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public ListNode<T> removeFirst() {
        ListNode<T> temp = this.root;
        if (temp != null) {
            this.root = temp.next;
            temp.next = null;
            return temp;
        }
        return null;
    }

    public void printList() {
        ListNode<T> temp = this.root;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

    public void printListNodes(ListNode<T> root) {
        while (root != null) {
            System.out.println(root.data);
            root = root.next;
        }
    }

    public ListNode<T> reverseUsingRecursion(ListNode<T> root) {
        if (root == null || root.next == null) {
            return root;
        }
        ListNode<T> resultListNode = reverseUsingRecursion(root.next);
        root.next.next = root;
        root.next = null;
        return resultListNode;
    }

    public ListNode<T> reverseWithoutRecursion() {
        ListNode<T> previous = null;
        ListNode<T> current = this.root;
        ListNode<T> next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;

    }

}

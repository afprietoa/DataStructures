package dataStructures;

public class OrderedLinkedList<T extends Comparable<T>> {
    private class Node<T>{
        private T key;
        private Node <T> next;

        public Node(){
            this(null);
        }

        public Node(T key){
            this.key = key;
            next = null;
        }
    }

    private Node<T> head;

    public OrderedLinkedList(){
        head = null;
    }

    public void insert(T key){

        Node<T> ptr, prev;

        ptr = head;
        prev = null;
        while(ptr != null && ptr.key.compareTo(key)<0){
            prev = ptr;
            ptr = ptr.next;
        }
        if(ptr == null || !(ptr.key.equals(key))){

            Node<T> newp = new Node();
            newp.key = key;
            newp.next = ptr;
            if(prev == null){
                head = newp;
            }else{
                prev.next = newp;
            }
        }

    }

    public void delete(T key){

        Node<T> ptr, prev;

        ptr = head;
        prev = null;
        while(ptr != null && ptr.key != key){
            prev = ptr;
            ptr = ptr.next;
        }
        ptr = ptr.next;
        prev.next = ptr;
    }

    public void printRecursive(){
        System.out.print("List Recursive; ");
        printR(head);
        System.out.println();
    }

    public void printR(Node<T> p){
        if(p != null){
            System.out.print(p.key + " ");
            printR(p.next);
        }
    }


}

package dataStructures;

public class DoublyLinkedListWithTail<T> {
    class Node<T>{
        private T key;
        private Node<T> next;
        private Node<T> prev;
        Node(T key){
            this.key = key;
            this.next = null;
            this.prev = null;
        }
    }
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public DoublyLinkedListWithTail(){
        this.length = 0;
    }
    public void pushFront(T key){
        Node<T> node = new Node<T>(key);
        if(head == null){
            head=tail= node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        length++;
    }

    public void pushBack(T key){
        Node<T> node = new Node<T>(key);
        node.next=null;
        if(tail==null){
            head=tail=node;
            node.prev=null;
        }else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
        length++;
    }
    public void popBack(){
        if(head == null){
            System.out.println("NOTING!!");
            System.out.println("Your collection static list is empty.");
        }
        if(head==tail){
            head=tail=null;
        }else{
            tail=tail.prev;
            tail.next= null;
        }
        length--;
    }
    public void popFront(){
        if(head == null){
            System.out.println("NOTING!!");
            System.out.println("Your collection static list is empty.");
        }
        head = head.next;
        if(head == null){
            tail = null;
        }
        length--;

    }
    public T topFront(){
        return head != null ? head.key : null;
    }
    public T topBack(){
        return tail != null ? tail.key : null;
    }

    public int length() {
        return length;
    }

    public Boolean empty(){
        return head == null;
    }

    public void addBefore(int position, T key){
        if(position<0){
            throw new IndexOutOfBoundsException();
        } else if (position==0) {
            pushFront(key);
        }else{
            Node<T> node = new Node<T>(key);
            Node<T> aux = head;
            for (int i=0; i<position-1; i++){
                if(aux == null)
                    throw new IndexOutOfBoundsException();
                aux = aux.next;
            }
            if(aux.next == null){
                pushBack(key);
            }else{
                node.next = aux;
                node.prev = aux.prev;
                aux.prev = node;
                if(node.prev != null)
                    node.prev.next=node;
            }
        }
    }
    public void addBefore(Node<T> node, T key){
        Node<T> node2 = new Node<T>(key);
        node2.next = node;
        node2.prev = node.prev;
        node.prev = node2;
        if(node2.prev != null){
            node2.prev.next = node2;
        }
        if(head == node){
            head=node2;
        }
    }
    public void addAfter(int position, T key){
        if(position<0){
            throw new IndexOutOfBoundsException();
        } else if (position==0) {
            pushFront(key);
        }else{
            Node<T> node = new Node<T>(key);
            Node<T> aux = head;
            for (int i=0; i<position-1; i++){
                if(aux == null)
                    throw new IndexOutOfBoundsException();
                aux = aux.next;
            }
            if(aux.next == null){
                pushBack(key);
            }else{
                node.next = aux.next;
                node.prev = aux;
                aux.next = node;
            }
        }
    }
    public void addAfter(Node<T> node, T key){
        Node<T> node2 = new Node<T>(key);
        node2.key = key;
        node2.next = node.next;
        node2.prev = node;
        node.next = node2;
        if(node2.next != null){
            node2.next.prev = node2;
        }
        if(tail == node){
            tail = node2;
        }

    }
    public void print(){
        Node<T> aux = head;
        while(aux != null){
            System.out.print(aux.key + " ");
            aux = aux.next;
        }
        System.out.println();
    }
}

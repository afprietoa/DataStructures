package dataStructures;

public class DoublyLinkedListNoTail<T> {
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
    public void pushFront(T key){
        Node<T> node = new Node<T>(key);
        if(head == null){
            head=node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void pushBack(T key){
        Node<T> node = new Node<T>(key);
        if(head == null){
            head = node;
            node.prev=null;
        }else {
            Node<T> aux = head;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = node;
            node.prev = aux;
        }
    }
    public void popFront(){
        if(head == null){
            System.out.println("NOTING!!");
            System.out.println("Your collection static list is empty.");
        }else{
            head = head.next;
        }
    }

    public void popBack(){
        if(head == null){
            System.out.println("NOTING!!");
            System.out.println("Your collection static list is empty.");
        }else{
            Node<T> aux = head;
            while (aux.next.next != null) {
                aux = aux.next;
            }
            aux.next = null;
        }
    }
    public T topFront(){
        return head != null ? head.key : null;
    }
    public T topBack(){
        T key = null;
        if(head!=null){
            Node<T> aux = head;
            while(aux.next != null){
                aux = aux.next;
            }
            key = aux.key;
        }
        return key;
    }
}

package dataStructures;

public class SinglyLinkedListNoTail<T> {
    class Node<T>{
        private T key;
        private Node<T> next;

        public Node(T key){
            this.key = key;
            this.next = null;
        }

    }
    private Node<T> head;
    public SinglyLinkedListNoTail(){
        this.head=null;
    }
    public void print(){
        Node<T> aux = head;
        while(aux != null){
            System.out.print(aux.key + " ");
            aux = aux.next;
        }
        System.out.println();
    }
    public void pushFront(T key){
        Node<T> node = new Node<T>(key);
        node.next=head;
        head = node;
    }
    public void pushBack(T key){
        Node<T> node = new Node<T>(key);
        if(head == null){
            head = node;
        }else {
            Node<T> aux = head;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = node;
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

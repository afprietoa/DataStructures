package dataStructures;

public class QueueWithLinkedList<T> {
    public DoublyLinkedListWithTail<T> listWithTail = new DoublyLinkedListWithTail<T>();

    public void enqueue(T key){
        listWithTail.pushBack(key);
    }
    public T dequeue(){
        T aux = listWithTail.topFront();
        listWithTail.popFront();
        return aux;
    }
    public Boolean empty(){
        return listWithTail.empty();
    }

    public void print(){
        listWithTail.print();
    }

    public int lenght(){
        return listWithTail.length();
    }
    public T top(){
        return listWithTail.topFront();
    }
}

package dataStructures;

public class StackWithLinkedList<T> {
    DoublyLinkedListWithTail<T> listWithTail = new DoublyLinkedListWithTail<T>();

    public void push(T key){
        listWithTail.pushBack(key);
    }
    public T top(){
        return listWithTail.topBack();
    }
    public T pop(){
        T aux = listWithTail.topBack();
        listWithTail.popBack();
        return aux;
    }
    public Boolean empty(){
        return listWithTail.empty();
    }
    public void print(){
        listWithTail.print();
    }
}

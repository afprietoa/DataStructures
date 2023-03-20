package dataStructures;

public class QueueWithArray<T> {
    DynamicArrayList<T> dynamicList = new DynamicArrayList<T>();

    public void enqueue(T key){
        dynamicList.pushBack(key);
    }
    public T dequeue(){
        T aux = dynamicList.topFront();
        dynamicList.popFront();
        return aux;
    }
    public Boolean empty(){
        return dynamicList.empty();
    }
}

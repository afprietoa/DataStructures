package dataStructures;

public class StackWithArray<T> {
    DynamicArrayList<T> dynamicList = new DynamicArrayList<T>();

    public void push(T key){
        dynamicList.pushBack(key);
    }
    public T top(){
        return dynamicList.topBack();
    }
    public T pop(){
        T aux = dynamicList.topBack();
        dynamicList.popBack();
        return aux;
    }
    public Boolean empty(){
        return dynamicList.empty();
    }
}

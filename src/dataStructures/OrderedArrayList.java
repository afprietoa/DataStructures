package dataStructures;

public class OrderedArrayList<T extends Comparable<T>> {
    private int capacity;
    private T list[];
    private int size;
    public OrderedArrayList() {
        this(1);
    }
    public OrderedArrayList(int capacity) {
        this.capacity = capacity;
        this.list =(T[]) new Comparable[capacity];
        this.size = 0;
    }

    public void print(){
        for(int i = 0; i<capacity; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public void insert(T key){
        if (!full()){
            T newList[] = (T[]) new Comparable[capacity];
            if(empty()){
                list[0] = key;
                size++;
            }else {
                for (int i = 0; i<size ;i++){
                    if(list[i].compareTo(key)>0){
                        newList[i]=key;
                        for(int j=i; j+1<capacity; j++){

                            newList[j+1] = list[j];
                        }

                        list = newList;
                        break;
                    }else{
                        newList[i]=list[i];
                    }

                }
                list=newList;
                size++;
            }

        }else{
            list = resize(list);
            insert(key);
        }
    }
    public T[] resize(T[] list){
        T newList[] = (T[]) new Comparable[capacity*=2];
        for (int i=0; i<size; i++){
            newList[i] = list[i];
        }
        return newList;

    }
    private boolean full() {
        return size == capacity;
    }

    public void delete(T key){
        T reList[] = (T[]) new Comparable[capacity];
        for (int i=0; i<size; i++){
            if(list[i].equals(key)){
                for(int j=i; j<size-1; j++){
                    reList[j] = list[j+1];
                }
                list = reList;
                break;
            }
            else
                reList[i]=list[i];
        }
        list=reList;
        size--;

    }

    public boolean empty() {
        return size == 0;
    }

    public int length(){
        return list.length;
    }

    public T find(int idx){
        return list[idx];
    }
}

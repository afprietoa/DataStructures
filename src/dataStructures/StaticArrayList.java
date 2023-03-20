package dataStructures;

public class StaticArrayList<T> {
    private int capacity;
    private T[] list;
    private int size;
    /**
     * Constructor for objects of class StaticList
     */
    public StaticArrayList() {
        this(5);
    }
    /**
     * Constructor for objects of class StaticList
     */
    public StaticArrayList(int capacity) {
        this.capacity = capacity;
        this.list =(T[]) new Object[capacity];
        this.size = 0;
    }

    /**
     * print function, this print all the elements of array
     *
     */
    public void print(){
        for(int i = 0; i<capacity; i++){
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    /**
     * pushBack function, this adds an item in the array at the end
     *
     * @param  key  a item to introduce
     */
    public void pushBack(T key){
        if(!full()){
            list[size++]=key;
        }else{
            System.out.println("FULLNESS!!");
            System.out.println("Your collection static list is full.");
        }
    }
    /**
     * pushFront function, this adds an item in the array at the beginning
     *
     * @param  key  a item to introduce
     */
    public void pushFront(T key){
        if (!full()){
            T newList[] = (T[]) new Object[capacity];
            newList[0] = key;
            for (int i = 0; i+1<capacity;i++){
                newList[i+1] = list[i];
            }
            list = newList;
            size++;
        }else{
            System.out.println("FULLNESS!!");
            System.out.println("Your collection static list is full.");
        }
    }
    /**
     * popBack function, this removes an item in the array at the end
     *
     */
    public void popBack(){
        if(!empty()){
            size--;
            T newList[] = (T[]) new Object[capacity];
            for (int i =0; i<size; i++){
                newList[i]=list[i];
            }
            list=newList;
        }else{
            System.out.println("NOTING!!");
            System.out.println("Your collection static list is empty.");
        }
    }
    /**
     * popFront function, this removes an item in the array at the beginning
     *
     */
    public void popFront(){
        if(!empty()) {
            T newList[] = (T[]) new Object[capacity];
            for (int i=1; i<size; i++){
                newList[i-1] = list[i];
            }
            list = newList;
            size--;
        }else{
            System.out.println("NOTING!!");
            System.out.println("Your collection static list is empty.");
        }
    }
    /**
     * topFront function, this return the item from the front
     *
     * @return    value of the beginning of the array
     */
    public T topFront() {
        return !empty() ? this.list[0] : null;
    }
    /**
     * topBack function, this return the item from the back
     *
     * @return    value of the end of the array
     */
    public T topBack() {
        return !empty() ? this.list[size-1] : null;
    }
    /**
     * empty function, this validates if array is empty
     *
     * @return    true or false if array is empty
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * full function, this validates if array is full
     *
     * @return    true or false if array is full
     */
    private boolean full() {
        return size == capacity;
    }

    public int length(){
        return list.length;
    }

}

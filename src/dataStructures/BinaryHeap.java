package dataStructures;

import java.util.*;

public class BinaryHeap<T extends Comparable<T>> {

    private static final int DEFAULT_CAPACITY = 10;

    private T[] heapArray;
    private int size;

    public BinaryHeap() {
        this(DEFAULT_CAPACITY);
    }

    public BinaryHeap(int capacity) {
        this.heapArray = (T[]) new Comparable[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void insert(T element) {
        if (size == heapArray.length - 1) {
            resizeHeap();
        }

        size++;
        heapArray[size] = element;
        siftUp(size);
    }

    public T findMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        return heapArray[1];
    }

    public T deleteMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        T minElement = heapArray[1];
        heapArray[1] = heapArray[size];
        size--;
        siftDown(1);

        return minElement;
    }

    private void siftUp(int index) {
        while (index > 1 && heapArray[index].compareTo(heapArray[parent(index)]) < 0) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private void siftDown(int index) {
        while (leftChild(index) <= size) {
            int minIndex = getMinChildIndex(index);
            if (heapArray[index].compareTo(heapArray[minIndex]) <= 0) {
                break;
            }
            swap(index, minIndex);
            index = minIndex;
        }
    }

    private int parent(int index) {
        return index / 2;
    }

    private int leftChild(int index) {
        return index * 2;
    }

    private int rightChild(int index) {
        return 2 * index + 1;
    }

    private int getMinChildIndex(int index) {
        int leftChildIndex = leftChild(index);
        int rightChildIndex = leftChildIndex + 1;

        if (rightChildIndex > size || heapArray[leftChildIndex].compareTo(heapArray[rightChildIndex]) <= 0) {
            return leftChildIndex;
        } else {
            return rightChildIndex;
        }
    }

    private void swap(int index1, int index2) {
        T temp = heapArray[index1];
        heapArray[index1] = heapArray[index2];
        heapArray[index2] = temp;
    }

    private void resizeHeap() {
        int newCapacity = heapArray.length * 2;
        heapArray = Arrays.copyOf(heapArray, newCapacity);
    }

    public String preOrder() {
        StringBuilder sb = new StringBuilder();
        preOrder(1, sb);
        return sb.toString().trim();
    }

    private void preOrder(int index, StringBuilder sb) {
        if (index <= size) {
            sb.append(heapArray[index]).append(" "); // Append the current node value
            preOrder(leftChild(index), sb); // Traverse left subtree
            preOrder(rightChild(index), sb); // Traverse right subtree
        }
    }

    public String postOrder() {
        StringBuilder sb = new StringBuilder();
        postOrder(1, sb);
        return sb.toString().trim();
    }

    private void postOrder(int index, StringBuilder sb) {
        if (index <= size) {
            postOrder(leftChild(index), sb); // Traverse left subtree
            postOrder(rightChild(index), sb); // Traverse right subtree
            sb.append(heapArray[index]).append(" "); // Append the current node value
        }
    }

    public String inOrder() {
        StringBuilder sb = new StringBuilder();
        inOrder(1, sb);
        return sb.toString().trim();
    }

    private void inOrder(int index, StringBuilder sb) {
        if (index <= size) {
            inOrder(leftChild(index), sb); // Traverse left subtree
            sb.append(heapArray[index]).append(" "); // Append the current node value
            inOrder(rightChild(index), sb); // Traverse right subtree
        }
    }

    public int levelNode(int index) {
        int level = (int) (Math.log(index + 1) / Math.log(2)) + 1;
        return level;
    }


    public void insertLevel(T data) {
        if (size == heapArray.length - 1) {
            resizeHeap();
        }

        heapArray[size] =  data;
        size++;

    }

    public void ZigzagLevelOrder() {
        if (heapArray == null || heapArray.length == 0) {
            return;
        }

        int n = heapArray.length;
        List<List<Integer>> levels = new ArrayList<>();
        int level = 0;
        int levelSize = 1;
        int i = 0;

        while (i < n) {
            List<Integer> currentLevel = new ArrayList<>();
            for (int j = 0; j < levelSize && i < n; j++) {
                currentLevel.add((Integer) heapArray[i++]);
            }
            levels.add(currentLevel);
            level++;
            levelSize *= 2;
        }

        for (int j = 0; j < levels.size(); j++) {
            if (j % 2 == 1) {
                Collections.reverse(levels.get(j));
            }
        }

        for (List<Integer> levelNodes : levels) {
            for (Integer node : levelNodes) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
    public int ZigzagTraversal() {
        Integer[] array = new Integer[getSize()];
        int sum=0;

        if (heapArray == null || heapArray.length == 0) {
            return 0;
        }

        int n = heapArray.length;
        List<List<Integer>> levels = new ArrayList<>();
        int level = 0;
        int levelSize = 1;
        int i = 0;

        while (i < n) {
            List<Integer> currentLevel = new ArrayList<>();
            for (int j = 0; j < levelSize && i < n; j++) {
                currentLevel.add((Integer) heapArray[i++]);
            }
            levels.add(currentLevel);
            level++;
            levelSize *= 2;
        }

        for (int j = 0; j < levels.size(); j++) {
            if (j % 2 == 1) {
                Collections.reverse(levels.get(j));
            }
        }
        int t=0;
        for (int k = 0; k < levels.size(); k++) {
            List<Integer> levelNodes = levels.get(k);
            for (int j = 0; j < levelNodes.size(); j++) {
                Integer node = levelNodes.get(j);
                if(node!=null){
                    array[t++] = node;
                    //System.out.print(node + " ");
                }

            }
            //System.out.println();
        }

        for (int s = 0; s < array.length; s += 2) {
            sum += array[s];
        }
        return sum;
    }

    public T get(int idx){
        return heapArray[idx];
    }

    public int sumLevelOrder(BinaryHeap<T> tree) throws Exception {
        if (tree.isEmpty()) {
            throw new Exception("Empty Heap");
        } else {
            int maxSum, currentSum, currentLevel, maxLevel,
                    currentElement, elementLevel;
            maxSum = currentSum=0;
            currentLevel = 1;

            maxLevel = tree.levelNode(tree.getSize());

            for (int i = 0; i < tree.getSize(); i++) {
                currentElement = (Integer) tree.get(i);
                elementLevel = tree.levelNode(i);

                if ((currentLevel + 1) == elementLevel) {
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                    currentSum = currentElement;
                    currentLevel += 1;
                } else if ((currentLevel == maxLevel) && (i == tree.getSize() - 1)) {
                    currentSum += currentElement;
                    if (currentSum > maxSum) {
                        maxSum = currentSum;
                    }
                } else {
                    currentSum += currentElement;
                }
            }

            return maxSum;
        }
    }
}
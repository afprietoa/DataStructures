package challenges;

import dataStructures.QueueWithLinkedList;
import dataStructures.SinglyLinkedListWithTail;
import dataStructures.StackWithLinkedList;

import java.util.Scanner;

public class ItemMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstItems = sc.nextLine().split(" ");

        QueueWithLinkedList<Integer> itemQueue = new QueueWithLinkedList<Integer>();

        for (int i=0; i< firstItems.length ; i++){
            itemQueue.enqueue(Integer.parseInt(firstItems[i]));
        }

        String[] secondItems = sc.nextLine().split(" ");

        StackWithLinkedList<Integer> itemStack = new StackWithLinkedList<Integer>();

        for (int i=0; i< secondItems.length ; i++){
            itemStack.push(Integer.parseInt(secondItems[i]));
        }

        SinglyLinkedListWithTail<Integer> firstList = new SinglyLinkedListWithTail<Integer>();
        SinglyLinkedListWithTail<Integer> secondList = new SinglyLinkedListWithTail<Integer>();

        for (int i =0; i<firstItems.length; i++){

                int item1 = itemQueue.dequeue();
                int item2 = itemStack.pop();

                if(item1!=item2){
                    firstList.pushBack(item1);
                    secondList.pushFront(item2);
                }


        }

        if(!firstList.empty()){
            firstList.print();
            secondList.print();
        }
        sc.close();
    }
}

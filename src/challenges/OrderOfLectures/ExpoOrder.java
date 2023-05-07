package challenges;

import dataStructures.QueueWithLinkedList;
import dataStructures.SinglyLinkedListWithTail;
import dataStructures.StackWithLinkedList;

import java.util.Scanner;

public class ExpoOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split(" ");

        QueueWithLinkedList<String> nameQueue = new QueueWithLinkedList<String>();
        StackWithLinkedList<String> nameStack = new StackWithLinkedList<String>();

        for (int i=0; i< names.length ; i++){
            nameQueue.enqueue(names[i]);
            nameStack.push(names[i]);
        }

        SinglyLinkedListWithTail<String> nameList = new SinglyLinkedListWithTail<String>();

        for (int i =0; i< names.length/2; i++){
            String name1 = nameQueue.dequeue();
            String name2 = nameStack.pop();

                nameList.pushBack(name1);
                nameList.pushBack(name2);

        }

        if(!nameList.empty()){
            nameList.print();
        }
        sc.close();

    }
}

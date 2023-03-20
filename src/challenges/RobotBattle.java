package challenges;

import dataStructures.QueueWithLinkedList;
import dataStructures.StackWithLinkedList;

import java.util.Scanner;

public class RobotBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");

        StackWithLinkedList<Integer> positiveStack = new StackWithLinkedList<Integer>();
        QueueWithLinkedList<Integer> negativeQueue = new QueueWithLinkedList<Integer>();

        for (int i=0; i< numbers.length ; i++){
            int number = Integer.parseInt(numbers[i]);

            if(number>0){
                positiveStack.push(number);
            }else{
                negativeQueue.enqueue(number);
            }
        }
        negativeQueue.print();
        positiveStack.print();


        while(!positiveStack.empty() && !negativeQueue.empty()){

            int positiveNumber = positiveStack.pop();
            int negativeNumber = negativeQueue.dequeue();
            int diff = positiveNumber - Math.abs(negativeNumber);
            if(  diff > 0){
                positiveStack.push(positiveNumber);
            }else if( diff < 0){
                negativeQueue.listWithTail.pushFront(negativeNumber);
            }

        }




        if(positiveStack.empty() && negativeQueue.empty()){
            System.out.print("No quedaron robots!");
        } else if (positiveStack.empty()) {
            negativeQueue.print();
        }else{
            positiveStack.print();
        }

        sc.close();
    }
}

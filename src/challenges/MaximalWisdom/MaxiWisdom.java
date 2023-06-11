package challenges.MaximalWisdom;


import dataStructures.BinaryHeap;

import java.util.Scanner;

public class MaxiWisdom {


    public static void main(String[] args) throws Exception {
        BinaryHeap<Integer> tree = new BinaryHeap<>();

        Scanner input = new Scanner(System.in);

        String[] data = input.nextLine().split(" ");
        for (String s : data) {
            tree.insertLevel(Integer.parseInt(s));
        }
        System.out.print(tree.sumLevelOrder(tree));
    }
}
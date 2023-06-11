package challenges.Snake;

import dataStructures.BinaryHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snake {
    public static void main(String[] args) throws Exception {
        try{
        BinaryHeap<Integer> path = new BinaryHeap<>();

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String[] data = buffer.readLine().split(" ");

        for (int i = 0; i < data.length; i++) {
            path.insertLevel(Integer.parseInt(data[i]));
        }

        int min = Integer.parseInt(buffer.readLine());

        int value = path.ZigzagTraversal();

        String result = (value >= min) ? "Sobrevive" : "Muere";
            System.out.print(result);


    }catch(IOException e){
        e.printStackTrace();
    }


    }

}

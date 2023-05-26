package challenges.GalapagosIslands;
import dataStructures.BinaryHeap;
import dataStructures.DynamicArrayList;

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GPSIslands {
    public static void main(String[] args) {
        BinaryHeap<Integer> island = new BinaryHeap<>();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int sumPreOrder,sumInOrder,sumPostOrder;
        sumPreOrder=0;
        sumInOrder=0;
        sumPostOrder=0;
        String[] preOrder, inOrder, postOrder;

        DynamicArrayList<Integer> preOrderList = new DynamicArrayList<>();
        DynamicArrayList<Integer> inOrderList = new DynamicArrayList<>();
        DynamicArrayList<Integer> postOrderList = new DynamicArrayList<>();

        try{
            String[] data = buffer.readLine().split(" ");
            for (int i = 0; i < data.length; i++) {
                island.insertLevel(Integer.parseInt(data[i]));
            }

            int times = Integer.parseInt(buffer.readLine());

            preOrder = island.preOrder().split(" ");

            for (int i = 0; i < preOrder.length; i++) {
                if(Integer.parseInt(preOrder[i])>-1 && Integer.parseInt(preOrder[i])<=25)
                    preOrderList.pushBack(Integer.parseInt(preOrder[i]));
            }

            inOrder = island.inOrder().split(" ");

            for (int i = 0; i < inOrder.length; i++) {
                if(Integer.parseInt(inOrder[i])>-1 && Integer.parseInt(inOrder[i])<=25)
                    inOrderList.pushBack(Integer.parseInt(inOrder[i]));
            }

            postOrder = island.postOrder().split(" ");

            for (int i = 0; i < postOrder.length; i++) {
                if(Integer.parseInt(postOrder[i])>-1 && Integer.parseInt(postOrder[i])<=25)
                    postOrderList.pushBack(Integer.parseInt(postOrder[i]));
            }

            for (int i = 0; i < times; i++){
                sumPreOrder += preOrderList.find(i);

                sumInOrder += inOrderList.find(i);

                sumPostOrder += postOrderList.find(i);

            }
            System.out.println();


            String traversal = (sumPostOrder > sumPreOrder
                    && sumPostOrder > sumInOrder) ?
                    "Postorder " + sumPostOrder :
                    (sumInOrder > sumPreOrder && sumInOrder>sumPostOrder) ?
                            "Inorder " + sumInOrder :
                            "Preorder " + sumPreOrder;
            System.out.print(traversal);


        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

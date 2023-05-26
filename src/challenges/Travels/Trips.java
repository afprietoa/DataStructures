package challenges.Travels;

import dataStructures.AVLTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trips {
    public static void main(String[] args) {
        AVLTree<String> towns = new AVLTree<String>();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));


        String[] data = {"Mongui", "Sachica", "Tinjaca", "Combita", "Chiquiza", "Sutamarchan", "Tibasosa", "Toca", "Guican", "Chivata", "Topaga", "Soraca", "Gameza", "Guayata", "Raquira", "Nobsa", "Tenza", "Aquitania"};


        for (int i=0; i< data.length ; i++){
            towns.insert(data[i]);
        }
        try{
            String[] villgs = buffer.readLine().split(" ");
            int minDist = towns.distanceNodes(villgs[0], villgs[1])+1;
            System.out.print(minDist);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

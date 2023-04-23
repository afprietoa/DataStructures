package challenges;

import dataStructures.QueueWithLinkedList;
import dataStructures.StackWithLinkedList;
import dataStructures.StaticArrayList;

import java.util.Scanner;

public class DivAppliances {
   static Scanner scannInt = new Scanner(System.in);
   static Scanner scannStr = new Scanner(System.in);


    public static void main(String[] args) {

        String list = "";

        int qtyCases = scannInt.nextInt();


        for(int i=0; i<qtyCases;i++){
            QueueWithLinkedList<String> articles = new QueueWithLinkedList<>();
            int qtyArticles = scannInt.nextInt();

            String[] arts = scannStr.nextLine().split(" ");

            for(int j=0; j<qtyArticles; j++){
                articles.enqueue(arts[j]);
            }

            int qtyStores = scannInt.nextInt();
            String article;

            String[] qtyArtsStores = scannStr.nextLine().split(" ");

            String charChain = "";

            for(int k=0; k<qtyStores; k++){
                int qtyArtsStore = Integer.parseInt(qtyArtsStores[k]);
                charChain += "[";
                for(int j=0; j<qtyArtsStore; j++){
                    if(articles.empty()){
                        charChain +="]";
                        j=qtyArtsStore;
                    }else{
                        article = articles.dequeue();
                        charChain += (j==qtyArtsStore-1) ? (article + "]")
                                : (articles.empty())
                                ? article
                                : (article + " ");
                    }
                }
                if (qtyArtsStore==0){
                    charChain +="]";
                }
                if(i!=qtyCases || k!=qtyStores){
                    charChain +="\n";
                }

            }

            list += charChain;


        }

        System.out.print(list);

    }
}

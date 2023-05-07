package challenges;

import dataStructures.SinglyLinkedListWithTail;

import java.util.Scanner;

public class BTCInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] prices = sc.nextLine().split(" ");

        SinglyLinkedListWithTail<Integer> pricesList = new SinglyLinkedListWithTail<Integer>();

        for (int i=0; i< prices.length ; i++){
            pricesList.pushBack(Integer.parseInt(prices[i]));
        }

        SinglyLinkedListWithTail<Integer> daysList = new SinglyLinkedListWithTail<Integer>();


        for (int i =0; i< pricesList.length(); i++){
            int days = 0;
            for (int j=i+1; j<pricesList.length(); j++){
                if(pricesList.find(j+1)>pricesList.find(i+1)) {
                    days = j - i;
                    j=pricesList.length();
                }

            }
            daysList.pushBack(days);
        }

        daysList.print();

        sc.close();
    }
}

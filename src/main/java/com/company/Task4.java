package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task4 {
    public static void game(Deque<Integer> cardDeck1, Deque<Integer> cardDeck2){
        int count = 0;
        boolean res = false;

        for (int i = 0; i < 5; i++) {
            count++;
            int card1 = cardDeck1.pop();
            int card2 = cardDeck2.pop();
            if ((card1 > card2 && (card2!=0 && card1!=9) )|| ((card1 == 0) && (card2 == 9))) {
                cardDeck1.addLast(card1);
                cardDeck1.addLast(card2);
            } else if (card1 < card2 && (card1!=0 && card2!=9) || ((card1 == 9) && (card2 == 0))) {
                cardDeck2.addLast(card1);
                cardDeck2.addLast(card2);
            }
            if (cardDeck1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (cardDeck2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
    public static void main(String[] args) {
        int[] card1 = new int[5];
        int[] card2 = new int[5];
        Deque cardDeck1 = new LinkedList();
        Deque cardDeck2 = new LinkedList();
        Scanner in = new Scanner(System.in);

        for (int i=0; i<5; i++){
            card1[i] = in.nextInt();
        }

        for (int i=0; i<5; i++){
            card2[i] = in.nextInt();
        }

        for (int i=0; i<5; i++){
            cardDeck1.addLast(card1[i]);
        }
        for (int i=0; i<5; i++){
            cardDeck2.addLast(card2[i]);
        }

        System.out.println(cardDeck1);
        System.out.println(cardDeck2);

        game(cardDeck1,cardDeck2);

        System.out.println(cardDeck1);
        System.out.println(cardDeck2);


    }
}

package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Task1 {

    public static void game(Stack<Integer> cardDeck1, Stack<Integer> cardDeck2){
        Stack<Integer> stack1 = new Stack();
        Stack<Integer> stack2 = new Stack();
        int count = 0;
        boolean res = false;

        for (int i = 0; i < 5; i++) {
            count++;
            int card1 = cardDeck1.pop();
            int card2 = cardDeck2.pop();
            if ((card1 > card2 && (card2!=0 && card1!=9) )|| ((card1 == 0) && (card2 == 9))) {
                stack1.push(card1);
                stack1.push(card2);
            } else if (card1 < card2 && (card1!=0 && card2!=9) || ((card1 == 9) && (card2 == 0))) {
                stack2.push(card1);
                stack2.push(card2);
            }

            if (cardDeck1.size() == 0 && stack1.size() !=0){
                while (stack1.size()>0){
                    cardDeck1.push(stack1.pop());
                }
            }

            if (cardDeck2.size() == 0 && stack2.size() !=0){
                while (stack2.size()>0){
                    cardDeck2.push(stack2.pop());
                }
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
        Stack cardDeck1 = new Stack();
        Stack cardDeck2 = new Stack();
        Scanner in = new Scanner(System.in);

        for (int i=0; i<5; i++){
            card1[i] = in.nextInt();
        }

        for (int i=0; i<5; i++){
            card2[i] = in.nextInt();
        }

        for (int i=4; i>=0; i--){
            cardDeck1.push(card1[i]);
        }
        for (int i=4; i>=0; i--){
            cardDeck2.push(card2[i]);
        }
        game(cardDeck1,cardDeck2);
    }
}

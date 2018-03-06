package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cardsArrayList  = new ArrayList<>();
    public int pointerToStartOfDeck=0;
    public Deck(){
        for (int suite=0;suite < 5; suite++){
            for (int value = 0; value < 14; value++){
                Card card = new Card(suite,value);
                cardsArrayList.add(card);
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(cardsArrayList);
    }
    public Card[] deal(int numOfCards){
        Card [] returnedCards=new Card[numOfCards];
        for (int i =0; i< numOfCards;i++){
                returnedCards [i]=cardsArrayList.get(pointerToStartOfDeck);
                cardsArrayList.set(pointerToStartOfDeck,null);
                pointerToStartOfDeck++;
            }
            return returnedCards;
        }
    public void printPartOfCards(Card[] cards){
        System.out.println("This cards has been taken ");
        for (Card cardd : cards){
            System.out.println(cardd.getSuite()+" "+cardd.getValue());
        }
    }
    public void putBack(Card[]cardds){
        for(Card card : cardds) {
            pointerToStartOfDeck--;
            cardsArrayList.set(pointerToStartOfDeck, card);

        }

    }

    public void printTheDeck() {
        for (Card card : cardsArrayList){
            System.out.print(card.getSuite()+" "+ card.getValue()+" ,");
        }
    }
}


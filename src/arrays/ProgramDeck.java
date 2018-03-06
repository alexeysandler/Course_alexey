package arrays;

public class ProgramDeck {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
     //   myDeck.shuffle();
        Card[] deal1 = myDeck.deal(4);
        Card [] deal2 = myDeck.deal(3);
        myDeck.printPartOfCards(deal1);
        myDeck.printPartOfCards(deal2);
        myDeck.putBack(deal1);
        myDeck.putBack(deal2);
        myDeck.printTheDeck();

    }
}

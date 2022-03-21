import java.util.*;

public class Deck {

    ArrayList<Card> deck = new ArrayList<Card>();

    public ArrayList<Card> construct() {
    	
    	deck.clear();
    	
        for(int i=0;i<4;i++) {
            for(int j=1;j<14;j++) {
                if(i==0) {
                    Card c = new Card(j,"Hearts");
                    deck.add(c);
                }
                else if(i==1) {
                    Card c = new Card(j,"Clubs");
                    deck.add(c);
                }
                else if(i==2) {
                    Card c = new Card(j,"Diamonds");
                    deck.add(c);
                }
                else {
                    Card c = new Card(j,"Spades");
                    deck.add(c);
                }
            }
        }
        return deck;
    }

    public void print() {
        for(int i=0;i<deck.size();i++) {
            System.out.print(deck.get(i).getCardNum());
            System.out.println(deck.get(i).getCardSuite());
        }
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card drawCard() {

        Card i = deck.get(0);
        deck.remove(0);

        return i;
    }
}
package sb.Game;

import java.util.Random;

public class Deck {


public int value;
public int suit;

Card[] deck = new Card[52];

public Deck(){
	int index = 0;
	
	for(suit = 0; suit <= 3; suit++){
		for(value = 1; value < 14; value++ ){
			deck[index] = new Card(suit, value);
			index++;
		}
	}

}

public void printDeck(Card[] deck){
	for(int num = 0; num < 52; num++){
	deck[num].printCard(deck[num]);
	}
}

public void shuffleDeck(Card[] deck){
	Random rand = new Random();
	
	for(int i = 0; i < deck.length; i++){
		Card temp = deck[i];
		int random = rand.nextInt(52);
		deck[i] = deck[random];
		deck[random] = temp;
	}
	
}

public Card[] getDeck(){
	return deck;
}

}

package sb.Game;

public class Card {

	public int suit;
	public int value;
	
	public final int HEARTS = 0;
	public final int DIAMONDS = 1;
	public final int CLUBS = 2;
	public final int SPADES = 3;
	
	public Card (){
		this.suit = 0;
		this.value = 0;
	}
	public Card(int suit,int value){
		this.suit = suit;
		this.value = value;
	}
	public void printCard(Card card1){
		String suits[] = {"HEARTS","DIAMONDS","CLUBS","SPADES"};
		String values[] = {"null","ACE","2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING"};
		
		System.out.println(values[card1.value] +" of " +suits[card1.suit]);
	}
	public Card makeCard(String suit, String value){
		Card c = new Card();
		switch(suit){
			case "HEARTS":
				c.suit = 0;
				break;
			case "DIAMONDS":
				c.suit = 1;
				break;
			case "CLUBS":
				c.suit = 2;
				break;
			default:
				c.suit = 3;
			
		}
		switch(value){
		case "ACE":
			c.value = 1;
			break;
		case "2":
			c.value = 2;
			break;
		case "3":
			c.value = 3;
			break;
		case "4":
			c.value = 4;
			break;
		case "5":
			c.value = 5;
			break;
		case "6":
			c.value = 6;
			break;
		case "7":
			c.value = 7;
			break;
		case "8":
			c.value = 8;
			break;
		case "9":
			c.value = 9;
			break;
		case "10":
			c.value = 10;
			break;
		case "JACK":
			c.value = 11;
			break;
		case "QUEEN":
			c.value = 12;
			break;
		default:
			c.value = 13;
			
		
	}
				
		return c;
	
	}
	public boolean compareSuit(Card a, String b){
		boolean isSame = false;
		int suitNum;
		switch(b){
		case "HEARTS":
			suitNum = 0;
			break;
		case "DIAMONDS":
			suitNum = 1;
			break;
		case "CLUBS":
			suitNum = 2;
			break;
		default:
			suitNum = 3;
		
	}
		if(a.suit == suitNum){
			isSame = true;
			}
		return isSame;
	}
	
	
}

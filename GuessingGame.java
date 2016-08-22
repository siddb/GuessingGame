package sb.GuessCard;
import java.util.Scanner;
import sb.Game.Card;
import sb.Game.Deck;

public class GuessingGame {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int chances = 5;
		int totalPoints = 0;
		int i = 0;
		
		Deck deck1 = new Deck(); //create a deck object
		Card[] cards;			// create an array that will hold cards
		cards = deck1.getDeck();// populate that array with a deck
		deck1.shuffleDeck(cards);// shuffle the deck
		
		Card chosenOne = cards[0]; //the chosen card variable will hold first element of the deck
		Card guessedCard = null;
		
		System.out.println("Welcome to GuessCard! You have 5 chances to win the game by getting 100 points.");
		System.out.println("There are 3 ways to play:");
		System.out.println("1. Guess the suit for 10 points!");
		System.out.println("2. Guess the rank for 50 points!");
		System.out.println("3. Guess the card for 100 points!");
		
		while(chances > 0 && totalPoints < 100){
			chances--;
			System.out.println("Which way do you want to play?");
			int num = input.nextInt();
			input.nextLine();
			switch(num){
			case 1:
				totalPoints = totalPoints + compareSuit(chosenOne);
				
				if(totalPoints < 100){
				System.out.println("You have "+totalPoints +" points");
				System.out.println(chances +" chances left!");
				}
				i++;
				chosenOne = cards[i];
				break;
			case 2:
				totalPoints = totalPoints + compareRank(chosenOne);
				
				if(totalPoints < 100){
				System.out.println("You have "+totalPoints +" points");
				System.out.println(chances +" chances left!");
				}
				i++;
				chosenOne = cards[i];
				break;
			case 3:
				totalPoints = totalPoints + compareCard(chosenOne,guessedCard);
				if(totalPoints < 100){
					System.out.println("You have "+totalPoints +" points");
					System.out.println(chances +" chances left!");
					}
				break;	
			}
			
		}
		if(totalPoints >= 100){
			System.out.println("CONGRATS!! YOU WIN!!!");
		}
		else{
			System.out.println("Better luck next time!");
		}
	}
	public static int compareSuit(Card c){
		int score = 0;
		int suit_num = 0;
		System.out.println("What is the suit of the card?");
		String text = input.nextLine();
		if(text.equals("HEARTS")){
			suit_num = 0;
		}
		else if(text.equals("DIAMONDS")){
			suit_num = 1;
		}
		else if(text.equals("CLUBS")){
			suit_num = 2;
		}
		else if(text.equals("SPADES")){
			suit_num = 3;
		}
		
		if(suit_num == c.suit){
			System.out.println("You got it right!");
			score = 25;
		}
		else{
			System.out.println("Nope wrong suit :(");
		}
		return score;
	}
	public static int compareRank(Card c){
		int score = 0;
		int rank_num = 0;
		System.out.println("What is the rank of the card?");
		String text = input.nextLine();
		switch(text){
		case "ACE":
			rank_num = 1;
			break;
		case "2":
			rank_num = 2;
			break;
		case "3":
			rank_num = 3;
			break;
		case "4":
			rank_num = 4;
			break;
		case "5":
			rank_num = 5;
			break;
		case "6":
			rank_num = 6;
			break;
		case "7":
			rank_num = 7;
			break;
		case "8":
			rank_num = 8;
			break;
		case "9":
			rank_num = 9;
			break;
		case "10":
			rank_num = 10;
			break;
		case "JACK":
			rank_num = 11;
			break;
		case "QUEEN":
			rank_num = 12;
			break;
		case "KING":
			rank_num = 13;
			break;
		
		}
		if(rank_num == c.value){
			System.out.println("You got it right!");
			score = 50;
		}
		else{
			System.out.println("Nope wrong rank :( ");
		}
		return score;
	}
	public static int compareCard(Card chosenOne, Card guessedCard){
		int score = 0;
		System.out.println("What is the suit of the card?");
		String text = input.nextLine();
		input.nextLine();
		System.out.println("What is the rank of the card?");
		String text_2 = input.nextLine();
		
		guessedCard = chosenOne.makeCard(text, text_2);
		
		System.out.println("You guessed:");
		guessedCard.printCard(guessedCard);
		
		if(chosenOne.suit == guessedCard.suit && chosenOne.value == guessedCard.value){
			System.out.println("You guessed right!");
			score = 100;
		}
		else{
			System.out.println("Nope wrong card :( ");
			
		}
		return score;
		
	}

}

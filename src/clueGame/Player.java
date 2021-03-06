package clueGame;

import java.awt.Color;
import java.util.ArrayList;

public class Player {

	private String name;
	private int index;
	private Color color;
	protected ArrayList<Card> myCards;
	private int startLocation;

	public Player() {
		
	}
	
	//Constructor
	public Player(String name, Color color, int startLoc, int index){
		this.name = name; 
		this.color = color; 
		this.startLocation = startLoc; 
		this.index = index;
		myCards = new ArrayList<Card>();
	}

	public Card disproveSuggestion(String person, String room, String weapon){
		return new Card();
	}
	
	// Getters and Setters:
	public String getName(){
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}

	public Color getColor(){
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getStartLocation(){
		return startLocation;
	}
	
	public void setStartLocation(int startLocation) {
		this.startLocation = startLocation;
	}

	public ArrayList<Card> getMyCards() {
		return myCards;
	}

	public void setMyCards(ArrayList<Card> myCards) {
		this.myCards.clear(); 
		
		for(int i = 0; i < myCards.size(); i++)
			this.myCards.add(myCards.get(i));
	}
	
	public void addCard(Card card){
		myCards.add(card);
	}
	
	public int getIndex(){
		return index;
	}
}




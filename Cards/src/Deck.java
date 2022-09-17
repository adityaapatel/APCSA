
public class Deck {

	private PlayingCard[] cards;
	private int num = 0;
	private int value;
	private int length;
	
	Deck (int numberOfDecks)
	{
		cards = new PlayingCard[numberOfDecks *52];
		value= numberOfDecks;
	
	for (int x = 0; x < numberOfDecks; x++)
	{
		for(int z =0; z<52; z++)
		{
			cards[z]= new PlayingCard (z);
		}
	}
	}
	
		
	
	public PlayingCard drawCard()
	{
		length= cards.length;
		
		if (num <le
		
	
	public int cardsLeft()
	{
		if (num == 0ngth)
			return cards[num + 1];
		else
			return null;
	}
	)
			return cards.length;
		else if (num ==1)
			return cards.length - num;
		else return cards.length -( num-1);
					
	
	}
	
	public int ntring()
	{
		if (this.drawCard()== null)
		{
			if (value == 1)
			return ("ThumberOfCards()
	{
		return cards.length;
	}
	
	public String toSere is"+ value + "decks" + "remaining cards: "+ this.numberOfCards()+"There are 0 card's remaining");
				else return( "There is"+ value + "decks" + "remaining cards: "+ this.numberOfCards()+"There are 0 card's remaining");
			else return "";
				
		}
	}}	

	
	





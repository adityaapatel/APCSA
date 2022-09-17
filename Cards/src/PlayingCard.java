//Aditya Patel
// PlayingCard Class
public class PlayingCard {


private int value;
private int mySuit;


public PlayingCard (int cardValue)

{
  value = cardValue;
  	 
}

public int getSuit()
{
	//if (value>=0 && value<51)
	//mySuit = value/13;
	
	//return mySuit;
	
	
	if (value >= 0 && value <=12)
	{
		mySuit = 0;
		return 0;
	}
	if (value >= 13 && value <=25)
	{
		mySuit = 1;
		return 1;
	}
	if (value >= 26 && value <=38)
	{
		mySuit =2;
		return 2;
	}
	if (value >= 39 && value <=51)
	{
		mySuit= 3;
		return 3;
	}
	else
		return 0;
	
	
}

public int getValue()
{
	
	switch(value)
	{
	
	case 0: value = 0; return 0; 
	case 13:value = 0; return 0; 
	case 26:value = 0; return 0;  
	case 39:value = 0; return 0;  
	
	case 1: value = 1; return 1; 
	case 14:value = 1; return 1;
	case 27:value = 1; return 1;
	case 40:value = 1; return 1;
	
	case 2: value = 2; return 2; 
	case 15: value = 2; return 2;
	case 28:value = 2; return 2;
	case 41: value = 2;return 2;
	
	case 3: value = 3; return 3; 
	case 16:value = 3; return 3; 
	case 29:value = 3; return 3; 
	case 42: value = 3;return 3; 
	
	case 4: value = 4; return 4; 
	case 17:value = 4; return 4; 
	case 30:value = 4;return 4; 
	case 43:value = 4; return 4; 
	
	case 5: value = 5; return 5; 
	case 18: value = 5;return 5;
	case 31:value = 5; return 5;
	case 44:value = 5; return 5;
	
	case 6: value= 6;  return 6; 
	case 19:value= 6; return 6; 
	case 32:value= 6; return 6; 
	case 45:value= 6; return 6; 
	
	case 7: value= 7;  return 7; 
	case 20:value= 7; return 7; 
	case 33: value= 7;return 7; 
	case 46:value= 7; return 7; 
	
	case 8: value= 8;  return 8; 
	case 21:value= 8; return 8; 
	case 34: value= 8;return 8;  
	case 47:value= 8; return 8; 
	
	case 9: value= 9;  return 9; 
	case 22: value= 9;return 9; 
	case 35:value= 9; return 9;
	case 48: value= 9;return 9;
	
	case 10: value=10; return 10;
	case 23: value=10;return 10;
	case 36:value=10; return 10;
	case 49: value=10;return 10;
	
	case 11: value=11; return 11; 
	case 24: value=11;return 11; 
	case 37: value=11;return 11; 
	case 50: value=11; return 11; 
	
	case 12: value= 12; return 12;
	case 25: value= 12; return 12; 
	case 38: value= 12; return 12; 
	case 51: value= 12; return 12;

	default: return -1;
	
	}
}



public String toString()
{
	String suit=  "", type= "";
	

if (mySuit == 0) suit = " of Spades";
else if (mySuit == 1) suit = " of Hearts";
else if (mySuit == 2) suit = " of Diamonds";
else if (mySuit == 3) suit = " of Clubs";


if (value == 0) type = "Ace";
if (value == 1) type = "2";
if (value == 2) type = "3";
if (value == 3) type = "4";
if (value == 4) type = "5";
if (value == 5) type = "6";
if (value == 6) type = "7";
if (value == 7) type = "8";
if (value == 8) type = "9";
if (value == 9) type = "10";
if (value == 10) type = "Jack";
if (value == 11) type = "Queen";
if (value == 12) type = "King";

return type + suit;

}
}

/**
 * This class is used to represent a playing card
 * Each playing card has a rank and suit, other than the two jokers
 */

public class Card
{
	public int suitNum;     // Used as index in suitValues to get suit
	public int rankNum;     // Used as index in rankValues to get rank

	public String[] suitValues = {"Hearts", "Diamonds", "Spades", "Clubs", ""};     // All Possible suits of cards. "" is used for jokers
	public String[] rankValues = {"ace", "two", "three", "four", "five", "six", "seven", "eight", 
                                       "nine", "ten", "jack", "queen", "king", "joker", "jokerPlus"};    // All possible ranks of cards
	
        /*
        A function that returns the string that corresponds with that card's
        image. This is concatenated onto the path of the location of the card
        images and later displayed as the cards are dealt. 
        */
        public String imageString()     
        {
            if(suitNum == 0)        // Hearts
            {
                if(rankNum == 0)
                {
                    return "AH.png";
                }
                else if(rankNum == 1)
                {
                    return "2H.png";
                }
                else if(rankNum == 2)
                {
                    return "3H.png";
                }
                else if(rankNum == 3)
                {
                    return "4H.png";
                }
                else if(rankNum == 4)
                {
                    return "5H.png";
                }
                else if(rankNum == 5)
                {
                    return "6H.png";
                }
                else if(rankNum == 6)
                {
                    return "7H.png";
                }
                else if(rankNum == 7)
                {
                    return "8H.png";
                }
                else if(rankNum == 8)
                {
                    return "9H.png";
                }
                else if(rankNum == 9)
                {
                    return "10H.png";
                }
                else if(rankNum == 10)
                {
                    return "JH.png";
                }
                else if(rankNum == 11)
                {
                    return "QH.png";
                }
                else
                {
                    return "KH.png";
                }
                
            }
            else if(suitNum == 1)       // Diamonds
            {
                if(rankNum == 0)
                {
                    return "AD.png";
                }
                else if(rankNum == 1)
                {
                    return "2D.png";
                }
                else if(rankNum == 2)
                {
                    return "3D.png";
                }
                else if(rankNum == 3)
                {
                    return "4D.png";
                }
                else if(rankNum == 4)
                {
                    return "5D.png";
                }
                else if(rankNum == 5)
                {
                    return "6D.png";
                }
                else if(rankNum == 6)
                {
                    return "7D.png";
                }
                else if(rankNum == 7)
                {
                    return "8D.png";
                }
                else if(rankNum == 8)
                {
                    return "9D.png";
                }
                else if(rankNum == 9)
                {
                    return "10D.png";
                }
                else if(rankNum == 10)
                {
                    return "JD.png";
                }
                else if(rankNum == 11)
                {
                    return "QD.png";
                }
                else
                {
                    return "KD.png";
                }
            }
            else if(suitNum == 3)       // Clubs
            {
                if(rankNum == 0)
                {
                    return "AC.png";
                }
                else if(rankNum == 1)
                {
                    return "2C.png";
                }
                else if(rankNum == 2)
                {
                    return "3C.png";
                }
                else if(rankNum == 3)
                {
                    return "4C.png";
                }
                else if(rankNum == 4)
                {
                    return "5C.png";
                }
                else if(rankNum == 5)
                {
                    return "6C.png";
                }
                else if(rankNum == 6)
                {
                    return "7C.png";
                }
                else if(rankNum == 7)
                {
                    return "8C.png";
                }
                else if(rankNum == 8)
                {
                    return "9C.png";
                }
                else if(rankNum == 9)
                {
                    return "10C.png";
                }
                else if(rankNum == 10)
                {
                    return "JC.png";
                }
                else if(rankNum == 11)
                {
                    return "QC.png";
                }
                else
                {
                    return "KC.png";
                }
            }
            else if(suitNum == 2)           // Spades
            {
                if(rankNum == 0)
                {
                    return "AS.png";
                }
                else if(rankNum == 1)
                {
                    return "2S.png";
                }
                else if(rankNum == 2)
                {
                    return "3S.png";
                }
                else if(rankNum == 3)
                {
                    return "4S.png";
                }
                else if(rankNum == 4)
                {
                    return "5S.png";
                }
                else if(rankNum == 5)
                {
                    return "6S.png";
                }
                else if(rankNum == 6)
                {
                    return "7S.png";
                }
                else if(rankNum == 7)
                {
                    return "8S.png";
                }
                else if(rankNum == 8)
                {
                    return "9S.png";
                }
                else if(rankNum == 9)
                {
                    return "10S.png";
                }
                else if(rankNum == 10)
                {
                    return "JS.png";
                }
                else if(rankNum == 11)
                {
                    return "QS.png";
                }
                else
                {
                    return "KS.png";
                }
            }
            else        // Jokers
            {
                if(rankNum == 13)
                {
                    return "joker.jpg";
                }
                else
                {
                    return "jokerPlus.jpg";
                }
            }
        }
        
        /*
        To string function to print out what cards have been dealt. 
        Used for debugging
        */
        
	@Override
	public String toString() 
	{
            if(suitNum != 4)
            {

                return rankValues[rankNum] + suitValues[suitNum];
                // return "<html>" + rankValues[rankNum] + "<br/> of <br/>" + "" + suit + "</html>";
            }
            else
            {
                if(rankNum == 13)
                {
                    return "joker";
                }
                else
                {
                    return "jokerPlus";
                }
            }   
	}
}
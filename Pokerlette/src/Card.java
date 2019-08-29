public class Card
{
  // I.V.s are suit and rank
	public int suitNum;
	public int rankNum;

	public String[] suitValues = {"Hearts", "Diamonds", "Spades", "Clubs", ""};
	public String[] rankValues = {"ace", "two", "three", "four", "five", "six", "seven", "eight", 
                                       "nine", "ten", "jack", "queen", "king", "joker", "jokerPlus"};
	
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
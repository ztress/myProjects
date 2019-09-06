public class Card
{
  // I.V.s are suit and rank
	public int suitNum;
	public int rankNum;

	public String[] suitValues = {"Hearts", "Diamonds", "Spades", "Clubs", ""};
	public String[] rankValues = {"ace", "two", "three", "four", "five", "six", "seven", "eight", 
                                       "nine", "ten", "jack", "queen", "king", "joker", "jokerPlus"};
	
        
        public String imageString()
        {
            if(suitNum == 0)
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
            else if(suitNum == 1)
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
            else if(suitNum == 2)
            {
                if(rankNum == 0)
                {
                    return "AC.png";
                }
                else if(rankNum == 1)
                {
                    return "2.pngC";
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
                    return "5.pngC";
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
            else if(suitNum == 3)
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
            else
            {
                if(rankNum == 13)
                {
                    return "joker.png";
                }
                else
                {
                    return "jokerPlus.png";
                }
            }
        }
        
        
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
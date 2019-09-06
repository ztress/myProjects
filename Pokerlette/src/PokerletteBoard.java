
import java.awt.Image;
import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zactr
 */
public class PokerletteBoard extends javax.swing.JFrame {

    
    private ArrayList<String> myBets = new ArrayList<String>();
    private ArrayList<String> theseCards = new ArrayList<String>();
    private int betNum = 0;
    private int balance;
    private boolean bet;
    
    
    
    private ArrayList<String> redCombo = new ArrayList<String>();
    private ArrayList<String> blackCombo = new ArrayList<String>();
    private ArrayList<String> aceToSixCombo = new ArrayList<String>();
    private ArrayList<String> eightToKingCombo = new ArrayList<String>(); // Also Jokers
    
    
    private ArrayList<String> aceDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> aceClubsCombo = new ArrayList<String>();
    private ArrayList<String> aceHeartsCombo = new ArrayList<String>();
    private ArrayList<String> aceSpadesCombo = new ArrayList<String>();
     
    private ArrayList<String> twoDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> twoClubsCombo = new ArrayList<String>();
    private ArrayList<String> twoHeartsCombo = new ArrayList<String>();
    private ArrayList<String> twoSpadesCombo = new ArrayList<String>();
    
    private ArrayList<String> threeDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> threeClubsCombo = new ArrayList<String>();
    private ArrayList<String> threeHeartsCombo = new ArrayList<String>();
    private ArrayList<String> threeSpadesCombo = new ArrayList<String>();
    
    private ArrayList<String> fourDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> fourClubsCombo = new ArrayList<String>();
    private ArrayList<String> fourHeartsCombo = new ArrayList<String>();
    private ArrayList<String> fourSpadesCombo = new ArrayList<String>();
    
    private ArrayList<String> fiveDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> fiveClubsCombo = new ArrayList<String>();
    private ArrayList<String> fiveHeartsCombo = new ArrayList<String>();
    private ArrayList<String> fiveSpadesCombo = new ArrayList<String>();
    
    private ArrayList<String> sixDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> sixClubsCombo = new ArrayList<String>();
    private ArrayList<String> sixHeartsCombo = new ArrayList<String>();
    private ArrayList<String> sixSpadesCombo = new ArrayList<String>();
    
    private ArrayList<String> sevenDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> sevenClubsCombo = new ArrayList<String>();
    private ArrayList<String> sevenHeartsCombo = new ArrayList<String>();
    private ArrayList<String> sevenSpadesCombo = new ArrayList<String>();
    
    private ArrayList<String> eightDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> eightClubsCombo = new ArrayList<String>();
    private ArrayList<String> eightHeartsCombo = new ArrayList<String>();
    private ArrayList<String> eightSpadesCombo = new ArrayList<String>();
    
    private ArrayList<String> nineDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> nineClubsCombo = new ArrayList<String>();
    private ArrayList<String> nineHeartsCombo = new ArrayList<String>();
    private ArrayList<String> nineSpadesCombo = new ArrayList<String>();
    
    private ArrayList<String> tenDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> tenClubsCombo = new ArrayList<String>();
    private ArrayList<String> tenHeartsCombo = new ArrayList<String>();
    private ArrayList<String> tenSpadesCombo = new ArrayList<String>();
    
    private ArrayList<String> jackDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> jackClubsCombo = new ArrayList<String>();
    private ArrayList<String> jackHeartsCombo = new ArrayList<String>();
    private ArrayList<String> jackSpadesCombo = new ArrayList<String>();
    
    private ArrayList<String> queenDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> queenClubsCombo = new ArrayList<String>();
    private ArrayList<String> queenHeartsCombo = new ArrayList<String>();
    private ArrayList<String> queenSpadesCombo = new ArrayList<String>();
    
    private ArrayList<String> kingDiamondsCombo = new ArrayList<String>();
    private ArrayList<String> kingClubsCombo = new ArrayList<String>();
    private ArrayList<String> kingHeartsCombo = new ArrayList<String>();
    private ArrayList<String> kingSpadesCombo = new ArrayList<String>();
    
    private ArrayList<String> jokerCombo = new ArrayList<String>();
    private ArrayList<String> jokerPlusCombo = new ArrayList<String>();
    
    
    private ArrayList<String> split1Combo = new ArrayList<String>();
    private ArrayList<String> split2Combo = new ArrayList<String>();
    private ArrayList<String> split3Combo = new ArrayList<String>();
    private ArrayList<String> split4Combo = new ArrayList<String>();
    private ArrayList<String> split5Combo = new ArrayList<String>();
    private ArrayList<String> split6Combo = new ArrayList<String>();
    private ArrayList<String> split7Combo = new ArrayList<String>();
    private ArrayList<String> split8Combo = new ArrayList<String>();
    private ArrayList<String> split9Combo = new ArrayList<String>();
    private ArrayList<String> split10Combo = new ArrayList<String>();
    private ArrayList<String> split11Combo = new ArrayList<String>();
    private ArrayList<String> split12Combo = new ArrayList<String>();
    private ArrayList<String> split13Combo = new ArrayList<String>();
    private ArrayList<String> split14Combo = new ArrayList<String>();
    private ArrayList<String> split15Combo = new ArrayList<String>();
    private ArrayList<String> split16Combo = new ArrayList<String>();
    private ArrayList<String> split17Combo = new ArrayList<String>();
    private ArrayList<String> split18Combo = new ArrayList<String>();
    private ArrayList<String> split19Combo = new ArrayList<String>();
    private ArrayList<String> split20Combo = new ArrayList<String>();
    private ArrayList<String> split21Combo = new ArrayList<String>();
    private ArrayList<String> split22Combo = new ArrayList<String>();
    private ArrayList<String> split23Combo = new ArrayList<String>();
    private ArrayList<String> split24Combo = new ArrayList<String>();
    private ArrayList<String> split25Combo = new ArrayList<String>();
    private ArrayList<String> split26Combo = new ArrayList<String>();
    private ArrayList<String> split27Combo = new ArrayList<String>();
    private ArrayList<String> split28Combo = new ArrayList<String>();
    private ArrayList<String> split29Combo = new ArrayList<String>();
    private ArrayList<String> split30Combo = new ArrayList<String>();
    private ArrayList<String> split31Combo = new ArrayList<String>();
    private ArrayList<String> split32Combo = new ArrayList<String>();
    private ArrayList<String> split33Combo = new ArrayList<String>();
    private ArrayList<String> split34Combo = new ArrayList<String>();
    private ArrayList<String> split35Combo = new ArrayList<String>();
    private ArrayList<String> split36Combo = new ArrayList<String>();
    private ArrayList<String> split37Combo = new ArrayList<String>();
    private ArrayList<String> split38Combo = new ArrayList<String>();
    private ArrayList<String> split39Combo = new ArrayList<String>();
    private ArrayList<String> split40Combo = new ArrayList<String>();
    private ArrayList<String> split41Combo = new ArrayList<String>();
    private ArrayList<String> split42Combo = new ArrayList<String>();
    private ArrayList<String> split43Combo = new ArrayList<String>();
    private ArrayList<String> split44Combo = new ArrayList<String>();
    private ArrayList<String> split45Combo = new ArrayList<String>();
    private ArrayList<String> split46Combo = new ArrayList<String>();
    private ArrayList<String> split47Combo = new ArrayList<String>();
    private ArrayList<String> split48Combo = new ArrayList<String>();
    private ArrayList<String> split49Combo = new ArrayList<String>();
    private ArrayList<String> split50Combo = new ArrayList<String>();
    private ArrayList<String> split51Combo = new ArrayList<String>();
    private ArrayList<String> split52Combo = new ArrayList<String>();
    private ArrayList<String> split53Combo = new ArrayList<String>();
    private ArrayList<String> split54Combo = new ArrayList<String>();
    private ArrayList<String> split55Combo = new ArrayList<String>();
    private ArrayList<String> split56Combo = new ArrayList<String>();
    private ArrayList<String> split57Combo = new ArrayList<String>();
    private ArrayList<String> split58Combo = new ArrayList<String>();
    private ArrayList<String> split59Combo = new ArrayList<String>();
    private ArrayList<String> split60Combo = new ArrayList<String>();
    private ArrayList<String> split61Combo = new ArrayList<String>();
    private ArrayList<String> split62Combo = new ArrayList<String>();
    private ArrayList<String> split63Combo = new ArrayList<String>();
    private ArrayList<String> split64Combo = new ArrayList<String>();
    private ArrayList<String> split65Combo = new ArrayList<String>();
    private ArrayList<String> split66Combo = new ArrayList<String>();
    private ArrayList<String> split67Combo = new ArrayList<String>();
    private ArrayList<String> split68Combo = new ArrayList<String>();
    private ArrayList<String> split69Combo = new ArrayList<String>();
    private ArrayList<String> split70Combo = new ArrayList<String>();
    private ArrayList<String> split71Combo = new ArrayList<String>();
    private ArrayList<String> split72Combo = new ArrayList<String>();
    private ArrayList<String> split73Combo = new ArrayList<String>();
    private ArrayList<String> split74Combo = new ArrayList<String>();
    private ArrayList<String> split75Combo = new ArrayList<String>();
    private ArrayList<String> split76Combo = new ArrayList<String>();
    private ArrayList<String> split77Combo = new ArrayList<String>();
    private ArrayList<String> split78Combo = new ArrayList<String>();
    private ArrayList<String> split79Combo = new ArrayList<String>();
    private ArrayList<String> split80Combo = new ArrayList<String>();
    private ArrayList<String> split81Combo = new ArrayList<String>();
    private ArrayList<String> split82Combo = new ArrayList<String>();
    private ArrayList<String> split83Combo = new ArrayList<String>();
    private ArrayList<String> split84Combo = new ArrayList<String>();
    private ArrayList<String> split85Combo = new ArrayList<String>();
    private ArrayList<String> split86Combo = new ArrayList<String>();
    private ArrayList<String> split87Combo = new ArrayList<String>();
    

    private ArrayList<String> corner1Combo = new ArrayList<String>();
    private ArrayList<String> corner2Combo = new ArrayList<String>();
    private ArrayList<String> corner3Combo = new ArrayList<String>();
    private ArrayList<String> corner4Combo = new ArrayList<String>();
    private ArrayList<String> corner5Combo = new ArrayList<String>();
    private ArrayList<String> corner6Combo = new ArrayList<String>();
    private ArrayList<String> corner7Combo = new ArrayList<String>();
    private ArrayList<String> corner8Combo = new ArrayList<String>();
    private ArrayList<String> corner9Combo = new ArrayList<String>();
    private ArrayList<String> corner10Combo = new ArrayList<String>();
    private ArrayList<String> corner11Combo = new ArrayList<String>();
    private ArrayList<String> corner12Combo = new ArrayList<String>();
    private ArrayList<String> corner13Combo = new ArrayList<String>();
    private ArrayList<String> corner14Combo = new ArrayList<String>();
    private ArrayList<String> corner15Combo = new ArrayList<String>();
    private ArrayList<String> corner16Combo = new ArrayList<String>();
    private ArrayList<String> corner17Combo = new ArrayList<String>();
    private ArrayList<String> corner18Combo = new ArrayList<String>();
    private ArrayList<String> corner19Combo = new ArrayList<String>();
    private ArrayList<String> corner20Combo = new ArrayList<String>();
    private ArrayList<String> corner21Combo = new ArrayList<String>();
    private ArrayList<String> corner22Combo = new ArrayList<String>();
    private ArrayList<String> corner23Combo = new ArrayList<String>();
    private ArrayList<String> corner24Combo = new ArrayList<String>();
    private ArrayList<String> corner25Combo = new ArrayList<String>();
    private ArrayList<String> corner26Combo = new ArrayList<String>();
    private ArrayList<String> corner27Combo = new ArrayList<String>();
    private ArrayList<String> corner28Combo = new ArrayList<String>();
    private ArrayList<String> corner29Combo = new ArrayList<String>();
    private ArrayList<String> corner30Combo = new ArrayList<String>();
    private ArrayList<String> corner31Combo = new ArrayList<String>();
    private ArrayList<String> corner32Combo = new ArrayList<String>();
    private ArrayList<String> corner33Combo = new ArrayList<String>();
    private ArrayList<String> corner34Combo = new ArrayList<String>();
    private ArrayList<String> corner35Combo = new ArrayList<String>();
    private ArrayList<String> corner36Combo = new ArrayList<String>();
    
    
    private ArrayList<String> aceStreetCombo = new ArrayList<String>();
    private ArrayList<String> twoStreetCombo = new ArrayList<String>();
    private ArrayList<String> threeStreetCombo = new ArrayList<String>();
    private ArrayList<String> fourStreetCombo = new ArrayList<String>();
    private ArrayList<String> fiveStreetCombo = new ArrayList<String>();
    private ArrayList<String> sixStreetCombo = new ArrayList<String>();
    private ArrayList<String> sevenStreetCombo = new ArrayList<String>();
    private ArrayList<String> eightStreetCombo = new ArrayList<String>();
    private ArrayList<String> nineStreetCombo = new ArrayList<String>();
    private ArrayList<String> tenStreetCombo = new ArrayList<String>();
    private ArrayList<String> jackStreetCombo = new ArrayList<String>();
    private ArrayList<String> queenStreetCombo = new ArrayList<String>();
    private ArrayList<String> kingStreetCombo = new ArrayList<String>();
    
    private ArrayList<String> diamondsCombo = new ArrayList<String>();
    private ArrayList<String> clubsCombo = new ArrayList<String>();
    private ArrayList<String> heartsCombo = new ArrayList<String>();
    private ArrayList<String> spadesCombo = new ArrayList<String>();
    
    
    public void createCombos()
    {
        redCombo.add("aceDiamonds");
        redCombo.add("aceHearts");
        redCombo.add("twoDiamonds");
        redCombo.add("twoHearts");
        redCombo.add("threeDiamonds");
        redCombo.add("threeHearts");
        redCombo.add("fourDiamonds");
        redCombo.add("fourHearts");
        redCombo.add("fiveDiamonds");
        redCombo.add("fiveHearts");
        redCombo.add("sixDiamonds");
        redCombo.add("sixHearts");
        redCombo.add("sevenDiamonds");
        redCombo.add("sevenHearts");
        redCombo.add("eightDiamonds");
        redCombo.add("eightHearts");
        redCombo.add("nineDiamonds");
        redCombo.add("nineHearts");
        redCombo.add("tenDiamonds");
        redCombo.add("tenHearts");
        redCombo.add("jackDiamonds");
        redCombo.add("jackHearts");
        redCombo.add("queenDiamonds");
        redCombo.add("queenHearts");
        redCombo.add("kingDiamonds");
        redCombo.add("kingHearts");
        
        blackCombo.add("aceClubs");
        blackCombo.add("aceSpades");
        blackCombo.add("twoClubs");
        blackCombo.add("twoSpades");
        blackCombo.add("threeClubs");
        blackCombo.add("threeSpades");
        blackCombo.add("fourClubs");
        blackCombo.add("fourSpades");
        blackCombo.add("fiveClubs");
        blackCombo.add("fiveSpades");
        blackCombo.add("sixClubs");
        blackCombo.add("sixSpades");
        blackCombo.add("sevenClubs");
        blackCombo.add("sevenSpades");
        blackCombo.add("eightClubs");
        blackCombo.add("eightSpades");
        blackCombo.add("nineClubs");
        blackCombo.add("nineSpades");
        blackCombo.add("tenClubs");
        blackCombo.add("tenSpades");
        blackCombo.add("jackClubs");
        blackCombo.add("jackSpades");
        blackCombo.add("queenClubs");
        blackCombo.add("queenSpades");
        blackCombo.add("kingClubs");
        blackCombo.add("kingSpades");
        
        
        aceToSixCombo.add("aceDiamonds");
        aceToSixCombo.add("aceClubs");
        aceToSixCombo.add("aceHearts");
        aceToSixCombo.add("aceSpades");
        aceToSixCombo.add("twoDiamonds");
        aceToSixCombo.add("twoClubs");
        aceToSixCombo.add("twoHearts");
        aceToSixCombo.add("fwoSpades");
        aceToSixCombo.add("threeDiamonds");
        aceToSixCombo.add("threeClubs");
        aceToSixCombo.add("threeHearts");
        aceToSixCombo.add("threeSpades");
        aceToSixCombo.add("fourDiamonds");
        aceToSixCombo.add("fourClubs");
        aceToSixCombo.add("fourHearts");
        aceToSixCombo.add("fourSpades");
        aceToSixCombo.add("fiveDiamonds");
        aceToSixCombo.add("fiveClubs");
        aceToSixCombo.add("fiveHearts");
        aceToSixCombo.add("fiveSpades");
        aceToSixCombo.add("sixDiamonds");
        aceToSixCombo.add("sixClubs");
        aceToSixCombo.add("sixHearts");
        aceToSixCombo.add("aixSpades");
        
        
        eightToKingCombo.add("eightDiamonds");
        eightToKingCombo.add("eightClubs");
        eightToKingCombo.add("eightHearts");
        eightToKingCombo.add("eightSpades");
        eightToKingCombo.add("nineDiamonds");
        eightToKingCombo.add("nineClubs");
        eightToKingCombo.add("nineHearts");
        eightToKingCombo.add("nineSpades");
        eightToKingCombo.add("tenDiamonds");
        eightToKingCombo.add("tenClubs");
        eightToKingCombo.add("tenHearts");
        eightToKingCombo.add("tenSpades");
        eightToKingCombo.add("jackDiamonds");
        eightToKingCombo.add("jackClubs");
        eightToKingCombo.add("jackHearts");
        eightToKingCombo.add("jackSpades");
        eightToKingCombo.add("queenDiamonds");
        eightToKingCombo.add("queenClubs");
        eightToKingCombo.add("queenHearts");
        eightToKingCombo.add("queenSpades");
        eightToKingCombo.add("kingDiamonds");
        eightToKingCombo.add("kingClubs");
        eightToKingCombo.add("kingHearts");
        eightToKingCombo.add("kingSpades");
        eightToKingCombo.add("joker");
        eightToKingCombo.add("jokerPlus");
        
       
        aceDiamondsCombo.add("aceDiamonds");
        aceClubsCombo.add("aceClubs");
        aceHeartsCombo.add("aceHearts");
        aceSpadesCombo.add("aceSpades");
        
        twoDiamondsCombo.add("twoDiamonds");
        twoClubsCombo.add("twoClubs");
        twoHeartsCombo.add("twoHearts");
        twoSpadesCombo.add("twoSpades");
        
        threeDiamondsCombo.add("threeDiamonds");
        threeClubsCombo.add("threeClubs");
        threeHeartsCombo.add("threeHearts");
        threeSpadesCombo.add("threeSpades");
                
        fourDiamondsCombo.add("fourDiamonds");
        fourClubsCombo.add("fourClubs");
        fourHeartsCombo.add("fourHearts");
        fourSpadesCombo.add("fourSpades");
        
        fiveDiamondsCombo.add("fiveDiamonds");
        fiveClubsCombo.add("fiveClubs");
        fiveHeartsCombo.add("fiveHearts");
        fiveSpadesCombo.add("fiveSpades");
        
        sixDiamondsCombo.add("sixDiamonds");
        sixClubsCombo.add("sixClubs");
        sixHeartsCombo.add("sixHearts");
        sixSpadesCombo.add("sixSpades");
        
        sevenDiamondsCombo.add("sevenDiamonds");
        sevenClubsCombo.add("sevenClubs");
        sevenHeartsCombo.add("sevenHearts");
        sevenSpadesCombo.add("sevenSpades");
        
        eightDiamondsCombo.add("eightDiamonds");
        eightClubsCombo.add("eightClubs");
        eightHeartsCombo.add("eightHearts");
        eightSpadesCombo.add("eightSpades");
        
        nineDiamondsCombo.add("nineDiamonds");
        nineClubsCombo.add("nineClubs");
        nineHeartsCombo.add("nineHearts");
        nineSpadesCombo.add("nineSpades");
        
        tenDiamondsCombo.add("tenDiamonds");
        tenClubsCombo.add("tenClubs");
        tenHeartsCombo.add("tenHearts");
        tenSpadesCombo.add("tenSpades");
        
        jackDiamondsCombo.add("jackDiamonds");
        jackClubsCombo.add("jackClubs");
        jackHeartsCombo.add("jackHearts");
        jackSpadesCombo.add("jackSpades");
        
        queenDiamondsCombo.add("queenDiamonds");
        queenClubsCombo.add("queenClubs");
        queenHeartsCombo.add("queenHearts");
        queenSpadesCombo.add("queenSpades");
        
        kingDiamondsCombo.add("kingDiamonds");
        kingClubsCombo.add("kingClubs");
        kingHeartsCombo.add("kingHearts");
        kingSpadesCombo.add("kingSpades");
        
        
        split1Combo.add("aceDiamonds");
        split1Combo.add("aceClubs");
        
        split2Combo.add("twoDiamonds");
        split2Combo.add("twoClubs");
        
        split3Combo.add("threeDiamonds");
        split3Combo.add("threeClubs");
        
        split4Combo.add("fourDiamonds");
        split4Combo.add("fourClubs");
        
        split5Combo.add("fiveDiamonds");
        split5Combo.add("fiveClubs");
        
        split6Combo.add("sixDiamonds");
        split6Combo.add("sixClubs");
        
        split7Combo.add("sevenDiamonds");
        split7Combo.add("sevenClubs");
        
        split8Combo.add("eightDiamonds");
        split8Combo.add("eightClubs");
        
        split9Combo.add("nineDiamonds");
        split9Combo.add("nineClubs");
        
        split10Combo.add("tenDiamonds");
        split10Combo.add("tenClubs");
        
        split11Combo.add("jackDiamonds");
        split11Combo.add("jackClubs");
        
        split12Combo.add("queenDiamonds");
        split12Combo.add("queenClubs");
        
        split13Combo.add("kingDiamonds");
        split13Combo.add("kingClubs");
        
        split14Combo.add("kingClubs");
        split14Combo.add("kingHearts");
        
        split15Combo.add("queenClubs");
        split15Combo.add("queenHearts");
        
        split16Combo.add("jackClubs");
        split16Combo.add("jackHearts");
        
        split17Combo.add("tenClubs");
        split17Combo.add("tenHearts");
        
        split18Combo.add("nineClubs");
        split18Combo.add("nineHearts");
        
        split19Combo.add("eightClubs");
        split19Combo.add("eightHearts");
        
        split20Combo.add("sevenClubs");
        split20Combo.add("sevenHearts");
        
        split21Combo.add("sixClubs");
        split21Combo.add("sixHearts");
        
        split22Combo.add("fiveClubs");
        split22Combo.add("fiveHearts");
        
        split23Combo.add("fourClubs");
        split23Combo.add("fourHearts");
        
        split24Combo.add("threeClubs");
        split24Combo.add("threeHearts");
        
        split25Combo.add("twoClubs");
        split25Combo.add("twoHearts");
        
        split26Combo.add("aceClubs");
        split26Combo.add("aceHearts");
        
        split27Combo.add("aceHearts");
        split27Combo.add("aceSpades");
        
        split28Combo.add("twoHearts");
        split28Combo.add("twoSpades");
        
        split29Combo.add("threeHearts");
        split29Combo.add("threeSpades");
        
        split30Combo.add("fourHearts");
        split30Combo.add("fourSpades");
        
        split31Combo.add("fiveHearts");
        split31Combo.add("fiveSpades");
        
        split32Combo.add("sixHearts");
        split32Combo.add("sixSpades");
        
        split33Combo.add("sevenHearts");
        split33Combo.add("sevenSpades");
        
        split34Combo.add("eightHearts");
        split34Combo.add("eightSpades");
        
        split35Combo.add("nineHearts");
        split35Combo.add("nineSpades");
        
        split36Combo.add("tenHearts");
        split36Combo.add("tenSpades");
        
        split37Combo.add("jackHearts");
        split37Combo.add("jackSpades");
        
        split38Combo.add("queenHearts");
        split38Combo.add("queenSpades");
        
        split39Combo.add("kingHearts");
        split39Combo.add("kingSpades");
        
        split40Combo.add("aceDiamonds");
        split40Combo.add("twoDiamonds");
        
        split41Combo.add("twoDiamonds");
        split41Combo.add("threeDiamonds");
        
        split42Combo.add("threeDiamonds");
        split42Combo.add("fourDiamonds");
        
        split43Combo.add("fourDiamonds");
        split43Combo.add("fiveDiamonds");
        
        split44Combo.add("fiveDiamonds");
        split44Combo.add("sixDiamonds");
        
        split45Combo.add("sixDiamonds");
        split45Combo.add("sevenDiamonds");
        
        split46Combo.add("sevenDiamonds");
        split46Combo.add("eightDiamonds");
        
        split47Combo.add("eightDiamonds");
        split47Combo.add("nineDiamonds");
        
        split48Combo.add("nineDiamonds");
        split48Combo.add("tenDiamonds");
        
        split49Combo.add("tenDiamonds");
        split49Combo.add("jackDiamonds");
        
        split50Combo.add("jackDiamonds");
        split50Combo.add("queenDiamonds");
        
        split51Combo.add("queenDiamonds");
        split51Combo.add("kingDiamonds");
        
        split52Combo.add("queenClubs");
        split52Combo.add("kingClubs");
        
        split53Combo.add("jackClubs");
        split53Combo.add("queenClubs");
        
        split54Combo.add("tenClubs");
        split54Combo.add("jackClubs");
        
        split55Combo.add("nineClubs");
        split55Combo.add("tenClubs");
        
        split56Combo.add("eightClubs");
        split56Combo.add("nineClubs");
        
        split57Combo.add("sevenClubs");
        split57Combo.add("eightClubs");
        
        split58Combo.add("sixClubs");
        split58Combo.add("sevenClubs");
        
        split59Combo.add("fiveClubs");
        split59Combo.add("sixClubs");
        
        split60Combo.add("fourClubs");
        split60Combo.add("fiveClubs");
        
        split61Combo.add("threeClubs");
        split61Combo.add("fourClubs");
        
        split62Combo.add("twoClubs");
        split62Combo.add("threeClubs");
        
        split63Combo.add("aceClubs");
        split63Combo.add("twoClubs");
        
        split64Combo.add("aceHearts");
        split64Combo.add("twoHearts");
        
        split65Combo.add("twoHearts");
        split65Combo.add("threeHearts");
        
        split66Combo.add("threeHearts");
        split66Combo.add("fourHearts");
        
        split67Combo.add("fourHearts");
        split67Combo.add("fiveHearts");
        
        split68Combo.add("fiveHearts");
        split68Combo.add("sixHearts");
        
        split69Combo.add("sixHearts");
        split69Combo.add("sevenHearts");
        
        split70Combo.add("sevenHearts");
        split70Combo.add("eightHearts");
        
        split71Combo.add("eightHearts");
        split71Combo.add("nineHearts");
        
        split72Combo.add("nineHearts");
        split72Combo.add("tenHearts");
        
        split73Combo.add("tenHearts");
        split73Combo.add("jackHearts");
        
        split74Combo.add("jackHearts");
        split74Combo.add("queenHearts");
        
        split75Combo.add("queenHearts");
        split75Combo.add("kingHearts");
        
        split76Combo.add("kingSpades");
        split76Combo.add("queenSpades");
        
        split77Combo.add("queenSpades");
        split77Combo.add("jackSpades");
        
        split78Combo.add("jackSpades");
        split78Combo.add("tenSpades");
        
        split79Combo.add("tenSpades");
        split79Combo.add("nineSpades");
        
        split80Combo.add("nineSpades");
        split80Combo.add("eightSpades");
        
        split81Combo.add("eightSpades");
        split81Combo.add("sevenSpades");
        
        split82Combo.add("sevenSpades");
        split82Combo.add("sixSpades");
        
        split83Combo.add("sixSpades");
        split83Combo.add("fiveSpades");
        
        split84Combo.add("fiveSpades");
        split84Combo.add("fourSpades");
        
        split85Combo.add("fourSpades");
        split85Combo.add("threeSpades");
        
        split86Combo.add("threeSpades");
        split86Combo.add("twoSpades");
        
        split87Combo.add("twoSpades");
        split87Combo.add("aceSpades");
            
        
        corner1Combo.add("aceDiamonds");
        corner1Combo.add("twoDiamonds");
        corner1Combo.add("aceClubs");
        corner1Combo.add("twoClubs");
        
        corner2Combo.add("twoDiamonds");
        corner2Combo.add("threeDiamonds");
        corner2Combo.add("twoClubs");
        corner2Combo.add("threeClubs");
        
        corner3Combo.add("threeDiamonds");
        corner3Combo.add("fourDiamonds");
        corner3Combo.add("threeClubs");
        corner3Combo.add("fourClubs");
        
        corner4Combo.add("fourDiamonds");
        corner4Combo.add("fiveDiamonds");
        corner4Combo.add("fourClubs");
        corner4Combo.add("fiveClubs");
        
        corner5Combo.add("fiveDiamonds");
        corner5Combo.add("sixDiamonds");
        corner5Combo.add("fiveClubs");
        corner5Combo.add("sixClubs");
        
        corner6Combo.add("sixDiamonds");
        corner6Combo.add("sevenDiamonds");
        corner6Combo.add("sixClubs");
        corner6Combo.add("sevenClubs");
        
        corner7Combo.add("sevemDiamonds");
        corner7Combo.add("eightDiamonds");
        corner7Combo.add("sevenClubs");
        corner7Combo.add("eightClubs");
        
        corner8Combo.add("eightDiamonds");
        corner8Combo.add("nineDiamonds");
        corner8Combo.add("eightClubs");
        corner8Combo.add("nineClubs");
        
        corner9Combo.add("nineDiamonds");
        corner9Combo.add("tenDiamonds");
        corner9Combo.add("nineClubs");
        corner9Combo.add("tenClubs");
        
        corner10Combo.add("tenDiamonds");
        corner10Combo.add("jackDiamonds");
        corner10Combo.add("tenClubs");
        corner10Combo.add("jackClubs");
        
        corner11Combo.add("jackDiamonds");
        corner11Combo.add("queenDiamonds");
        corner11Combo.add("jackClubs");
        corner11Combo.add("queenClubs");
        
        corner12Combo.add("queenDiamonds");
        corner12Combo.add("kingDiamonds");
        corner12Combo.add("queenClubs");
        corner12Combo.add("kingClubs");
        
        corner13Combo.add("queenClubs");
        corner13Combo.add("kingClubs");
        corner13Combo.add("queenHearts");
        corner13Combo.add("kingHearts");
        
        corner14Combo.add("jackClubs");
        corner14Combo.add("queenClubs");
        corner14Combo.add("jackHearts");
        corner14Combo.add("queenHearts");
        
        corner15Combo.add("tenClubs");
        corner15Combo.add("jackClubs");
        corner15Combo.add("tenHearts");
        corner15Combo.add("jackHearts");
        
        corner16Combo.add("nineClubs");
        corner16Combo.add("tenClubs");
        corner16Combo.add("nineHearts");
        corner16Combo.add("tenHearts");
        
        corner17Combo.add("eightClubs");
        corner17Combo.add("nineClubs");
        corner17Combo.add("eightHearts");
        corner17Combo.add("nineHearts");
        
        corner18Combo.add("sevenClubs");
        corner18Combo.add("eightClubs");
        corner18Combo.add("sevenHearts");
        corner18Combo.add("eightHearts");
        
        corner19Combo.add("sixClubs");
        corner19Combo.add("sevenClubs");
        corner19Combo.add("sixHearts");
        corner19Combo.add("sevenHearts");
        
        corner20Combo.add("fiveClubs");
        corner20Combo.add("sixClubs");
        corner20Combo.add("fiveHearts");
        corner20Combo.add("sixHearts");
        
        corner21Combo.add("fourClubs");
        corner21Combo.add("fiveClubs");
        corner21Combo.add("fourHearts");
        corner21Combo.add("fiveHearts");
        
        corner22Combo.add("threeClubs");
        corner22Combo.add("fourClubs");
        corner22Combo.add("threeHearts");
        corner22Combo.add("fourHearts");
        
        corner23Combo.add("twoClubs");
        corner23Combo.add("threeClubs");
        corner23Combo.add("twoHearts");
        corner23Combo.add("threeHearts");
        
        corner24Combo.add("aceClubs");
        corner24Combo.add("twoClubs");
        corner24Combo.add("aceHearts");
        corner24Combo.add("twoHearts");
        
        corner25Combo.add("aceHearts");
        corner25Combo.add("twoHearts");
        corner25Combo.add("aceSpades");
        corner25Combo.add("twoSpades");
        
        corner26Combo.add("twoHearts");
        corner26Combo.add("threeHearts");
        corner26Combo.add("twoSpades");
        corner26Combo.add("threeSpades");
        
        corner27Combo.add("threeHearts");
        corner27Combo.add("fourHearts");
        corner27Combo.add("threeSpades");
        corner27Combo.add("fourSpades");
        
        corner28Combo.add("fourHearts");
        corner28Combo.add("fiveHearts");
        corner28Combo.add("fourSpades");
        corner28Combo.add("fiveSpades");
        
        corner29Combo.add("fiveHearts");
        corner29Combo.add("sixHearts");
        corner29Combo.add("fiveSpades");
        corner29Combo.add("sixpades");
        
        corner30Combo.add("sixHearts");
        corner30Combo.add("sevenHearts");
        corner30Combo.add("sixSpades");
        corner30Combo.add("sevenSpades");
        
        corner31Combo.add("sevenHearts");
        corner31Combo.add("eightHearts");
        corner31Combo.add("sevenSpades");
        corner31Combo.add("eightSpades");
        
        corner32Combo.add("eightHearts");
        corner32Combo.add("nineHearts");
        corner32Combo.add("eightSpades");
        corner32Combo.add("nineSpades");
        
        corner33Combo.add("nineHearts");
        corner33Combo.add("tenHearts");
        corner33Combo.add("nineSpades");
        corner33Combo.add("tenSpades");
        
        corner34Combo.add("tenHearts");
        corner34Combo.add("jackHearts");
        corner34Combo.add("tenSpades");
        corner34Combo.add("jackSpades");
        
        corner35Combo.add("jackHearts");
        corner35Combo.add("queenHearts");
        corner35Combo.add("jackSpades");
        corner35Combo.add("queenSpades");
        
        corner36Combo.add("queenHearts");
        corner36Combo.add("kingHearts");
        corner36Combo.add("queenSpades");
        corner36Combo.add("kingSpades");
        
        
                
        aceStreetCombo.add("aceDiamonds");
        aceStreetCombo.add("aceClubs");
        aceStreetCombo.add("aceHearts");
        aceStreetCombo.add("aceSpades");
        
        twoStreetCombo.add("twoDiamonds");
        twoStreetCombo.add("twoClubs");
        twoStreetCombo.add("twoHearts");
        twoStreetCombo.add("twoSpades");
        
        threeStreetCombo.add("threeDiamonds");
        threeStreetCombo.add("threeClubs");
        threeStreetCombo.add("threeHearts");
        threeStreetCombo.add("threeSpades");
                
        fourStreetCombo.add("fourDiamonds");
        fourStreetCombo.add("fourClubs");
        fourStreetCombo.add("fourHearts");
        fourStreetCombo.add("fourSpades");
        
        fiveStreetCombo.add("fiveDiamonds");
        fiveStreetCombo.add("fiveClubs");
        fiveStreetCombo.add("fiveHearts");
        fiveStreetCombo.add("fiveSpades");
        
        sixStreetCombo.add("sixDiamonds");
        sixStreetCombo.add("sixClubs");
        sixStreetCombo.add("sixHearts");
        sixStreetCombo.add("sixSpades");
        
        sevenStreetCombo.add("sevenDiamonds");
        sevenStreetCombo.add("sevenClubs");
        sevenStreetCombo.add("sevenHearts");
        sevenStreetCombo.add("sevenSpades");
        
        eightStreetCombo.add("eightDiamonds");
        eightStreetCombo.add("eightClubs");
        eightStreetCombo.add("eightHearts");
        eightStreetCombo.add("eightSpades");
        
        nineStreetCombo.add("nineDiamonds");
        nineStreetCombo.add("nineClubs");
        nineStreetCombo.add("nineHearts");
        nineStreetCombo.add("nineSpades");
        
        tenStreetCombo.add("tenDiamonds");
        tenStreetCombo.add("tenClubs");
        tenStreetCombo.add("tenHearts");
        tenStreetCombo.add("tenSpades");
        
        jackStreetCombo.add("jackDiamonds");
        jackStreetCombo.add("jackClubs");
        jackStreetCombo.add("jackHearts");
        jackStreetCombo.add("jackSpades");
        
        queenStreetCombo.add("queenDiamonds");
        queenStreetCombo.add("queenClubs");
        queenStreetCombo.add("queenHearts");
        queenStreetCombo.add("queenSpades");
        
        kingStreetCombo.add("kingDiamonds");
        kingStreetCombo.add("kingClubs");
        kingStreetCombo.add("kingHearts");
        kingStreetCombo.add("kingSpades");
        
        jokerCombo.add("joker");
        jokerPlusCombo.add("jokerPlus");
        
        
        diamondsCombo.add("aceDiamonds");
        diamondsCombo.add("twoDiamonds");
        diamondsCombo.add("threeDiamonds");
        diamondsCombo.add("fourDiamonds");
        diamondsCombo.add("fiveDiamonds");
        diamondsCombo.add("sixDiamonds");
        diamondsCombo.add("sevenDiamonds");
        diamondsCombo.add("eightDiamonds");
        diamondsCombo.add("nineDiamonds");
        diamondsCombo.add("tenDiamonds");
        diamondsCombo.add("jackDiamonds");
        diamondsCombo.add("queenDiamonds");
        diamondsCombo.add("kingDiamonds");
        
        clubsCombo.add("aceClubs");
        clubsCombo.add("twoClubs");
        clubsCombo.add("threeClubs");
        clubsCombo.add("fourClubs");
        clubsCombo.add("fiveClubs");
        clubsCombo.add("sixClubs");
        clubsCombo.add("sevenClubs");
        clubsCombo.add("eightClubs");
        clubsCombo.add("nineClubs");
        clubsCombo.add("tenClubs");
        clubsCombo.add("jackClubs");
        clubsCombo.add("queenClubs");
        clubsCombo.add("kingClubs");
        
        heartsCombo.add("aceHearts");
        heartsCombo.add("twoHearts");
        heartsCombo.add("threeHearts");
        heartsCombo.add("fourHearts");
        heartsCombo.add("fiveHearts");
        heartsCombo.add("sixHearts");
        heartsCombo.add("sevenHearts");
        heartsCombo.add("eightHearts");
        heartsCombo.add("nineHearts");
        heartsCombo.add("tenHearts");
        heartsCombo.add("jackHearts");
        heartsCombo.add("queenHearts");
        heartsCombo.add("kingHearts");
        
        spadesCombo.add("aceSpades");
        spadesCombo.add("twoSpades");
        spadesCombo.add("threeSpades");
        spadesCombo.add("fourSpades");
        spadesCombo.add("fiveSpades");
        spadesCombo.add("sixSpades");
        spadesCombo.add("sevenSpades");
        spadesCombo.add("eightSpades");
        spadesCombo.add("nineSpades");
        spadesCombo.add("tenSpades");
        spadesCombo.add("jackSpades");
        spadesCombo.add("queenSpades");
        spadesCombo.add("kingSpades");
        
    }
    
    Map<String, ArrayList<String>> cardCombos = new HashMap<String, ArrayList<String>>() {{
        
        put("reds", redCombo);
        put("blacks", blackCombo);
        put("aceToSix", aceToSixCombo);
        put("eightToKing", eightToKingCombo);
        
        put("aceDiamonds", aceDiamondsCombo);
        put("aceClubs", aceClubsCombo);
        put("aceHearts", aceHeartsCombo);
        put("aceSpades", aceSpadesCombo);
        
        put("twoDiamonds", twoDiamondsCombo);
        put("twoClubs", twoClubsCombo);
        put("twoHearts", twoHeartsCombo);
        put("twoSpades", twoSpadesCombo);
        
        put("threeDiamonds", threeDiamondsCombo);
        put("threeClubs", threeClubsCombo);
        put("threeHearts", threeHeartsCombo);
        put("threeSpades", threeSpadesCombo);
        
        put("fourDiamonds", fourDiamondsCombo);
        put("fourClubs", fourClubsCombo);
        put("fourHearts", fourHeartsCombo);
        put("fourSpades", fourSpadesCombo);
        
        put("fiveDiamonds", fiveDiamondsCombo);
        put("fiveClubs", fiveClubsCombo);
        put("fiveHearts", fiveHeartsCombo);
        put("fiveSpades", fiveSpadesCombo);
        
        put("sixDiamonds", sixDiamondsCombo);
        put("sixClubs", sixClubsCombo);
        put("sixHearts", sixHeartsCombo);
        put("sixSpades", sixSpadesCombo);
        
        put("sevenDiamonds", sevenDiamondsCombo);
        put("sevenClubs", sevenClubsCombo);
        put("sevenHearts", sevenHeartsCombo);
        put("sevenSpades", sevenSpadesCombo);
        
        put("eightDiamonds", eightDiamondsCombo);
        put("eightClubs", eightClubsCombo);
        put("eightHearts", eightHeartsCombo);
        put("eightSpades", eightSpadesCombo);
        
        put("nineDiamonds", nineDiamondsCombo);
        put("nineClubs", nineClubsCombo);
        put("nineHearts", nineHeartsCombo);
        put("nineSpades", nineSpadesCombo);
        
        put("tenDiamonds", tenDiamondsCombo);
        put("tenClubs", tenClubsCombo);
        put("tenHearts", tenHeartsCombo);
        put("tenSpades", tenSpadesCombo);
        
        put("jackDiamonds", jackDiamondsCombo);
        put("jackClubs", jackClubsCombo);
        put("jackHearts", jackHeartsCombo);
        put("jackSpades", jackSpadesCombo);
        
        put("queenDiamonds", queenDiamondsCombo);
        put("queenClubs", queenClubsCombo);
        put("queenHearts", queenHeartsCombo);
        put("queenSpades", queenSpadesCombo);
        
        put("kingDiamonds", kingDiamondsCombo);
        put("kingClubs", kingClubsCombo);
        put("kingHearts", kingHeartsCombo);
        put("kingSpades", kingSpadesCombo);
        
        put("joker", jokerCombo);
        put("jokerPlus", jokerPlusCombo);
        
        
        put("split1", split1Combo);
        put("split2", split2Combo);
        put("split3", split3Combo);
        put("split4", split4Combo);
        put("split5", split5Combo);
        put("split6", split6Combo);
        put("split7", split7Combo);
        put("split8", split8Combo);
        put("split9", split9Combo);
        put("split10", split10Combo);
        put("split11", split11Combo);
        put("split12", split12Combo);
        put("split13", split13Combo);
        put("split14", split14Combo);
        put("split15", split15Combo);
        put("split16", split16Combo);
        put("split17", split17Combo);
        put("split18", split18Combo);
        put("split19", split19Combo);
        put("split20", split20Combo);
        put("split21", split21Combo);
        put("split22", split22Combo);
        put("split23", split23Combo);
        put("split24", split24Combo);
        put("split25", split25Combo);
        put("split26", split26Combo);
        put("split27", split27Combo);
        put("split28", split28Combo);
        put("split29", split29Combo);
        put("split30", split30Combo);
        put("split31", split31Combo);
        put("split32", split32Combo);
        put("split33", split33Combo);
        put("split34", split34Combo);
        put("split35", split35Combo);
        put("split36", split36Combo);
        put("split37", split37Combo);
        put("split38", split38Combo);
        put("split39", split39Combo);
        put("split40", split40Combo);
        put("split41", split41Combo);
        put("split42", split42Combo);
        put("split43", split43Combo);
        put("split44", split44Combo);
        put("split45", split45Combo);
        put("split46", split46Combo);
        put("split47", split47Combo);
        put("split48", split48Combo);
        put("split49", split49Combo);
        put("split50", split50Combo);
        put("split51", split51Combo);
        put("split52", split52Combo);
        put("split53", split53Combo);
        put("split54", split54Combo);
        put("split55", split55Combo);
        put("split56", split56Combo);
        put("split57", split57Combo);
        put("split58", split58Combo);
        put("split59", split59Combo);
        put("split60", split60Combo);
        put("split61", split61Combo);
        put("split62", split62Combo);
        put("split63", split63Combo);
        put("split64", split64Combo);
        put("split65", split65Combo);
        put("split66", split66Combo);
        put("split67", split67Combo);
        put("split68", split68Combo);
        put("split69", split69Combo);
        put("split70", split70Combo);
        put("split71", split71Combo);
        put("split72", split72Combo);
        put("split73", split73Combo);
        put("split74", split74Combo);
        put("split75", split75Combo);
        put("split76", split76Combo);
        put("split77", split77Combo);
        put("split78", split78Combo);
        put("split79", split79Combo);
        put("split80", split80Combo);
        put("split81", split81Combo);
        put("split82", split82Combo);
        put("split83", split83Combo);
        put("split84", split84Combo);
        put("split85", split85Combo);
        put("split86", split86Combo);
        put("split87", split87Combo);
       
        
        put("corner1", corner1Combo); 
        put("corner2", corner2Combo); 
        put("corner3", corner3Combo); 
        put("corner4", corner4Combo); 
        put("corner5", corner5Combo);
        put("corner6", corner6Combo); 
        put("corner7", corner7Combo); 
        put("corner8", corner8Combo); 
        put("corner9", corner9Combo); 
        put("corner10", corner10Combo); 
        put("corner11", corner11Combo); 
        put("corner12", corner12Combo); 
        put("corner13", corner13Combo); 
        put("corner14", corner14Combo); 
        put("corner15", corner15Combo); 
        put("corner16", corner16Combo); 
        put("corner17", corner17Combo); 
        put("corner18", corner18Combo); 
        put("corner19", corner19Combo); 
        put("corner20", corner20Combo); 
        put("corner21", corner21Combo); 
        put("corner22", corner22Combo); 
        put("corner23", corner23Combo); 
        put("corner24", corner24Combo); 
        put("corner25", corner25Combo); 
        put("corner26", corner26Combo); 
        put("corner27", corner27Combo); 
        put("corner28", corner28Combo); 
        put("corner29", corner29Combo); 
        put("corner30", corner30Combo); 
        put("corner31", corner31Combo); 
        put("corner32", corner32Combo); 
        put("corner33", corner33Combo); 
        put("corner34", corner34Combo); 
        put("corner35", corner35Combo); 
        put("corner36", corner36Combo); 
        
        
        put("aceStreet", aceStreetCombo);
        put("twoStreet", twoStreetCombo);
        put("threeStreet", threeStreetCombo);
        put("fourStreet", fourStreetCombo);
        put("fiveStreet", fiveStreetCombo);
        put("sixStreet", sixStreetCombo);
        put("sevenStreet", sevenStreetCombo);
        put("eightStreet", eightStreetCombo);
        put("nineStreet", nineStreetCombo);
        put("tenStreet", tenStreetCombo);
        put("jackStreet", tenStreetCombo);
        put("queenStreet", queenStreetCombo);
        put("kingStreet", kingStreetCombo);
        
    }};
    
    
    Map<String, Integer> firstCardValues = new HashMap<String, Integer>() {{
        
        put("reds", 2);
        put("blacks", 2);
        put("aceToSix", 2);
        put("kingToEight", 2);
                
        
        put("aceDiamonds", 11);
        put("aceClubs", 11);
        put("aceHearts", 11);
        put("aceSpades", 11);
        put("twoDiamonds", 11);
        put("twoClubs", 11);
        put("twoHearts", 11);
        put("twoSpades", 11);
        put("threeDiamonds", 11);
        put("threeClubs", 11);
        put("threeHearts", 11);
        put("threeSpades", 11);
        put("fourDiamonds", 11);
        put("fourClubs", 11);
        put("fourHearts", 11);
        put("fourSpades", 11);
        put("fiveDiamonds", 11);
        put("fiveClubs", 11);
        put("fiveHearts", 11);
        put("fiveSpades", 11);
        put("sixDiamonds", 11);
        put("sixClubs", 11);
        put("sixHearts", 11);
        put("sixSpades", 11);
        put("sevenDiamonds", 11);
        put("sevenClubs", 11);
        put("sevenHearts", 11);
        put("sevenSpades", 11);
        put("eightDiamonds", 11);
        put("eightClubs", 11);
        put("eightHearts", 11);
        put("eightSpades", 11);
        put("nineDiamonds", 11);
        put("nineClubs", 11);
        put("nineHearts", 11);
        put("nineSpades", 11);
        put("tenDiamonds", 11);
        put("tenClubs", 11);
        put("tenHearts", 11);
        put("tenSpades", 11);
        put("jackDiamonds", 11);
        put("jackClubs", 11);
        put("jackHearts", 11);
        put("jackSpades", 11);
        put("queenDiamonds", 11);
        put("queenClubs", 11);
        put("queenHearts", 11);
        put("queenSpades", 11);
        put("kingDiamonds", 11);
        put("kingClubs", 11);
        put("kingHearts", 11);
        put("kingSpades", 11);
        
        put("joker", 11);
        put("jokerPlus", 11);
       

        put("split1", 5);
        put("split2", 5);
        put("split3", 5);
        put("split4", 5);
        put("split5", 5);
        put("split6", 5);
        put("split7", 5);
        put("split8", 5);
        put("split9", 5);
        put("split10", 5);
        put("split11", 5);
        put("split12", 5);
        put("split13", 5);
        put("split14", 5);
        put("split15", 5);
        put("split16", 5);
        put("split17", 5);
        put("split18", 5);
        put("split19", 5);
        put("split20", 5);
        put("split21", 5);
        put("split22", 5);
        put("split23", 5);
        put("split24", 5);
        put("split25", 5);
        put("split26", 5);
        put("split27", 5);
        put("split28", 5);
        put("split29", 5);
        put("split30", 5);
        put("split31", 5);
        put("split32", 5);
        put("split33", 5);
        put("split34", 5);
        put("split35", 5);
        put("split36", 5);
        put("split37", 5);
        put("split38", 5);
        put("split39", 5);
        put("split40", 5);
        put("split41", 5);
        put("split42", 5);
        put("split43", 5);
        put("split44", 5);
        put("split45", 5);
        put("split46", 5);
        put("split47", 5);
        put("split48", 5);
        put("split49", 5);
        put("split50", 5);
        put("split51", 5);
        put("split52", 5);
        put("split53", 5);
        put("split54", 5);
        put("split55", 5);
        put("split56", 5);
        put("split57", 5);
        put("split58", 5);
        put("split59", 5);
        put("split60", 5);
        put("split61", 5);
        put("split62", 5);
        put("split63", 5);
        put("split64", 5);
        put("split65", 5);
        put("split66", 5);
        put("split67", 5);
        put("split68", 5);
        put("split69", 5);
        put("split70", 5);
        put("split71", 5);
        put("split72", 5);
        put("split73", 5);
        put("split74", 5);
        put("split75", 5);
        put("split76", 5);
        put("split77", 5);
        put("split78", 5);
        put("split79", 5);
        put("split80", 5);
        put("split81", 5);
        put("split82", 5);
        put("split83", 5);
        put("split84", 5);
        put("split85", 5);
        put("split86", 5);
        put("split87", 5);
        
        
        put("aceStreet", 4);
        put("twoStreet", 4);
        put("threeStreet", 4);
        put("fourStreet", 4);
        put("fiveStreet", 4);
        put("sixStreet", 4);
        put("sevenStreet", 4);
        put("eightStreet", 4);
        put("nineStreet", 4);
        put("tenStreet", 4);
        put("jackStreet", 4);
        put("queenStreet", 4);
        put("kingStreet", 4);
        
        
        put("corner1", 4);
        put("corner2", 4);
        put("corner3", 4);
        put("corner4", 4);
        put("corner5", 4);
        put("corner6", 4);
        put("corner7", 4);
        put("corner8", 4);
        put("corner9", 4);
        put("corner10", 4);
        put("corner11", 4);
        put("corner12", 4);
        put("corner13", 4);
        put("corner14", 4);
        put("corner15", 4);
        put("corner16", 4);
        put("corner17", 4);
        put("corner18", 4);
        put("corner19", 4);
        put("corner20", 4);
        put("corner21", 4);
        put("corner22", 4);
        put("corner23", 4);
        put("corner24", 4);
        put("corner25", 4);
        put("corner26", 4);
        put("corner27", 4);
        put("corner28", 4);
        put("corner29", 4);
        put("corner30", 4);
        put("corner31", 4);
        put("corner32", 4);
        put("corner33", 4);
        put("corner34", 4);
        put("corner35", 4);
        put("corner36", 4);
        
     
    }};

    
    Map<String, Integer> otherCardValues = new HashMap<String, Integer>() {{
        put("reds", 0);
        put("blacks", 0);
        put("aceToSix", 0);
        put("kingToEight", 0);
        
        put("aceDiamonds", 9);
        put("aceClubs", 9);
        put("aceHearts", 9);
        put("aceSpades", 9);
        put("twoDiamonds", 9);
        put("twoClubs", 9);
        put("twoHearts", 9);
        put("twoSpades", 9);
        put("threeDiamonds", 9);
        put("threeClubs", 9);
        put("threeHearts", 9);
        put("threeSpades", 9);
        put("fourDiamonds", 9);
        put("fourClubs", 9);
        put("fourHearts", 9);
        put("fourSpades", 9);
        put("fiveDiamonds", 9);
        put("fiveClubs", 9);
        put("fiveHearts", 9);
        put("fiveSpades", 9);
        put("sixDiamonds", 9);
        put("sixClubs", 9);
        put("sixHearts", 9);
        put("sixSpades", 9);
        put("sevenDiamonds", 9);
        put("sevenClubs", 9);
        put("sevenHearts", 9);
        put("sevenSpades", 9);
        put("eightDiamonds", 9);
        put("eightClubs", 9);
        put("eightHearts", 9);
        put("eightSpades", 9);
        put("nineDiamonds", 9);
        put("nineClubs", 9);
        put("nineHearts", 9);
        put("nineSpades", 9);
        put("tenDiamonds", 9);
        put("tenClubs", 9);
        put("tenHearts", 9);
        put("tenSpades", 9);
        put("jackDiamonds", 9);
        put("jackClubs", 9);
        put("jackHearts", 9);
        put("jackSpades", 9);
        put("queenDiamonds", 9);
        put("queenClubs", 9);
        put("queenHearts", 9);
        put("queenSpades", 9);
        put("kingDiamonds", 9);
        put("kingClubs", 9);
        put("kingHearts", 9);
        put("kingSpades", 9);
       
        put("joker", 9);
        put("jokerPlus", 9);
        
        put("split1", 4);
        put("split2", 4);
        put("split3", 4);
        put("split4", 4);
        put("split5", 4);
        put("split6", 4);
        put("split7", 4);
        put("split8", 4);
        put("split9", 4);
        put("split10", 4);
        put("split11", 4);
        put("split12", 4);
        put("split13", 4);
        put("split14", 4);
        put("split15", 4);
        put("split16", 4);
        put("split17", 4);
        put("split18", 4);
        put("split19", 4);
        put("split20", 4);
        put("split21", 4);
        put("split22", 4);
        put("split23", 4);
        put("split24", 4);
        put("split25", 4);
        put("split26", 4);
        put("split27", 4);
        put("split28", 4);
        put("split29", 4);
        put("split30", 4);
        put("split31", 4);
        put("split32", 4);
        put("split33", 4);
        put("split34", 4);
        put("split35", 4);
        put("split36", 4);
        put("split37", 4);
        put("split38", 4);
        put("split39", 4);
        put("split40", 4);
        put("split41", 4);
        put("split42", 4);
        put("split43", 4);
        put("split44", 4);
        put("split45", 4);
        put("split46", 4);
        put("split47", 4);
        put("split48", 4);
        put("split49", 4);
        put("split50", 4);
        put("split51", 4);
        put("split52", 4);
        put("split53", 4);
        put("split54", 4);
        put("split55", 4);
        put("split56", 4);
        put("split57", 4);
        put("split58", 4);
        put("split59", 4);
        put("split60", 4);
        put("split61", 4);
        put("split62", 4);
        put("split63", 4);
        put("split64", 4);
        put("split65", 4);
        put("split66", 4);
        put("split67", 4);
        put("split68", 4);
        put("split69", 4);
        put("split70", 4);
        put("split71", 4);
        put("split72", 4);
        put("split73", 4);
        put("split74", 4);
        put("split75", 4);
        put("split76", 4);
        put("split77", 4);
        put("split78", 4);
        put("split79", 4);
        put("split80", 4);
        put("split81", 4);
        put("split82", 4);
        put("split83", 4);
        put("split84", 4);
        put("split85", 4);
        put("split86", 4);
        put("split87", 4);
       
        
        put("aceStreet", 1);
        put("twoStreet", 1);
        put("threeStreet", 1);
        put("fourStreet", 1);
        put("fiveStreet", 1);
        put("sixStreet", 1);
        put("sevenStreet", 1);
        put("eightStreet", 1);
        put("nineStreet", 1);
        put("tenStreet", 1);
        put("jackStreet", 1);
        put("queenStreet", 1);
        put("kingStreet", 1);
        
        
        put("corner1", 1);
        put("corner2", 1);
        put("corner3", 1);
        put("corner4", 1);
        put("corner5", 1);
        put("corner6", 1);
        put("corner7", 1);
        put("corner8", 1);
        put("corner9", 1);
        put("corner10", 1);
        put("corner11", 1);
        put("corner12", 1);
        put("corner13", 1);
        put("corner14", 1);
        put("corner15", 1);
        put("corner16", 1);
        put("corner17", 1);
        put("corner18", 1);
        put("corner19", 1);
        put("corner20", 1);
        put("corner21", 1);
        put("corner22", 1);
        put("corner23", 1);
        put("corner24", 1);
        put("corner25", 1);
        put("corner26", 1);
        put("corner27", 1);
        put("corner28", 1);
        put("corner29", 1);
        put("corner30", 1);
        put("corner31", 1);
        put("corner32", 1);
        put("corner33", 1);
        put("corner34", 1);
        put("corner35", 1);
        put("corner36", 1);
        
     
    }};
    
    
    
    
    /**
     * Creates new form PokerletteBoard
     */
    public PokerletteBoard() {
        initComponents();
    }
    
    public void setBalance(int b)
    {
        balance = b;
        balanceLabel.setText("Balance: " + b);
    }
    
     public int getBalance()
     {
        return balance;
     }

    public void setName(String n)
    {
        nameLabel.setText("Name: " + n);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        corner36 = new javax.swing.JButton();
        corner13 = new javax.swing.JButton();
        corner12 = new javax.swing.JButton();
        corner11 = new javax.swing.JButton();
        corner14 = new javax.swing.JButton();
        corner35 = new javax.swing.JButton();
        corner34 = new javax.swing.JButton();
        corner15 = new javax.swing.JButton();
        corner10 = new javax.swing.JButton();
        corner32 = new javax.swing.JButton();
        corner17 = new javax.swing.JButton();
        corner8 = new javax.swing.JButton();
        corner7 = new javax.swing.JButton();
        corner18 = new javax.swing.JButton();
        corner31 = new javax.swing.JButton();
        corner6 = new javax.swing.JButton();
        corner19 = new javax.swing.JButton();
        corner30 = new javax.swing.JButton();
        corner5 = new javax.swing.JButton();
        corner20 = new javax.swing.JButton();
        corner29 = new javax.swing.JButton();
        corner4 = new javax.swing.JButton();
        corner21 = new javax.swing.JButton();
        corner28 = new javax.swing.JButton();
        corner3 = new javax.swing.JButton();
        corner22 = new javax.swing.JButton();
        corner27 = new javax.swing.JButton();
        corner2 = new javax.swing.JButton();
        corner23 = new javax.swing.JButton();
        corner26 = new javax.swing.JButton();
        corner25 = new javax.swing.JButton();
        corner24 = new javax.swing.JButton();
        corner1 = new javax.swing.JButton();
        corner9 = new javax.swing.JButton();
        corner33 = new javax.swing.JButton();
        corner16 = new javax.swing.JButton();
        split1 = new javax.swing.JButton();
        split2 = new javax.swing.JButton();
        split3 = new javax.swing.JButton();
        split4 = new javax.swing.JButton();
        split5 = new javax.swing.JButton();
        split6 = new javax.swing.JButton();
        split7 = new javax.swing.JButton();
        split8 = new javax.swing.JButton();
        split9 = new javax.swing.JButton();
        split10 = new javax.swing.JButton();
        split11 = new javax.swing.JButton();
        split12 = new javax.swing.JButton();
        split13 = new javax.swing.JButton();
        split14 = new javax.swing.JButton();
        split15 = new javax.swing.JButton();
        split16 = new javax.swing.JButton();
        split17 = new javax.swing.JButton();
        split18 = new javax.swing.JButton();
        split19 = new javax.swing.JButton();
        split20 = new javax.swing.JButton();
        split21 = new javax.swing.JButton();
        split22 = new javax.swing.JButton();
        split23 = new javax.swing.JButton();
        split24 = new javax.swing.JButton();
        split25 = new javax.swing.JButton();
        split26 = new javax.swing.JButton();
        split27 = new javax.swing.JButton();
        split28 = new javax.swing.JButton();
        split29 = new javax.swing.JButton();
        split30 = new javax.swing.JButton();
        split31 = new javax.swing.JButton();
        split32 = new javax.swing.JButton();
        split33 = new javax.swing.JButton();
        split34 = new javax.swing.JButton();
        split35 = new javax.swing.JButton();
        split36 = new javax.swing.JButton();
        split37 = new javax.swing.JButton();
        split38 = new javax.swing.JButton();
        split39 = new javax.swing.JButton();
        split40 = new javax.swing.JButton();
        split63 = new javax.swing.JButton();
        split64 = new javax.swing.JButton();
        split87 = new javax.swing.JButton();
        split41 = new javax.swing.JButton();
        split62 = new javax.swing.JButton();
        split65 = new javax.swing.JButton();
        split86 = new javax.swing.JButton();
        split42 = new javax.swing.JButton();
        split61 = new javax.swing.JButton();
        split66 = new javax.swing.JButton();
        split85 = new javax.swing.JButton();
        split43 = new javax.swing.JButton();
        split60 = new javax.swing.JButton();
        split67 = new javax.swing.JButton();
        split84 = new javax.swing.JButton();
        split44 = new javax.swing.JButton();
        split59 = new javax.swing.JButton();
        split68 = new javax.swing.JButton();
        split83 = new javax.swing.JButton();
        split45 = new javax.swing.JButton();
        split58 = new javax.swing.JButton();
        split69 = new javax.swing.JButton();
        split82 = new javax.swing.JButton();
        split46 = new javax.swing.JButton();
        split57 = new javax.swing.JButton();
        split70 = new javax.swing.JButton();
        split81 = new javax.swing.JButton();
        split47 = new javax.swing.JButton();
        split56 = new javax.swing.JButton();
        split71 = new javax.swing.JButton();
        split80 = new javax.swing.JButton();
        split48 = new javax.swing.JButton();
        split55 = new javax.swing.JButton();
        split72 = new javax.swing.JButton();
        split79 = new javax.swing.JButton();
        split49 = new javax.swing.JButton();
        split54 = new javax.swing.JButton();
        split73 = new javax.swing.JButton();
        split78 = new javax.swing.JButton();
        split50 = new javax.swing.JButton();
        split53 = new javax.swing.JButton();
        split74 = new javax.swing.JButton();
        split77 = new javax.swing.JButton();
        split51 = new javax.swing.JButton();
        split52 = new javax.swing.JButton();
        split75 = new javax.swing.JButton();
        split76 = new javax.swing.JButton();
        twoStreet = new javax.swing.JButton();
        threeStreet = new javax.swing.JButton();
        fourStreet = new javax.swing.JButton();
        fiveStreet = new javax.swing.JButton();
        sixStreet = new javax.swing.JButton();
        sevenStreet = new javax.swing.JButton();
        eightStreet = new javax.swing.JButton();
        nineStreet = new javax.swing.JButton();
        tenStreet = new javax.swing.JButton();
        jackStreet = new javax.swing.JButton();
        firstThreeCards = new javax.swing.JButton();
        kingStreet = new javax.swing.JButton();
        queenStreet = new javax.swing.JButton();
        aceStreet = new javax.swing.JButton();
        aceToSix = new javax.swing.JButton();
        redSpot = new javax.swing.JButton();
        luckySevens = new javax.swing.JButton();
        blackSpot = new javax.swing.JButton();
        eightToKing = new javax.swing.JButton();
        allFiveCards = new javax.swing.JButton();
        diamondsRow = new javax.swing.JButton();
        clubsRow = new javax.swing.JButton();
        heartsRow = new javax.swing.JButton();
        spadesRow = new javax.swing.JButton();
        joker1 = new javax.swing.JButton();
        joker2 = new javax.swing.JButton();
        aceDiamonds = new javax.swing.JButton();
        aceClubs = new javax.swing.JButton();
        aceHearts = new javax.swing.JButton();
        aceSpades = new javax.swing.JButton();
        twoDiamonds = new javax.swing.JButton();
        twoClubs = new javax.swing.JButton();
        twoHearts = new javax.swing.JButton();
        twoSpades = new javax.swing.JButton();
        threeDiamonds = new javax.swing.JButton();
        threeClubs = new javax.swing.JButton();
        threeHearts = new javax.swing.JButton();
        threeSpades = new javax.swing.JButton();
        fourDiamonds = new javax.swing.JButton();
        fourClubs = new javax.swing.JButton();
        fourHearts = new javax.swing.JButton();
        fourSpades = new javax.swing.JButton();
        fiveDiamonds = new javax.swing.JButton();
        fiveClubs = new javax.swing.JButton();
        fiveHearts = new javax.swing.JButton();
        fiveSpades = new javax.swing.JButton();
        sixDiamonds = new javax.swing.JButton();
        jButton203 = new javax.swing.JButton();
        sixClubs = new javax.swing.JButton();
        sixHearts = new javax.swing.JButton();
        sixSpades = new javax.swing.JButton();
        sevenDiamonds = new javax.swing.JButton();
        sevenClubs = new javax.swing.JButton();
        sevenHearts = new javax.swing.JButton();
        eightDiamonds = new javax.swing.JButton();
        sevenSpades = new javax.swing.JButton();
        eightClubs = new javax.swing.JButton();
        eightHearts = new javax.swing.JButton();
        eightSpades = new javax.swing.JButton();
        nineDiamonds = new javax.swing.JButton();
        nineClubs = new javax.swing.JButton();
        nineHearts = new javax.swing.JButton();
        nineSpades = new javax.swing.JButton();
        tenDiamonds = new javax.swing.JButton();
        tenClubs = new javax.swing.JButton();
        tenHearts = new javax.swing.JButton();
        tenSpades = new javax.swing.JButton();
        jackDiamonds = new javax.swing.JButton();
        jackClubs = new javax.swing.JButton();
        jackHearts = new javax.swing.JButton();
        jackSpades = new javax.swing.JButton();
        queenDiamonds = new javax.swing.JButton();
        queenClubs = new javax.swing.JButton();
        queenHearts = new javax.swing.JButton();
        queenSpades = new javax.swing.JButton();
        kingDiamonds = new javax.swing.JButton();
        kingClubs = new javax.swing.JButton();
        kingHearts = new javax.swing.JButton();
        kingSpades = new javax.swing.JButton();
        secondCardSpot = new javax.swing.JLabel();
        thirdCardSpot = new javax.swing.JLabel();
        fourthCardSpot = new javax.swing.JLabel();
        fifthCardSpot = new javax.swing.JLabel();
        firstCardSpot = new javax.swing.JLabel();
        secondCardLabel = new javax.swing.JLabel();
        thirdCardLabel = new javax.swing.JLabel();
        fourthCardLabel = new javax.swing.JLabel();
        fifthCardLabel = new javax.swing.JLabel();
        firstCardLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        coverLabel1 = new javax.swing.JLabel();
        coverLabel2 = new javax.swing.JLabel();
        betButton = new javax.swing.JButton();
        myBetsLabel = new javax.swing.JLabel();
        myBetsText = new javax.swing.JLabel();
        payoutPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        payoutLabel = new javax.swing.JLabel();
        continueButton = new javax.swing.JButton();
        boardImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        corner36.setBackground(new java.awt.Color(255, 255, 255));
        corner36.setForeground(new java.awt.Color(255, 255, 255));
        corner36.setAlignmentY(0.0F);
        corner36.setContentAreaFilled(false);
        corner36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner36ActionPerformed(evt);
            }
        });
        jPanel1.add(corner36, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 30, 20));

        corner13.setBackground(new java.awt.Color(255, 255, 255));
        corner13.setForeground(new java.awt.Color(255, 255, 255));
        corner13.setAlignmentY(0.0F);
        corner13.setContentAreaFilled(false);
        corner13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner13ActionPerformed(evt);
            }
        });
        jPanel1.add(corner13, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 30, 20));

        corner12.setBackground(new java.awt.Color(255, 255, 255));
        corner12.setForeground(new java.awt.Color(255, 255, 255));
        corner12.setAlignmentY(0.0F);
        corner12.setContentAreaFilled(false);
        corner12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner12ActionPerformed(evt);
            }
        });
        jPanel1.add(corner12, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 30, 20));

        corner11.setBackground(new java.awt.Color(255, 255, 255));
        corner11.setForeground(new java.awt.Color(255, 255, 255));
        corner11.setAlignmentY(0.0F);
        corner11.setContentAreaFilled(false);
        corner11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner11ActionPerformed(evt);
            }
        });
        jPanel1.add(corner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 240, 20, 30));

        corner14.setBackground(new java.awt.Color(255, 255, 255));
        corner14.setForeground(new java.awt.Color(255, 255, 255));
        corner14.setAlignmentY(0.0F);
        corner14.setContentAreaFilled(false);
        corner14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner14ActionPerformed(evt);
            }
        });
        jPanel1.add(corner14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 20, 30));

        corner35.setBackground(new java.awt.Color(255, 255, 255));
        corner35.setForeground(new java.awt.Color(255, 255, 255));
        corner35.setAlignmentY(0.0F);
        corner35.setContentAreaFilled(false);
        corner35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner35ActionPerformed(evt);
            }
        });
        jPanel1.add(corner35, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 20, 30));

        corner34.setBackground(new java.awt.Color(255, 255, 255));
        corner34.setForeground(new java.awt.Color(255, 255, 255));
        corner34.setAlignmentY(0.0F);
        corner34.setContentAreaFilled(false);
        corner34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner34ActionPerformed(evt);
            }
        });
        jPanel1.add(corner34, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 30, 30));

        corner15.setBackground(new java.awt.Color(255, 255, 255));
        corner15.setForeground(new java.awt.Color(255, 255, 255));
        corner15.setAlignmentY(0.0F);
        corner15.setContentAreaFilled(false);
        corner15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner15ActionPerformed(evt);
            }
        });
        jPanel1.add(corner15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 30, 30));

        corner10.setBackground(new java.awt.Color(255, 255, 255));
        corner10.setForeground(new java.awt.Color(255, 255, 255));
        corner10.setAlignmentY(0.0F);
        corner10.setContentAreaFilled(false);
        corner10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner10ActionPerformed(evt);
            }
        });
        jPanel1.add(corner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 30, 30));

        corner32.setBackground(new java.awt.Color(255, 255, 255));
        corner32.setForeground(new java.awt.Color(255, 255, 255));
        corner32.setAlignmentY(0.0F);
        corner32.setContentAreaFilled(false);
        corner32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner32ActionPerformed(evt);
            }
        });
        jPanel1.add(corner32, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 30, 20));

        corner17.setBackground(new java.awt.Color(255, 255, 255));
        corner17.setForeground(new java.awt.Color(255, 255, 255));
        corner17.setAlignmentY(0.0F);
        corner17.setContentAreaFilled(false);
        corner17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner17ActionPerformed(evt);
            }
        });
        jPanel1.add(corner17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 30, 30));

        corner8.setBackground(new java.awt.Color(255, 255, 255));
        corner8.setForeground(new java.awt.Color(255, 255, 255));
        corner8.setAlignmentY(0.0F);
        corner8.setContentAreaFilled(false);
        corner8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner8ActionPerformed(evt);
            }
        });
        jPanel1.add(corner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 30, 30));

        corner7.setBackground(new java.awt.Color(255, 255, 255));
        corner7.setForeground(new java.awt.Color(255, 255, 255));
        corner7.setAlignmentY(0.0F);
        corner7.setContentAreaFilled(false);
        corner7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner7ActionPerformed(evt);
            }
        });
        jPanel1.add(corner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 30, 30));

        corner18.setBackground(new java.awt.Color(255, 255, 255));
        corner18.setForeground(new java.awt.Color(255, 255, 255));
        corner18.setAlignmentY(0.0F);
        corner18.setContentAreaFilled(false);
        corner18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner18ActionPerformed(evt);
            }
        });
        jPanel1.add(corner18, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 30, 30));

        corner31.setBackground(new java.awt.Color(255, 255, 255));
        corner31.setForeground(new java.awt.Color(255, 255, 255));
        corner31.setAlignmentY(0.0F);
        corner31.setContentAreaFilled(false);
        corner31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner31ActionPerformed(evt);
            }
        });
        jPanel1.add(corner31, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 30, 30));

        corner6.setBackground(new java.awt.Color(255, 255, 255));
        corner6.setForeground(new java.awt.Color(255, 255, 255));
        corner6.setAlignmentY(0.0F);
        corner6.setContentAreaFilled(false);
        corner6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner6ActionPerformed(evt);
            }
        });
        jPanel1.add(corner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 30, 30));

        corner19.setBackground(new java.awt.Color(255, 255, 255));
        corner19.setForeground(new java.awt.Color(255, 255, 255));
        corner19.setAlignmentY(0.0F);
        corner19.setContentAreaFilled(false);
        corner19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner19ActionPerformed(evt);
            }
        });
        jPanel1.add(corner19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 30, 30));

        corner30.setBackground(new java.awt.Color(255, 255, 255));
        corner30.setForeground(new java.awt.Color(255, 255, 255));
        corner30.setAlignmentY(0.0F);
        corner30.setContentAreaFilled(false);
        corner30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner30ActionPerformed(evt);
            }
        });
        jPanel1.add(corner30, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 30, 30));

        corner5.setBackground(new java.awt.Color(255, 255, 255));
        corner5.setForeground(new java.awt.Color(255, 255, 255));
        corner5.setAlignmentY(0.0F);
        corner5.setContentAreaFilled(false);
        corner5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner5ActionPerformed(evt);
            }
        });
        jPanel1.add(corner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 30, 30));

        corner20.setBackground(new java.awt.Color(255, 255, 255));
        corner20.setForeground(new java.awt.Color(255, 255, 255));
        corner20.setAlignmentY(0.0F);
        corner20.setContentAreaFilled(false);
        corner20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner20ActionPerformed(evt);
            }
        });
        jPanel1.add(corner20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 30, 30));

        corner29.setBackground(new java.awt.Color(255, 255, 255));
        corner29.setForeground(new java.awt.Color(255, 255, 255));
        corner29.setAlignmentY(0.0F);
        corner29.setContentAreaFilled(false);
        corner29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner29ActionPerformed(evt);
            }
        });
        jPanel1.add(corner29, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, 30));

        corner4.setBackground(new java.awt.Color(255, 255, 255));
        corner4.setForeground(new java.awt.Color(255, 255, 255));
        corner4.setAlignmentY(0.0F);
        corner4.setContentAreaFilled(false);
        corner4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner4ActionPerformed(evt);
            }
        });
        jPanel1.add(corner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 30, 30));

        corner21.setBackground(new java.awt.Color(255, 255, 255));
        corner21.setForeground(new java.awt.Color(255, 255, 255));
        corner21.setAlignmentY(0.0F);
        corner21.setContentAreaFilled(false);
        corner21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner21ActionPerformed(evt);
            }
        });
        jPanel1.add(corner21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 30, 30));

        corner28.setBackground(new java.awt.Color(255, 255, 255));
        corner28.setForeground(new java.awt.Color(255, 255, 255));
        corner28.setAlignmentY(0.0F);
        corner28.setContentAreaFilled(false);
        corner28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner28ActionPerformed(evt);
            }
        });
        jPanel1.add(corner28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 30, 30));

        corner3.setBackground(new java.awt.Color(255, 255, 255));
        corner3.setForeground(new java.awt.Color(255, 255, 255));
        corner3.setAlignmentY(0.0F);
        corner3.setContentAreaFilled(false);
        corner3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner3ActionPerformed(evt);
            }
        });
        jPanel1.add(corner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, 20));

        corner22.setBackground(new java.awt.Color(255, 255, 255));
        corner22.setForeground(new java.awt.Color(255, 255, 255));
        corner22.setAlignmentY(0.0F);
        corner22.setContentAreaFilled(false);
        corner22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner22ActionPerformed(evt);
            }
        });
        jPanel1.add(corner22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 30, 30));

        corner27.setBackground(new java.awt.Color(255, 255, 255));
        corner27.setForeground(new java.awt.Color(255, 255, 255));
        corner27.setAlignmentY(0.0F);
        corner27.setContentAreaFilled(false);
        corner27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner27ActionPerformed(evt);
            }
        });
        jPanel1.add(corner27, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 30, 20));

        corner2.setBackground(new java.awt.Color(255, 255, 255));
        corner2.setForeground(new java.awt.Color(255, 255, 255));
        corner2.setAlignmentY(0.0F);
        corner2.setContentAreaFilled(false);
        corner2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner2ActionPerformed(evt);
            }
        });
        jPanel1.add(corner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 30, 20));

        corner23.setBackground(new java.awt.Color(255, 255, 255));
        corner23.setForeground(new java.awt.Color(255, 255, 255));
        corner23.setAlignmentY(0.0F);
        corner23.setContentAreaFilled(false);
        corner23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner23ActionPerformed(evt);
            }
        });
        jPanel1.add(corner23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 30, 30));

        corner26.setBackground(new java.awt.Color(255, 255, 255));
        corner26.setForeground(new java.awt.Color(255, 255, 255));
        corner26.setAlignmentY(0.0F);
        corner26.setContentAreaFilled(false);
        corner26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner26ActionPerformed(evt);
            }
        });
        jPanel1.add(corner26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 30, 30));

        corner25.setBackground(new java.awt.Color(255, 255, 255));
        corner25.setForeground(new java.awt.Color(255, 255, 255));
        corner25.setAlignmentY(0.0F);
        corner25.setContentAreaFilled(false);
        corner25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner25ActionPerformed(evt);
            }
        });
        jPanel1.add(corner25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 30, 30));

        corner24.setBackground(new java.awt.Color(255, 255, 255));
        corner24.setForeground(new java.awt.Color(255, 255, 255));
        corner24.setAlignmentY(0.0F);
        corner24.setContentAreaFilled(false);
        corner24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner24ActionPerformed(evt);
            }
        });
        jPanel1.add(corner24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 30, 20));

        corner1.setBackground(new java.awt.Color(255, 255, 255));
        corner1.setForeground(new java.awt.Color(255, 255, 255));
        corner1.setAlignmentY(0.0F);
        corner1.setContentAreaFilled(false);
        corner1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner1ActionPerformed(evt);
            }
        });
        jPanel1.add(corner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 20, 20));

        corner9.setBackground(new java.awt.Color(255, 255, 255));
        corner9.setForeground(new java.awt.Color(255, 255, 255));
        corner9.setAlignmentY(0.0F);
        corner9.setContentAreaFilled(false);
        corner9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner9ActionPerformed(evt);
            }
        });
        jPanel1.add(corner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 30, 20));

        corner33.setBackground(new java.awt.Color(255, 255, 255));
        corner33.setForeground(new java.awt.Color(255, 255, 255));
        corner33.setAlignmentY(0.0F);
        corner33.setContentAreaFilled(false);
        corner33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner33ActionPerformed(evt);
            }
        });
        jPanel1.add(corner33, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 30, 20));

        corner16.setBackground(new java.awt.Color(255, 255, 255));
        corner16.setForeground(new java.awt.Color(255, 255, 255));
        corner16.setAlignmentY(0.0F);
        corner16.setContentAreaFilled(false);
        corner16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corner16ActionPerformed(evt);
            }
        });
        jPanel1.add(corner16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 30, 20));

        split1.setBackground(new java.awt.Color(255, 255, 255));
        split1.setForeground(new java.awt.Color(255, 255, 255));
        split1.setAlignmentY(0.0F);
        split1.setContentAreaFilled(false);
        split1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split1ActionPerformed(evt);
            }
        });
        jPanel1.add(split1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 30, 20));

        split2.setBackground(new java.awt.Color(255, 255, 255));
        split2.setForeground(new java.awt.Color(255, 255, 255));
        split2.setAlignmentY(0.0F);
        split2.setContentAreaFilled(false);
        split2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split2ActionPerformed(evt);
            }
        });
        jPanel1.add(split2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 30, 20));

        split3.setBackground(new java.awt.Color(255, 255, 255));
        split3.setForeground(new java.awt.Color(255, 255, 255));
        split3.setAlignmentY(0.0F);
        split3.setContentAreaFilled(false);
        split3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split3ActionPerformed(evt);
            }
        });
        jPanel1.add(split3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 30, 20));

        split4.setBackground(new java.awt.Color(255, 255, 255));
        split4.setForeground(new java.awt.Color(255, 255, 255));
        split4.setAlignmentY(0.0F);
        split4.setContentAreaFilled(false);
        split4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split4ActionPerformed(evt);
            }
        });
        jPanel1.add(split4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 30, 20));

        split5.setBackground(new java.awt.Color(255, 255, 255));
        split5.setForeground(new java.awt.Color(255, 255, 255));
        split5.setAlignmentY(0.0F);
        split5.setContentAreaFilled(false);
        split5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split5ActionPerformed(evt);
            }
        });
        jPanel1.add(split5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 30, 20));

        split6.setBackground(new java.awt.Color(255, 255, 255));
        split6.setForeground(new java.awt.Color(255, 255, 255));
        split6.setAlignmentY(0.0F);
        split6.setContentAreaFilled(false);
        split6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split6ActionPerformed(evt);
            }
        });
        jPanel1.add(split6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 30, 20));

        split7.setBackground(new java.awt.Color(255, 255, 255));
        split7.setForeground(new java.awt.Color(255, 255, 255));
        split7.setAlignmentY(0.0F);
        split7.setContentAreaFilled(false);
        split7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split7ActionPerformed(evt);
            }
        });
        jPanel1.add(split7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 30, 20));

        split8.setBackground(new java.awt.Color(255, 255, 255));
        split8.setForeground(new java.awt.Color(255, 255, 255));
        split8.setAlignmentY(0.0F);
        split8.setContentAreaFilled(false);
        split8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split8ActionPerformed(evt);
            }
        });
        jPanel1.add(split8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 30, 20));

        split9.setBackground(new java.awt.Color(255, 255, 255));
        split9.setForeground(new java.awt.Color(255, 255, 255));
        split9.setAlignmentY(0.0F);
        split9.setContentAreaFilled(false);
        split9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split9ActionPerformed(evt);
            }
        });
        jPanel1.add(split9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 30, 20));

        split10.setBackground(new java.awt.Color(255, 255, 255));
        split10.setForeground(new java.awt.Color(255, 255, 255));
        split10.setAlignmentY(0.0F);
        split10.setContentAreaFilled(false);
        split10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split10ActionPerformed(evt);
            }
        });
        jPanel1.add(split10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 30, 20));

        split11.setBackground(new java.awt.Color(255, 255, 255));
        split11.setForeground(new java.awt.Color(255, 255, 255));
        split11.setAlignmentY(0.0F);
        split11.setContentAreaFilled(false);
        split11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split11ActionPerformed(evt);
            }
        });
        jPanel1.add(split11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 30, 20));

        split12.setBackground(new java.awt.Color(255, 255, 255));
        split12.setForeground(new java.awt.Color(255, 255, 255));
        split12.setAlignmentY(0.0F);
        split12.setContentAreaFilled(false);
        split12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split12ActionPerformed(evt);
            }
        });
        jPanel1.add(split12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 30, 20));

        split13.setBackground(new java.awt.Color(255, 255, 255));
        split13.setForeground(new java.awt.Color(255, 255, 255));
        split13.setAlignmentY(0.0F);
        split13.setContentAreaFilled(false);
        split13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split13ActionPerformed(evt);
            }
        });
        jPanel1.add(split13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 30, 20));

        split14.setBackground(new java.awt.Color(255, 255, 255));
        split14.setForeground(new java.awt.Color(255, 255, 255));
        split14.setAlignmentY(0.0F);
        split14.setContentAreaFilled(false);
        split14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split14ActionPerformed(evt);
            }
        });
        jPanel1.add(split14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 30, 20));

        split15.setBackground(new java.awt.Color(255, 255, 255));
        split15.setForeground(new java.awt.Color(255, 255, 255));
        split15.setAlignmentY(0.0F);
        split15.setContentAreaFilled(false);
        split15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split15ActionPerformed(evt);
            }
        });
        jPanel1.add(split15, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 30, 20));

        split16.setBackground(new java.awt.Color(255, 255, 255));
        split16.setForeground(new java.awt.Color(255, 255, 255));
        split16.setAlignmentY(0.0F);
        split16.setContentAreaFilled(false);
        split16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split16ActionPerformed(evt);
            }
        });
        jPanel1.add(split16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 30, 20));

        split17.setBackground(new java.awt.Color(255, 255, 255));
        split17.setForeground(new java.awt.Color(255, 255, 255));
        split17.setAlignmentY(0.0F);
        split17.setContentAreaFilled(false);
        split17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split17ActionPerformed(evt);
            }
        });
        jPanel1.add(split17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 30, 20));

        split18.setBackground(new java.awt.Color(255, 255, 255));
        split18.setForeground(new java.awt.Color(255, 255, 255));
        split18.setAlignmentY(0.0F);
        split18.setContentAreaFilled(false);
        split18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split18ActionPerformed(evt);
            }
        });
        jPanel1.add(split18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 30, 20));

        split19.setBackground(new java.awt.Color(255, 255, 255));
        split19.setForeground(new java.awt.Color(255, 255, 255));
        split19.setAlignmentY(0.0F);
        split19.setContentAreaFilled(false);
        split19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split19ActionPerformed(evt);
            }
        });
        jPanel1.add(split19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 30, 20));

        split20.setBackground(new java.awt.Color(255, 255, 255));
        split20.setForeground(new java.awt.Color(255, 255, 255));
        split20.setAlignmentY(0.0F);
        split20.setContentAreaFilled(false);
        split20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split20ActionPerformed(evt);
            }
        });
        jPanel1.add(split20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 30, 20));

        split21.setBackground(new java.awt.Color(255, 255, 255));
        split21.setForeground(new java.awt.Color(255, 255, 255));
        split21.setAlignmentY(0.0F);
        split21.setContentAreaFilled(false);
        split21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split21ActionPerformed(evt);
            }
        });
        jPanel1.add(split21, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 30, 20));

        split22.setBackground(new java.awt.Color(255, 255, 255));
        split22.setForeground(new java.awt.Color(255, 255, 255));
        split22.setAlignmentY(0.0F);
        split22.setContentAreaFilled(false);
        split22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split22ActionPerformed(evt);
            }
        });
        jPanel1.add(split22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 30, 20));

        split23.setBackground(new java.awt.Color(255, 255, 255));
        split23.setForeground(new java.awt.Color(255, 255, 255));
        split23.setAlignmentY(0.0F);
        split23.setContentAreaFilled(false);
        split23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split23ActionPerformed(evt);
            }
        });
        jPanel1.add(split23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 30, 20));

        split24.setBackground(new java.awt.Color(255, 255, 255));
        split24.setForeground(new java.awt.Color(255, 255, 255));
        split24.setAlignmentY(0.0F);
        split24.setContentAreaFilled(false);
        split24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split24ActionPerformed(evt);
            }
        });
        jPanel1.add(split24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 30, 20));

        split25.setBackground(new java.awt.Color(255, 255, 255));
        split25.setForeground(new java.awt.Color(255, 255, 255));
        split25.setAlignmentY(0.0F);
        split25.setContentAreaFilled(false);
        split25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split25ActionPerformed(evt);
            }
        });
        jPanel1.add(split25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 30, 20));

        split26.setBackground(new java.awt.Color(255, 255, 255));
        split26.setForeground(new java.awt.Color(255, 255, 255));
        split26.setAlignmentY(0.0F);
        split26.setContentAreaFilled(false);
        split26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split26ActionPerformed(evt);
            }
        });
        jPanel1.add(split26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 30, 20));

        split27.setBackground(new java.awt.Color(255, 255, 255));
        split27.setForeground(new java.awt.Color(255, 255, 255));
        split27.setAlignmentY(0.0F);
        split27.setContentAreaFilled(false);
        split27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split27ActionPerformed(evt);
            }
        });
        jPanel1.add(split27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 30, 20));

        split28.setBackground(new java.awt.Color(255, 255, 255));
        split28.setForeground(new java.awt.Color(255, 255, 255));
        split28.setAlignmentY(0.0F);
        split28.setContentAreaFilled(false);
        split28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split28ActionPerformed(evt);
            }
        });
        jPanel1.add(split28, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 30, 20));

        split29.setBackground(new java.awt.Color(255, 255, 255));
        split29.setForeground(new java.awt.Color(255, 255, 255));
        split29.setAlignmentY(0.0F);
        split29.setContentAreaFilled(false);
        split29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split29ActionPerformed(evt);
            }
        });
        jPanel1.add(split29, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 30, 20));

        split30.setBackground(new java.awt.Color(255, 255, 255));
        split30.setForeground(new java.awt.Color(255, 255, 255));
        split30.setAlignmentY(0.0F);
        split30.setContentAreaFilled(false);
        split30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split30ActionPerformed(evt);
            }
        });
        jPanel1.add(split30, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 30, 20));

        split31.setBackground(new java.awt.Color(255, 255, 255));
        split31.setForeground(new java.awt.Color(255, 255, 255));
        split31.setAlignmentY(0.0F);
        split31.setContentAreaFilled(false);
        split31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split31ActionPerformed(evt);
            }
        });
        jPanel1.add(split31, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 30, 20));

        split32.setBackground(new java.awt.Color(255, 255, 255));
        split32.setForeground(new java.awt.Color(255, 255, 255));
        split32.setAlignmentY(0.0F);
        split32.setContentAreaFilled(false);
        split32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split32ActionPerformed(evt);
            }
        });
        jPanel1.add(split32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 30, 20));

        split33.setBackground(new java.awt.Color(255, 255, 255));
        split33.setForeground(new java.awt.Color(255, 255, 255));
        split33.setAlignmentY(0.0F);
        split33.setContentAreaFilled(false);
        split33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split33ActionPerformed(evt);
            }
        });
        jPanel1.add(split33, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 30, 20));

        split34.setBackground(new java.awt.Color(255, 255, 255));
        split34.setForeground(new java.awt.Color(255, 255, 255));
        split34.setAlignmentY(0.0F);
        split34.setContentAreaFilled(false);
        split34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split34ActionPerformed(evt);
            }
        });
        jPanel1.add(split34, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 30, 20));

        split35.setBackground(new java.awt.Color(255, 255, 255));
        split35.setForeground(new java.awt.Color(255, 255, 255));
        split35.setAlignmentY(0.0F);
        split35.setContentAreaFilled(false);
        split35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split35ActionPerformed(evt);
            }
        });
        jPanel1.add(split35, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 30, 20));

        split36.setBackground(new java.awt.Color(255, 255, 255));
        split36.setForeground(new java.awt.Color(255, 255, 255));
        split36.setAlignmentY(0.0F);
        split36.setContentAreaFilled(false);
        split36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split36ActionPerformed(evt);
            }
        });
        jPanel1.add(split36, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 30, 20));

        split37.setBackground(new java.awt.Color(255, 255, 255));
        split37.setForeground(new java.awt.Color(255, 255, 255));
        split37.setAlignmentY(0.0F);
        split37.setContentAreaFilled(false);
        split37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split37ActionPerformed(evt);
            }
        });
        jPanel1.add(split37, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 30, 20));

        split38.setBackground(new java.awt.Color(255, 255, 255));
        split38.setForeground(new java.awt.Color(255, 255, 255));
        split38.setAlignmentY(0.0F);
        split38.setContentAreaFilled(false);
        split38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split38ActionPerformed(evt);
            }
        });
        jPanel1.add(split38, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 30, 20));

        split39.setBackground(new java.awt.Color(255, 255, 255));
        split39.setForeground(new java.awt.Color(255, 255, 255));
        split39.setAlignmentY(0.0F);
        split39.setContentAreaFilled(false);
        split39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split39ActionPerformed(evt);
            }
        });
        jPanel1.add(split39, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 30, 20));

        split40.setBackground(new java.awt.Color(255, 255, 255));
        split40.setForeground(new java.awt.Color(255, 255, 255));
        split40.setAlignmentY(0.0F);
        split40.setContentAreaFilled(false);
        split40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split40ActionPerformed(evt);
            }
        });
        jPanel1.add(split40, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 20, 50));

        split63.setBackground(new java.awt.Color(255, 255, 255));
        split63.setForeground(new java.awt.Color(255, 255, 255));
        split63.setAlignmentY(0.0F);
        split63.setContentAreaFilled(false);
        split63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split63ActionPerformed(evt);
            }
        });
        jPanel1.add(split63, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 20, 50));

        split64.setBackground(new java.awt.Color(255, 255, 255));
        split64.setForeground(new java.awt.Color(255, 255, 255));
        split64.setAlignmentY(0.0F);
        split64.setContentAreaFilled(false);
        split64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split64ActionPerformed(evt);
            }
        });
        jPanel1.add(split64, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 20, 50));

        split87.setBackground(new java.awt.Color(255, 255, 255));
        split87.setForeground(new java.awt.Color(255, 255, 255));
        split87.setAlignmentY(0.0F);
        split87.setContentAreaFilled(false);
        split87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split87ActionPerformed(evt);
            }
        });
        jPanel1.add(split87, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 20, 50));

        split41.setBackground(new java.awt.Color(255, 255, 255));
        split41.setForeground(new java.awt.Color(255, 255, 255));
        split41.setAlignmentY(0.0F);
        split41.setContentAreaFilled(false);
        split41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split41ActionPerformed(evt);
            }
        });
        jPanel1.add(split41, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 30, 50));

        split62.setBackground(new java.awt.Color(255, 255, 255));
        split62.setForeground(new java.awt.Color(255, 255, 255));
        split62.setAlignmentY(0.0F);
        split62.setContentAreaFilled(false);
        split62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split62ActionPerformed(evt);
            }
        });
        jPanel1.add(split62, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 30, 50));

        split65.setBackground(new java.awt.Color(255, 255, 255));
        split65.setForeground(new java.awt.Color(255, 255, 255));
        split65.setAlignmentY(0.0F);
        split65.setContentAreaFilled(false);
        split65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split65ActionPerformed(evt);
            }
        });
        jPanel1.add(split65, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 30, 50));

        split86.setBackground(new java.awt.Color(255, 255, 255));
        split86.setForeground(new java.awt.Color(255, 255, 255));
        split86.setAlignmentY(0.0F);
        split86.setContentAreaFilled(false);
        split86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split86ActionPerformed(evt);
            }
        });
        jPanel1.add(split86, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 30, 50));

        split42.setBackground(new java.awt.Color(255, 255, 255));
        split42.setForeground(new java.awt.Color(255, 255, 255));
        split42.setAlignmentY(0.0F);
        split42.setContentAreaFilled(false);
        split42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split42ActionPerformed(evt);
            }
        });
        jPanel1.add(split42, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 20, 50));

        split61.setBackground(new java.awt.Color(255, 255, 255));
        split61.setForeground(new java.awt.Color(255, 255, 255));
        split61.setAlignmentY(0.0F);
        split61.setContentAreaFilled(false);
        split61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split61ActionPerformed(evt);
            }
        });
        jPanel1.add(split61, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 20, 50));

        split66.setBackground(new java.awt.Color(255, 255, 255));
        split66.setForeground(new java.awt.Color(255, 255, 255));
        split66.setAlignmentY(0.0F);
        split66.setContentAreaFilled(false);
        split66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split66ActionPerformed(evt);
            }
        });
        jPanel1.add(split66, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 20, 50));

        split85.setBackground(new java.awt.Color(255, 255, 255));
        split85.setForeground(new java.awt.Color(255, 255, 255));
        split85.setAlignmentY(0.0F);
        split85.setContentAreaFilled(false);
        split85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split85ActionPerformed(evt);
            }
        });
        jPanel1.add(split85, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 20, 50));

        split43.setBackground(new java.awt.Color(255, 255, 255));
        split43.setForeground(new java.awt.Color(255, 255, 255));
        split43.setAlignmentY(0.0F);
        split43.setContentAreaFilled(false);
        split43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split43ActionPerformed(evt);
            }
        });
        jPanel1.add(split43, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 20, 50));

        split60.setBackground(new java.awt.Color(255, 255, 255));
        split60.setForeground(new java.awt.Color(255, 255, 255));
        split60.setAlignmentY(0.0F);
        split60.setContentAreaFilled(false);
        split60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split60ActionPerformed(evt);
            }
        });
        jPanel1.add(split60, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 20, 50));

        split67.setBackground(new java.awt.Color(255, 255, 255));
        split67.setForeground(new java.awt.Color(255, 255, 255));
        split67.setAlignmentY(0.0F);
        split67.setContentAreaFilled(false);
        split67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split67ActionPerformed(evt);
            }
        });
        jPanel1.add(split67, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 20, 50));

        split84.setBackground(new java.awt.Color(255, 255, 255));
        split84.setForeground(new java.awt.Color(255, 255, 255));
        split84.setAlignmentY(0.0F);
        split84.setContentAreaFilled(false);
        split84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split84ActionPerformed(evt);
            }
        });
        jPanel1.add(split84, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 20, 50));

        split44.setBackground(new java.awt.Color(255, 255, 255));
        split44.setForeground(new java.awt.Color(255, 255, 255));
        split44.setAlignmentY(0.0F);
        split44.setContentAreaFilled(false);
        split44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split44ActionPerformed(evt);
            }
        });
        jPanel1.add(split44, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 20, 50));

        split59.setBackground(new java.awt.Color(255, 255, 255));
        split59.setForeground(new java.awt.Color(255, 255, 255));
        split59.setAlignmentY(0.0F);
        split59.setContentAreaFilled(false);
        split59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split59ActionPerformed(evt);
            }
        });
        jPanel1.add(split59, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 20, 50));

        split68.setBackground(new java.awt.Color(255, 255, 255));
        split68.setForeground(new java.awt.Color(255, 255, 255));
        split68.setAlignmentY(0.0F);
        split68.setContentAreaFilled(false);
        split68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split68ActionPerformed(evt);
            }
        });
        jPanel1.add(split68, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 20, 50));

        split83.setBackground(new java.awt.Color(255, 255, 255));
        split83.setForeground(new java.awt.Color(255, 255, 255));
        split83.setAlignmentY(0.0F);
        split83.setContentAreaFilled(false);
        split83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split83ActionPerformed(evt);
            }
        });
        jPanel1.add(split83, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 20, 50));

        split45.setBackground(new java.awt.Color(255, 255, 255));
        split45.setForeground(new java.awt.Color(255, 255, 255));
        split45.setAlignmentY(0.0F);
        split45.setContentAreaFilled(false);
        split45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split45ActionPerformed(evt);
            }
        });
        jPanel1.add(split45, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 20, 50));

        split58.setBackground(new java.awt.Color(255, 255, 255));
        split58.setForeground(new java.awt.Color(255, 255, 255));
        split58.setAlignmentY(0.0F);
        split58.setContentAreaFilled(false);
        split58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split58ActionPerformed(evt);
            }
        });
        jPanel1.add(split58, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 20, 50));

        split69.setBackground(new java.awt.Color(255, 255, 255));
        split69.setForeground(new java.awt.Color(255, 255, 255));
        split69.setAlignmentY(0.0F);
        split69.setContentAreaFilled(false);
        split69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split69ActionPerformed(evt);
            }
        });
        jPanel1.add(split69, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 20, 50));

        split82.setBackground(new java.awt.Color(255, 255, 255));
        split82.setForeground(new java.awt.Color(255, 255, 255));
        split82.setAlignmentY(0.0F);
        split82.setContentAreaFilled(false);
        split82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split82ActionPerformed(evt);
            }
        });
        jPanel1.add(split82, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 20, 50));

        split46.setBackground(new java.awt.Color(255, 255, 255));
        split46.setForeground(new java.awt.Color(255, 255, 255));
        split46.setAlignmentY(0.0F);
        split46.setContentAreaFilled(false);
        split46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split46ActionPerformed(evt);
            }
        });
        jPanel1.add(split46, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 20, 50));

        split57.setBackground(new java.awt.Color(255, 255, 255));
        split57.setForeground(new java.awt.Color(255, 255, 255));
        split57.setAlignmentY(0.0F);
        split57.setContentAreaFilled(false);
        split57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split57ActionPerformed(evt);
            }
        });
        jPanel1.add(split57, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 20, 50));

        split70.setBackground(new java.awt.Color(255, 255, 255));
        split70.setForeground(new java.awt.Color(255, 255, 255));
        split70.setAlignmentY(0.0F);
        split70.setContentAreaFilled(false);
        split70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split70ActionPerformed(evt);
            }
        });
        jPanel1.add(split70, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 20, 50));

        split81.setBackground(new java.awt.Color(255, 255, 255));
        split81.setForeground(new java.awt.Color(255, 255, 255));
        split81.setAlignmentY(0.0F);
        split81.setContentAreaFilled(false);
        split81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split81ActionPerformed(evt);
            }
        });
        jPanel1.add(split81, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 20, 50));

        split47.setBackground(new java.awt.Color(255, 255, 255));
        split47.setForeground(new java.awt.Color(255, 255, 255));
        split47.setAlignmentY(0.0F);
        split47.setContentAreaFilled(false);
        split47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split47ActionPerformed(evt);
            }
        });
        jPanel1.add(split47, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 20, 50));

        split56.setBackground(new java.awt.Color(255, 255, 255));
        split56.setForeground(new java.awt.Color(255, 255, 255));
        split56.setAlignmentY(0.0F);
        split56.setContentAreaFilled(false);
        split56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split56ActionPerformed(evt);
            }
        });
        jPanel1.add(split56, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 20, 50));

        split71.setBackground(new java.awt.Color(255, 255, 255));
        split71.setForeground(new java.awt.Color(255, 255, 255));
        split71.setAlignmentY(0.0F);
        split71.setContentAreaFilled(false);
        split71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split71ActionPerformed(evt);
            }
        });
        jPanel1.add(split71, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 20, 50));

        split80.setBackground(new java.awt.Color(255, 255, 255));
        split80.setForeground(new java.awt.Color(255, 255, 255));
        split80.setAlignmentY(0.0F);
        split80.setContentAreaFilled(false);
        split80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split80ActionPerformed(evt);
            }
        });
        jPanel1.add(split80, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 20, 50));

        split48.setBackground(new java.awt.Color(255, 255, 255));
        split48.setForeground(new java.awt.Color(255, 255, 255));
        split48.setAlignmentY(0.0F);
        split48.setContentAreaFilled(false);
        split48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split48ActionPerformed(evt);
            }
        });
        jPanel1.add(split48, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 20, 50));

        split55.setBackground(new java.awt.Color(255, 255, 255));
        split55.setForeground(new java.awt.Color(255, 255, 255));
        split55.setAlignmentY(0.0F);
        split55.setContentAreaFilled(false);
        split55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split55ActionPerformed(evt);
            }
        });
        jPanel1.add(split55, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 20, 50));

        split72.setBackground(new java.awt.Color(255, 255, 255));
        split72.setForeground(new java.awt.Color(255, 255, 255));
        split72.setAlignmentY(0.0F);
        split72.setContentAreaFilled(false);
        split72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split72ActionPerformed(evt);
            }
        });
        jPanel1.add(split72, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 20, 50));

        split79.setBackground(new java.awt.Color(255, 255, 255));
        split79.setForeground(new java.awt.Color(255, 255, 255));
        split79.setAlignmentY(0.0F);
        split79.setContentAreaFilled(false);
        split79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split79ActionPerformed(evt);
            }
        });
        jPanel1.add(split79, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 20, 50));

        split49.setBackground(new java.awt.Color(255, 255, 255));
        split49.setForeground(new java.awt.Color(255, 255, 255));
        split49.setAlignmentY(0.0F);
        split49.setContentAreaFilled(false);
        split49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split49ActionPerformed(evt);
            }
        });
        jPanel1.add(split49, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 30, 50));

        split54.setBackground(new java.awt.Color(255, 255, 255));
        split54.setForeground(new java.awt.Color(255, 255, 255));
        split54.setAlignmentY(0.0F);
        split54.setContentAreaFilled(false);
        split54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split54ActionPerformed(evt);
            }
        });
        jPanel1.add(split54, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 30, 50));

        split73.setBackground(new java.awt.Color(255, 255, 255));
        split73.setForeground(new java.awt.Color(255, 255, 255));
        split73.setAlignmentY(0.0F);
        split73.setContentAreaFilled(false);
        split73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split73ActionPerformed(evt);
            }
        });
        jPanel1.add(split73, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 30, 50));

        split78.setBackground(new java.awt.Color(255, 255, 255));
        split78.setForeground(new java.awt.Color(255, 255, 255));
        split78.setAlignmentY(0.0F);
        split78.setContentAreaFilled(false);
        split78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split78ActionPerformed(evt);
            }
        });
        jPanel1.add(split78, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 30, 50));

        split50.setBackground(new java.awt.Color(255, 255, 255));
        split50.setForeground(new java.awt.Color(255, 255, 255));
        split50.setAlignmentY(0.0F);
        split50.setContentAreaFilled(false);
        split50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split50ActionPerformed(evt);
            }
        });
        jPanel1.add(split50, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, 20, 50));

        split53.setBackground(new java.awt.Color(255, 255, 255));
        split53.setForeground(new java.awt.Color(255, 255, 255));
        split53.setAlignmentY(0.0F);
        split53.setContentAreaFilled(false);
        split53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split53ActionPerformed(evt);
            }
        });
        jPanel1.add(split53, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 20, 50));

        split74.setBackground(new java.awt.Color(255, 255, 255));
        split74.setForeground(new java.awt.Color(255, 255, 255));
        split74.setAlignmentY(0.0F);
        split74.setContentAreaFilled(false);
        split74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split74ActionPerformed(evt);
            }
        });
        jPanel1.add(split74, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, 20, 50));

        split77.setBackground(new java.awt.Color(255, 255, 255));
        split77.setForeground(new java.awt.Color(255, 255, 255));
        split77.setAlignmentY(0.0F);
        split77.setContentAreaFilled(false);
        split77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split77ActionPerformed(evt);
            }
        });
        jPanel1.add(split77, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 20, 50));

        split51.setBackground(new java.awt.Color(255, 255, 255));
        split51.setForeground(new java.awt.Color(255, 255, 255));
        split51.setAlignmentY(0.0F);
        split51.setContentAreaFilled(false);
        split51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split51ActionPerformed(evt);
            }
        });
        jPanel1.add(split51, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 20, 50));

        split52.setBackground(new java.awt.Color(255, 255, 255));
        split52.setForeground(new java.awt.Color(255, 255, 255));
        split52.setAlignmentY(0.0F);
        split52.setContentAreaFilled(false);
        split52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split52ActionPerformed(evt);
            }
        });
        jPanel1.add(split52, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 20, 50));

        split75.setBackground(new java.awt.Color(255, 255, 255));
        split75.setForeground(new java.awt.Color(255, 255, 255));
        split75.setAlignmentY(0.0F);
        split75.setContentAreaFilled(false);
        split75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split75ActionPerformed(evt);
            }
        });
        jPanel1.add(split75, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 20, 50));

        split76.setBackground(new java.awt.Color(255, 255, 255));
        split76.setForeground(new java.awt.Color(255, 255, 255));
        split76.setAlignmentY(0.0F);
        split76.setContentAreaFilled(false);
        split76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                split76ActionPerformed(evt);
            }
        });
        jPanel1.add(split76, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 20, 50));

        twoStreet.setBackground(new java.awt.Color(255, 255, 255));
        twoStreet.setForeground(new java.awt.Color(255, 255, 255));
        twoStreet.setAlignmentY(0.0F);
        twoStreet.setContentAreaFilled(false);
        twoStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoStreetActionPerformed(evt);
            }
        });
        jPanel1.add(twoStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 50, 30));

        threeStreet.setBackground(new java.awt.Color(255, 255, 255));
        threeStreet.setForeground(new java.awt.Color(255, 255, 255));
        threeStreet.setAlignmentY(0.0F);
        threeStreet.setContentAreaFilled(false);
        threeStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeStreetActionPerformed(evt);
            }
        });
        jPanel1.add(threeStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 50, 30));

        fourStreet.setBackground(new java.awt.Color(255, 255, 255));
        fourStreet.setForeground(new java.awt.Color(255, 255, 255));
        fourStreet.setAlignmentY(0.0F);
        fourStreet.setContentAreaFilled(false);
        fourStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourStreetActionPerformed(evt);
            }
        });
        jPanel1.add(fourStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 50, 30));

        fiveStreet.setBackground(new java.awt.Color(255, 255, 255));
        fiveStreet.setForeground(new java.awt.Color(255, 255, 255));
        fiveStreet.setAlignmentY(0.0F);
        fiveStreet.setContentAreaFilled(false);
        fiveStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveStreetActionPerformed(evt);
            }
        });
        jPanel1.add(fiveStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 50, 30));

        sixStreet.setBackground(new java.awt.Color(255, 255, 255));
        sixStreet.setForeground(new java.awt.Color(255, 255, 255));
        sixStreet.setAlignmentY(0.0F);
        sixStreet.setContentAreaFilled(false);
        sixStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixStreetActionPerformed(evt);
            }
        });
        jPanel1.add(sixStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 50, 30));

        sevenStreet.setBackground(new java.awt.Color(255, 255, 255));
        sevenStreet.setForeground(new java.awt.Color(255, 255, 255));
        sevenStreet.setAlignmentY(0.0F);
        sevenStreet.setContentAreaFilled(false);
        sevenStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenStreetActionPerformed(evt);
            }
        });
        jPanel1.add(sevenStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 50, 30));

        eightStreet.setBackground(new java.awt.Color(255, 255, 255));
        eightStreet.setForeground(new java.awt.Color(255, 255, 255));
        eightStreet.setAlignmentY(0.0F);
        eightStreet.setContentAreaFilled(false);
        eightStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightStreetActionPerformed(evt);
            }
        });
        jPanel1.add(eightStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 50, 30));

        nineStreet.setBackground(new java.awt.Color(255, 255, 255));
        nineStreet.setForeground(new java.awt.Color(255, 255, 255));
        nineStreet.setAlignmentY(0.0F);
        nineStreet.setContentAreaFilled(false);
        nineStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineStreetActionPerformed(evt);
            }
        });
        jPanel1.add(nineStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 50, 30));

        tenStreet.setBackground(new java.awt.Color(255, 255, 255));
        tenStreet.setForeground(new java.awt.Color(255, 255, 255));
        tenStreet.setAlignmentY(0.0F);
        tenStreet.setContentAreaFilled(false);
        tenStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenStreetActionPerformed(evt);
            }
        });
        jPanel1.add(tenStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 50, 30));

        jackStreet.setBackground(new java.awt.Color(255, 255, 255));
        jackStreet.setForeground(new java.awt.Color(255, 255, 255));
        jackStreet.setAlignmentY(0.0F);
        jackStreet.setContentAreaFilled(false);
        jackStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jackStreetActionPerformed(evt);
            }
        });
        jPanel1.add(jackStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 50, 30));

        firstThreeCards.setBackground(new java.awt.Color(255, 255, 255));
        firstThreeCards.setForeground(new java.awt.Color(255, 255, 255));
        firstThreeCards.setAlignmentY(0.0F);
        firstThreeCards.setContentAreaFilled(false);
        jPanel1.add(firstThreeCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 80, 40));

        kingStreet.setBackground(new java.awt.Color(255, 255, 255));
        kingStreet.setForeground(new java.awt.Color(255, 255, 255));
        kingStreet.setAlignmentY(0.0F);
        kingStreet.setContentAreaFilled(false);
        kingStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kingStreetActionPerformed(evt);
            }
        });
        jPanel1.add(kingStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, 50, 30));

        queenStreet.setBackground(new java.awt.Color(255, 255, 255));
        queenStreet.setForeground(new java.awt.Color(255, 255, 255));
        queenStreet.setAlignmentY(0.0F);
        queenStreet.setContentAreaFilled(false);
        queenStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queenStreetActionPerformed(evt);
            }
        });
        jPanel1.add(queenStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 50, 30));

        aceStreet.setBackground(new java.awt.Color(255, 255, 255));
        aceStreet.setForeground(new java.awt.Color(255, 255, 255));
        aceStreet.setAlignmentY(0.0F);
        aceStreet.setContentAreaFilled(false);
        aceStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceStreetActionPerformed(evt);
            }
        });
        jPanel1.add(aceStreet, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 50, 30));

        aceToSix.setBackground(new java.awt.Color(255, 255, 255));
        aceToSix.setForeground(new java.awt.Color(255, 255, 255));
        aceToSix.setAlignmentY(0.0F);
        aceToSix.setContentAreaFilled(false);
        aceToSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceToSixActionPerformed(evt);
            }
        });
        jPanel1.add(aceToSix, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 80, 40));

        redSpot.setBackground(new java.awt.Color(255, 255, 255));
        redSpot.setForeground(new java.awt.Color(255, 255, 255));
        redSpot.setAlignmentY(0.0F);
        redSpot.setContentAreaFilled(false);
        redSpot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redSpotActionPerformed(evt);
            }
        });
        jPanel1.add(redSpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 100, 40));

        luckySevens.setBackground(new java.awt.Color(255, 255, 255));
        luckySevens.setForeground(new java.awt.Color(255, 255, 255));
        luckySevens.setAlignmentY(0.0F);
        luckySevens.setContentAreaFilled(false);
        jPanel1.add(luckySevens, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 50, 40));

        blackSpot.setBackground(new java.awt.Color(255, 255, 255));
        blackSpot.setForeground(new java.awt.Color(255, 255, 255));
        blackSpot.setAlignmentY(0.0F);
        blackSpot.setContentAreaFilled(false);
        blackSpot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackSpotActionPerformed(evt);
            }
        });
        jPanel1.add(blackSpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 100, 50));

        eightToKing.setBackground(new java.awt.Color(255, 255, 255));
        eightToKing.setForeground(new java.awt.Color(255, 255, 255));
        eightToKing.setAlignmentY(0.0F);
        eightToKing.setContentAreaFilled(false);
        eightToKing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightToKingActionPerformed(evt);
            }
        });
        jPanel1.add(eightToKing, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 100, 50));

        allFiveCards.setBackground(new java.awt.Color(255, 255, 255));
        allFiveCards.setForeground(new java.awt.Color(255, 255, 255));
        allFiveCards.setAlignmentY(0.0F);
        allFiveCards.setContentAreaFilled(false);
        jPanel1.add(allFiveCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 80, 40));

        diamondsRow.setBackground(new java.awt.Color(255, 255, 255));
        diamondsRow.setForeground(new java.awt.Color(255, 255, 255));
        diamondsRow.setAlignmentY(0.0F);
        diamondsRow.setContentAreaFilled(false);
        diamondsRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diamondsRowActionPerformed(evt);
            }
        });
        jPanel1.add(diamondsRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 50, 50));

        clubsRow.setBackground(new java.awt.Color(255, 255, 255));
        clubsRow.setForeground(new java.awt.Color(255, 255, 255));
        clubsRow.setAlignmentY(0.0F);
        clubsRow.setContentAreaFilled(false);
        clubsRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clubsRowActionPerformed(evt);
            }
        });
        jPanel1.add(clubsRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 50, 50));

        heartsRow.setBackground(new java.awt.Color(255, 255, 255));
        heartsRow.setForeground(new java.awt.Color(255, 255, 255));
        heartsRow.setAlignmentY(0.0F);
        heartsRow.setContentAreaFilled(false);
        heartsRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartsRowActionPerformed(evt);
            }
        });
        jPanel1.add(heartsRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, 50, 50));

        spadesRow.setBackground(new java.awt.Color(255, 255, 255));
        spadesRow.setForeground(new java.awt.Color(255, 255, 255));
        spadesRow.setAlignmentY(0.0F);
        spadesRow.setContentAreaFilled(false);
        spadesRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spadesRowActionPerformed(evt);
            }
        });
        jPanel1.add(spadesRow, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 50, 50));

        joker1.setBackground(new java.awt.Color(255, 255, 255));
        joker1.setForeground(new java.awt.Color(255, 255, 255));
        joker1.setAlignmentY(0.0F);
        joker1.setBorderPainted(false);
        joker1.setContentAreaFilled(false);
        joker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joker1ActionPerformed(evt);
            }
        });
        jPanel1.add(joker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 50, 110));
        joker1.setContentAreaFilled(false);

        joker2.setBackground(new java.awt.Color(255, 255, 255));
        joker2.setForeground(new java.awt.Color(255, 255, 255));
        joker2.setAlignmentY(0.0F);
        joker2.setBorderPainted(false);
        joker2.setContentAreaFilled(false);
        joker2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joker2ActionPerformed(evt);
            }
        });
        jPanel1.add(joker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 50, 100));

        aceDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        aceDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        aceDiamonds.setAlignmentY(0.0F);
        aceDiamonds.setContentAreaFilled(false);
        aceDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(aceDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 50, 50));

        aceClubs.setBackground(new java.awt.Color(255, 255, 255));
        aceClubs.setForeground(new java.awt.Color(255, 255, 255));
        aceClubs.setAlignmentY(0.0F);
        aceClubs.setBorderPainted(false);
        aceClubs.setContentAreaFilled(false);
        aceClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceClubsActionPerformed(evt);
            }
        });
        jPanel1.add(aceClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 50, 60));

        aceHearts.setBackground(new java.awt.Color(255, 255, 255));
        aceHearts.setForeground(new java.awt.Color(255, 255, 255));
        aceHearts.setAlignmentY(0.0F);
        aceHearts.setContentAreaFilled(false);
        aceHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(aceHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 50, 50));

        aceSpades.setBackground(new java.awt.Color(255, 255, 255));
        aceSpades.setForeground(new java.awt.Color(255, 255, 255));
        aceSpades.setAlignmentY(0.0F);
        aceSpades.setContentAreaFilled(false);
        aceSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(aceSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 50, 50));

        twoDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        twoDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        twoDiamonds.setAlignmentY(0.0F);
        twoDiamonds.setContentAreaFilled(false);
        twoDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(twoDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 50, 50));

        twoClubs.setBackground(new java.awt.Color(255, 255, 255));
        twoClubs.setForeground(new java.awt.Color(255, 255, 255));
        twoClubs.setAlignmentY(0.0F);
        twoClubs.setContentAreaFilled(false);
        twoClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoClubsActionPerformed(evt);
            }
        });
        jPanel1.add(twoClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 50, 60));

        twoHearts.setBackground(new java.awt.Color(255, 255, 255));
        twoHearts.setForeground(new java.awt.Color(255, 255, 255));
        twoHearts.setAlignmentY(0.0F);
        twoHearts.setContentAreaFilled(false);
        twoHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(twoHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 50, 50));

        twoSpades.setBackground(new java.awt.Color(255, 255, 255));
        twoSpades.setForeground(new java.awt.Color(255, 255, 255));
        twoSpades.setAlignmentY(0.0F);
        twoSpades.setContentAreaFilled(false);
        twoSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(twoSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 50, 50));

        threeDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        threeDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        threeDiamonds.setAlignmentY(0.0F);
        threeDiamonds.setContentAreaFilled(false);
        threeDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(threeDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 50, 50));

        threeClubs.setBackground(new java.awt.Color(255, 255, 255));
        threeClubs.setForeground(new java.awt.Color(255, 255, 255));
        threeClubs.setAlignmentY(0.0F);
        threeClubs.setContentAreaFilled(false);
        threeClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeClubsActionPerformed(evt);
            }
        });
        jPanel1.add(threeClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 50, 50));

        threeHearts.setBackground(new java.awt.Color(255, 255, 255));
        threeHearts.setForeground(new java.awt.Color(255, 255, 255));
        threeHearts.setAlignmentY(0.0F);
        threeHearts.setContentAreaFilled(false);
        threeHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(threeHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 50, 50));

        threeSpades.setBackground(new java.awt.Color(255, 255, 255));
        threeSpades.setForeground(new java.awt.Color(255, 255, 255));
        threeSpades.setAlignmentY(0.0F);
        threeSpades.setContentAreaFilled(false);
        threeSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(threeSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 50, 50));

        fourDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        fourDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        fourDiamonds.setAlignmentY(0.0F);
        fourDiamonds.setContentAreaFilled(false);
        fourDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(fourDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 50, 50));

        fourClubs.setBackground(new java.awt.Color(255, 255, 255));
        fourClubs.setForeground(new java.awt.Color(255, 255, 255));
        fourClubs.setAlignmentY(0.0F);
        fourClubs.setContentAreaFilled(false);
        fourClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourClubsActionPerformed(evt);
            }
        });
        jPanel1.add(fourClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 50, 60));

        fourHearts.setBackground(new java.awt.Color(255, 255, 255));
        fourHearts.setForeground(new java.awt.Color(255, 255, 255));
        fourHearts.setAlignmentY(0.0F);
        fourHearts.setContentAreaFilled(false);
        fourHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(fourHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 50, 50));

        fourSpades.setBackground(new java.awt.Color(255, 255, 255));
        fourSpades.setForeground(new java.awt.Color(255, 255, 255));
        fourSpades.setAlignmentY(0.0F);
        fourSpades.setContentAreaFilled(false);
        fourSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(fourSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 50, 50));

        fiveDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        fiveDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        fiveDiamonds.setAlignmentY(0.0F);
        fiveDiamonds.setContentAreaFilled(false);
        fiveDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(fiveDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 50, 50));

        fiveClubs.setBackground(new java.awt.Color(255, 255, 255));
        fiveClubs.setForeground(new java.awt.Color(255, 255, 255));
        fiveClubs.setAlignmentY(0.0F);
        fiveClubs.setContentAreaFilled(false);
        fiveClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveClubsActionPerformed(evt);
            }
        });
        jPanel1.add(fiveClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 50, 60));

        fiveHearts.setBackground(new java.awt.Color(255, 255, 255));
        fiveHearts.setForeground(new java.awt.Color(255, 255, 255));
        fiveHearts.setAlignmentY(0.0F);
        fiveHearts.setContentAreaFilled(false);
        fiveHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(fiveHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 50, 50));

        fiveSpades.setBackground(new java.awt.Color(255, 255, 255));
        fiveSpades.setForeground(new java.awt.Color(255, 255, 255));
        fiveSpades.setAlignmentY(0.0F);
        fiveSpades.setContentAreaFilled(false);
        fiveSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(fiveSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 50, 50));

        sixDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        sixDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        sixDiamonds.setAlignmentY(0.0F);
        sixDiamonds.setContentAreaFilled(false);
        sixDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(sixDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 50, 50));

        jButton203.setBackground(new java.awt.Color(255, 255, 255));
        jButton203.setForeground(new java.awt.Color(255, 255, 255));
        jButton203.setAlignmentY(0.0F);
        jButton203.setContentAreaFilled(false);
        jPanel1.add(jButton203, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 20, 50));

        sixClubs.setBackground(new java.awt.Color(255, 255, 255));
        sixClubs.setForeground(new java.awt.Color(255, 255, 255));
        sixClubs.setAlignmentY(0.0F);
        sixClubs.setContentAreaFilled(false);
        sixClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixClubsActionPerformed(evt);
            }
        });
        jPanel1.add(sixClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 50, 50));

        sixHearts.setBackground(new java.awt.Color(255, 255, 255));
        sixHearts.setForeground(new java.awt.Color(255, 255, 255));
        sixHearts.setAlignmentY(0.0F);
        sixHearts.setContentAreaFilled(false);
        sixHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(sixHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 50, 50));

        sixSpades.setBackground(new java.awt.Color(255, 255, 255));
        sixSpades.setForeground(new java.awt.Color(255, 255, 255));
        sixSpades.setAlignmentY(0.0F);
        sixSpades.setContentAreaFilled(false);
        sixSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(sixSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 50, 50));

        sevenDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        sevenDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        sevenDiamonds.setAlignmentY(0.0F);
        sevenDiamonds.setContentAreaFilled(false);
        sevenDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(sevenDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 50, 50));

        sevenClubs.setBackground(new java.awt.Color(255, 255, 255));
        sevenClubs.setForeground(new java.awt.Color(255, 255, 255));
        sevenClubs.setAlignmentY(0.0F);
        sevenClubs.setContentAreaFilled(false);
        sevenClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenClubsActionPerformed(evt);
            }
        });
        jPanel1.add(sevenClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 50, 50));

        sevenHearts.setBackground(new java.awt.Color(255, 255, 255));
        sevenHearts.setForeground(new java.awt.Color(255, 255, 255));
        sevenHearts.setAlignmentY(0.0F);
        sevenHearts.setContentAreaFilled(false);
        sevenHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(sevenHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 50, 50));

        eightDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        eightDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        eightDiamonds.setAlignmentY(0.0F);
        eightDiamonds.setContentAreaFilled(false);
        eightDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(eightDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 50, 50));

        sevenSpades.setBackground(new java.awt.Color(255, 255, 255));
        sevenSpades.setForeground(new java.awt.Color(255, 255, 255));
        sevenSpades.setAlignmentY(0.0F);
        sevenSpades.setContentAreaFilled(false);
        sevenSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(sevenSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 50, 50));

        eightClubs.setBackground(new java.awt.Color(255, 255, 255));
        eightClubs.setForeground(new java.awt.Color(255, 255, 255));
        eightClubs.setAlignmentY(0.0F);
        eightClubs.setContentAreaFilled(false);
        eightClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightClubsActionPerformed(evt);
            }
        });
        jPanel1.add(eightClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 50, 50));

        eightHearts.setBackground(new java.awt.Color(255, 255, 255));
        eightHearts.setForeground(new java.awt.Color(255, 255, 255));
        eightHearts.setAlignmentY(0.0F);
        eightHearts.setContentAreaFilled(false);
        eightHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(eightHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 50, 50));

        eightSpades.setBackground(new java.awt.Color(255, 255, 255));
        eightSpades.setForeground(new java.awt.Color(255, 255, 255));
        eightSpades.setAlignmentY(0.0F);
        eightSpades.setContentAreaFilled(false);
        eightSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(eightSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 50, 50));

        nineDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        nineDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        nineDiamonds.setAlignmentY(0.0F);
        nineDiamonds.setContentAreaFilled(false);
        nineDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(nineDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 50, 50));

        nineClubs.setBackground(new java.awt.Color(255, 255, 255));
        nineClubs.setForeground(new java.awt.Color(255, 255, 255));
        nineClubs.setAlignmentY(0.0F);
        nineClubs.setContentAreaFilled(false);
        nineClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineClubsActionPerformed(evt);
            }
        });
        jPanel1.add(nineClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 50, 50));

        nineHearts.setBackground(new java.awt.Color(255, 255, 255));
        nineHearts.setForeground(new java.awt.Color(255, 255, 255));
        nineHearts.setAlignmentY(0.0F);
        nineHearts.setContentAreaFilled(false);
        nineHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(nineHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 50, 50));

        nineSpades.setBackground(new java.awt.Color(255, 255, 255));
        nineSpades.setForeground(new java.awt.Color(255, 255, 255));
        nineSpades.setAlignmentY(0.0F);
        nineSpades.setContentAreaFilled(false);
        nineSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(nineSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 50, 50));

        tenDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        tenDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        tenDiamonds.setAlignmentY(0.0F);
        tenDiamonds.setContentAreaFilled(false);
        tenDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(tenDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 50, 50));

        tenClubs.setBackground(new java.awt.Color(255, 255, 255));
        tenClubs.setForeground(new java.awt.Color(255, 255, 255));
        tenClubs.setAlignmentY(0.0F);
        tenClubs.setContentAreaFilled(false);
        tenClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenClubsActionPerformed(evt);
            }
        });
        jPanel1.add(tenClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 50, 50));

        tenHearts.setBackground(new java.awt.Color(255, 255, 255));
        tenHearts.setForeground(new java.awt.Color(255, 255, 255));
        tenHearts.setAlignmentY(0.0F);
        tenHearts.setContentAreaFilled(false);
        tenHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(tenHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 50, 50));

        tenSpades.setBackground(new java.awt.Color(255, 255, 255));
        tenSpades.setForeground(new java.awt.Color(255, 255, 255));
        tenSpades.setAlignmentY(0.0F);
        tenSpades.setContentAreaFilled(false);
        tenSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(tenSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 50, 50));

        jackDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        jackDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        jackDiamonds.setAlignmentY(0.0F);
        jackDiamonds.setContentAreaFilled(false);
        jackDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jackDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(jackDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 50, 50));

        jackClubs.setBackground(new java.awt.Color(255, 255, 255));
        jackClubs.setForeground(new java.awt.Color(255, 255, 255));
        jackClubs.setAlignmentY(0.0F);
        jackClubs.setContentAreaFilled(false);
        jackClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jackClubsActionPerformed(evt);
            }
        });
        jPanel1.add(jackClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 50, 50));

        jackHearts.setBackground(new java.awt.Color(255, 255, 255));
        jackHearts.setForeground(new java.awt.Color(255, 255, 255));
        jackHearts.setAlignmentY(0.0F);
        jackHearts.setContentAreaFilled(false);
        jackHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jackHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(jackHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 50, 50));

        jackSpades.setBackground(new java.awt.Color(255, 255, 255));
        jackSpades.setForeground(new java.awt.Color(255, 255, 255));
        jackSpades.setAlignmentY(0.0F);
        jackSpades.setContentAreaFilled(false);
        jackSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jackSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(jackSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 50, 50));

        queenDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        queenDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        queenDiamonds.setAlignmentY(0.0F);
        queenDiamonds.setContentAreaFilled(false);
        queenDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queenDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(queenDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 50, 50));

        queenClubs.setBackground(new java.awt.Color(255, 255, 255));
        queenClubs.setForeground(new java.awt.Color(255, 255, 255));
        queenClubs.setAlignmentY(0.0F);
        queenClubs.setContentAreaFilled(false);
        queenClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queenClubsActionPerformed(evt);
            }
        });
        jPanel1.add(queenClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, 50, 50));

        queenHearts.setBackground(new java.awt.Color(255, 255, 255));
        queenHearts.setForeground(new java.awt.Color(255, 255, 255));
        queenHearts.setAlignmentY(0.0F);
        queenHearts.setContentAreaFilled(false);
        queenHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queenHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(queenHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 50, 50));

        queenSpades.setBackground(new java.awt.Color(255, 255, 255));
        queenSpades.setForeground(new java.awt.Color(255, 255, 255));
        queenSpades.setAlignmentY(0.0F);
        queenSpades.setContentAreaFilled(false);
        queenSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queenSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(queenSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 50, 50));

        kingDiamonds.setBackground(new java.awt.Color(255, 255, 255));
        kingDiamonds.setForeground(new java.awt.Color(255, 255, 255));
        kingDiamonds.setAlignmentY(0.0F);
        kingDiamonds.setContentAreaFilled(false);
        kingDiamonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kingDiamondsActionPerformed(evt);
            }
        });
        jPanel1.add(kingDiamonds, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 50, 50));

        kingClubs.setBackground(new java.awt.Color(255, 255, 255));
        kingClubs.setForeground(new java.awt.Color(255, 255, 255));
        kingClubs.setAlignmentY(0.0F);
        kingClubs.setContentAreaFilled(false);
        kingClubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kingClubsActionPerformed(evt);
            }
        });
        jPanel1.add(kingClubs, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 50, 50));

        kingHearts.setBackground(new java.awt.Color(255, 255, 255));
        kingHearts.setForeground(new java.awt.Color(255, 255, 255));
        kingHearts.setAlignmentY(0.0F);
        kingHearts.setContentAreaFilled(false);
        kingHearts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kingHeartsActionPerformed(evt);
            }
        });
        jPanel1.add(kingHearts, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 50, 50));

        kingSpades.setBackground(new java.awt.Color(255, 255, 255));
        kingSpades.setForeground(new java.awt.Color(255, 255, 255));
        kingSpades.setAlignmentY(0.0F);
        kingSpades.setContentAreaFilled(false);
        kingSpades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kingSpadesActionPerformed(evt);
            }
        });
        jPanel1.add(kingSpades, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 50, 50));

        secondCardSpot.setBackground(new java.awt.Color(255, 204, 0));
        secondCardSpot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        secondCardSpot.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        secondCardSpot.setOpaque(true);
        jPanel1.add(secondCardSpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 70, 90));

        thirdCardSpot.setBackground(new java.awt.Color(255, 204, 0));
        thirdCardSpot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        thirdCardSpot.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        thirdCardSpot.setOpaque(true);
        jPanel1.add(thirdCardSpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 70, 90));

        fourthCardSpot.setBackground(new java.awt.Color(255, 204, 0));
        fourthCardSpot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fourthCardSpot.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fourthCardSpot.setOpaque(true);
        jPanel1.add(fourthCardSpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 70, 90));

        fifthCardSpot.setBackground(new java.awt.Color(255, 204, 0));
        fifthCardSpot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fifthCardSpot.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fifthCardSpot.setOpaque(true);
        jPanel1.add(fifthCardSpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 70, 90));

        firstCardSpot.setBackground(new java.awt.Color(255, 204, 0));
        firstCardSpot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstCardSpot.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        firstCardSpot.setOpaque(true);
        jPanel1.add(firstCardSpot, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 70, 90));

        secondCardLabel.setForeground(new java.awt.Color(255, 255, 255));
        secondCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secondCardLabel.setText("2nd");
        jPanel1.add(secondCardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 60, -1));

        thirdCardLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirdCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thirdCardLabel.setText("3rd");
        jPanel1.add(thirdCardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 60, -1));

        fourthCardLabel.setForeground(new java.awt.Color(255, 255, 255));
        fourthCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fourthCardLabel.setText("4th");
        jPanel1.add(fourthCardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 60, -1));

        fifthCardLabel.setForeground(new java.awt.Color(255, 255, 255));
        fifthCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fifthCardLabel.setText("5th");
        jPanel1.add(fifthCardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 60, -1));

        firstCardLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstCardLabel.setText("1st");
        jPanel1.add(firstCardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 60, -1));

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");
        jPanel1.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 230, 40));

        balanceLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        balanceLabel.setForeground(new java.awt.Color(255, 0, 51));
        balanceLabel.setText("Balance:");
        jPanel1.add(balanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 220, 40));

        coverLabel1.setBackground(new java.awt.Color(0, 0, 0));
        coverLabel1.setText("jLabel2");
        coverLabel1.setOpaque(true);
        jPanel1.add(coverLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, 40, 220));

        coverLabel2.setBackground(new java.awt.Color(0, 0, 0));
        coverLabel2.setText("jLabel2");
        coverLabel2.setOpaque(true);
        jPanel1.add(coverLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 890, 130));

        betButton.setBackground(new java.awt.Color(0, 255, 153));
        betButton.setText("Bet");
        betButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betButtonActionPerformed(evt);
            }
        });
        jPanel1.add(betButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 70, -1));

        myBetsLabel.setBackground(new java.awt.Color(0, 204, 0));
        myBetsLabel.setToolTipText("");
        myBetsLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        myBetsLabel.setOpaque(true);
        jPanel1.add(myBetsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, 220, 290));

        myBetsText.setBackground(new java.awt.Color(0, 255, 0));
        myBetsText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        myBetsText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myBetsText.setText("My Bets");
        myBetsText.setOpaque(true);
        jPanel1.add(myBetsText, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 220, 30));

        payoutPanel.setForeground(new java.awt.Color(255, 0, 51));
        payoutPanel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("You won");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("$");

        payoutLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        payoutLabel.setForeground(new java.awt.Color(255, 0, 51));

        continueButton.setBackground(new java.awt.Color(255, 255, 255));
        continueButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        continueButton.setForeground(new java.awt.Color(255, 0, 0));
        continueButton.setText("Continue");
        continueButton.setBorderPainted(false);
        continueButton.setOpaque(false);
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout payoutPanelLayout = new javax.swing.GroupLayout(payoutPanel);
        payoutPanel.setLayout(payoutPanelLayout);
        payoutPanelLayout.setHorizontalGroup(
            payoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payoutPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(payoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(payoutPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(payoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, payoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(continueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        payoutPanelLayout.setVerticalGroup(
            payoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payoutPanelLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(payoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(payoutLabel))
                .addGap(18, 18, 18)
                .addComponent(continueButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(payoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 450, 220, 180));

        boardImage.setBackground(new java.awt.Color(0, 0, 0));
        boardImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\zactr\\Downloads\\Pokerlette Board.jpg")); // NOI18N
        boardImage.setOpaque(true);
        jPanel1.add(boardImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 0, 1250, 652));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1180, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("aceDiamonds"))
            {
                myBets.remove("aceDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("aceDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        } 
    }//GEN-LAST:event_aceDiamondsActionPerformed

    private void betButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betButtonActionPerformed
        if(betNum < 10)
        {
            JOptionPane.showMessageDialog(this, "You must be a minimum of $10");
        }
        else
        {
            Deck d = new Deck();
            d.fillDeck();
            d.shuffle();
            Card[] thisDeck = d.deal();
            
           
            String cardImages = "Card Images/";
            String sOne = thisDeck[0].imageString();
            String sTwo = thisDeck[1].imageString();
            String sThree = thisDeck[2].imageString();
            String sFour = thisDeck[3].imageString();
            String sFive = thisDeck[4].imageString();
            
        
            
            String path = "C:\\Users\\zactr\\Documents\\repos\\myProjects\\Pokerlette\\CardImages\\";
            //String path = "C:\\Users\\zactr\\Downloads\\CardImages\\KC.png";
            
            String imageString = "";    
            
            imageString = path + sOne;            
            ImageIcon im = new ImageIcon(imageString);
            Image img = im.getImage();
            Image newimg = img.getScaledInstance(firstCardSpot.getWidth(), firstCardSpot.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(newimg);
            firstCardSpot.setIcon(image);
            
            imageString = path + sTwo;            
            im = new ImageIcon(imageString);
            img = im.getImage();
            newimg = img.getScaledInstance(secondCardSpot.getWidth(), secondCardSpot.getHeight(), Image.SCALE_SMOOTH);
            image = new ImageIcon(newimg);
            secondCardSpot.setIcon(image);
            
            imageString = path + sThree;            
            im = new ImageIcon(imageString);
            img = im.getImage();
            newimg = img.getScaledInstance(thirdCardSpot.getWidth(), thirdCardSpot.getHeight(), Image.SCALE_SMOOTH);
            image = new ImageIcon(newimg);
            thirdCardSpot.setIcon(image);
            
            imageString = path + sFour;            
            im = new ImageIcon(imageString);
            img = im.getImage();
            newimg = img.getScaledInstance(fourthCardSpot.getWidth(), fourthCardSpot.getHeight(), Image.SCALE_SMOOTH);
            image = new ImageIcon(newimg);
            fourthCardSpot.setIcon(image);
            
            imageString = path + sFive;            
            im = new ImageIcon(imageString);
            img = im.getImage();
            newimg = img.getScaledInstance(fifthCardSpot.getWidth(), fifthCardSpot.getHeight(), Image.SCALE_SMOOTH);
            image = new ImageIcon(newimg);
            fifthCardSpot.setIcon(image);
            
            for(int i=0; i<5; i++)
            {
                theseCards.add(thisDeck[i].toString());
            }
            
            
            int payout = calculatePayout();
            betButton.setVisible(false);
        }
        
        
    }//GEN-LAST:event_betButtonActionPerformed

    private void aceClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("aceClubs"))
            {
                myBets.remove("aceClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("aceClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_aceClubsActionPerformed

    private void aceHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceHeartsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("aceHearts"))
            {
                myBets.remove("aceHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("aceHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_aceHeartsActionPerformed

    private void aceSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("aceSpades"))
            {
                myBets.remove("aceSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("aceSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_aceSpadesActionPerformed

    private void twoDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("twoDiamonds"))
            {
                myBets.remove("twoDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("twoDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_twoDiamondsActionPerformed

    private void twoClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("twoClubs"))
            {
                myBets.remove("twoClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("twoClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_twoClubsActionPerformed

    private void twoHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoHeartsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("twoHearts"))
            {
                myBets.remove("twoHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("twoHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_twoHeartsActionPerformed

    private void twoSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("twoSpades"))
            {
                myBets.remove("twoSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("twoSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_twoSpadesActionPerformed

    private void threeDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("threeDiamonds"))
            {
                myBets.remove("threeDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("threeDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_threeDiamondsActionPerformed

    private void threeClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("threeClubs"))
            {
                myBets.remove("threeClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("threeClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_threeClubsActionPerformed

    private void threeHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeHeartsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("threeHearts"))
            {
                myBets.remove("threeHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("threeHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_threeHeartsActionPerformed

    private void threeSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("threeSpades"))
            {
                myBets.remove("threeSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("threeSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_threeSpadesActionPerformed

    
    
    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
         myBets.clear();
         updateMyBetsLabel();
         // setBalance(getBalance() + sum);
         firstCardSpot.setIcon(null);
         secondCardSpot.setIcon(null);
         thirdCardSpot.setIcon(null);
         fourthCardSpot.setIcon(null);
         fifthCardSpot.setIcon(null);
         payoutPanel.setVisible(false);
         
         theseCards.clear();
         betButton.setVisible(true);
         
         if(balance < 10)
         {
            
             int result = JOptionPane.showConfirmDialog(null,
                "You don't have enough money to continue. \n You finished with $" + balance,
                "End of Game", JOptionPane.DEFAULT_OPTION);
        if (result == 0) System.exit(0);
         }
    }//GEN-LAST:event_continueButtonActionPerformed

    private void fourDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("fourDiamonds"))
            {
                myBets.remove("fourDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("fourDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_fourDiamondsActionPerformed

    private void fourClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("fourClubs"))
            {
                myBets.remove("fourClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("fourClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_fourClubsActionPerformed

    private void fourHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourHeartsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("fourHearts"))
            {
                myBets.remove("fourHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("fourHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_fourHeartsActionPerformed

    private void fourSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("fourSpades"))
            {
                myBets.remove("fourSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("fourSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_fourSpadesActionPerformed

    private void fiveDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("fiveDiamonds"))
            {
                myBets.remove("fiveDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("fiveDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_fiveDiamondsActionPerformed

    private void fiveClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("fiveClubs"))
            {
                myBets.remove("fiveClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("fiveClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_fiveClubsActionPerformed

    private void fiveHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveHeartsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("fiveHearts"))
            {
                myBets.remove("fiveHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("fiveHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_fiveHeartsActionPerformed

    private void fiveSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("fiveSpades"))
            {
                myBets.remove("fiveSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("fiveSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_fiveSpadesActionPerformed

    private void sixDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("sixDiamonds"))
            {
                myBets.remove("sixDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("sixDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_sixDiamondsActionPerformed

    private void sixClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("sixClubs"))
            {
                myBets.remove("sixClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("sixClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_sixClubsActionPerformed

    private void sixHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixHeartsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("sixHearts"))
            {
                myBets.remove("sixHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("sixHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_sixHeartsActionPerformed

    private void sixSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("sixSpades"))
            {
                myBets.remove("sixSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("sixSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_sixSpadesActionPerformed

    private void sevenDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("sevenDiamonds"))
            {
                myBets.remove("sevenDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("sevenDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_sevenDiamondsActionPerformed

    private void sevenClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("sevenClubs"))
            {
                myBets.remove("sevenClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("sevenClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_sevenClubsActionPerformed

    private void sevenHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenHeartsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("sevenHearts"))
            {
                myBets.remove("sevenHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("sevenHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_sevenHeartsActionPerformed

    private void sevenSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("sevenSpades"))
            {
                myBets.remove("sevenSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("sevenSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_sevenSpadesActionPerformed

    private void eightDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("eightDiamonds"))
            {
                myBets.remove("eightDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("eightDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_eightDiamondsActionPerformed

    private void eightClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("eightClubs"))
            {
                myBets.remove("eightClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("eightClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_eightClubsActionPerformed

    private void eightHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightHeartsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("eightHearts"))
            {
                myBets.remove("eightHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("eightHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_eightHeartsActionPerformed

    private void eightSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("eightSpades"))
            {
                myBets.remove("eightSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("eightSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_eightSpadesActionPerformed

    private void nineDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("nineDiamonds"))
            {
                myBets.remove("nineDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("nineDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_nineDiamondsActionPerformed

    private void nineClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("nineClubs"))
            {
                myBets.remove("nineClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("nineClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_nineClubsActionPerformed

    private void nineHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineHeartsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("nineHearts"))
            {
                myBets.remove("nineHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("nineHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_nineHeartsActionPerformed

    private void nineSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("nineSpades"))
            {
                myBets.remove("nineSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("nineSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_nineSpadesActionPerformed

    private void tenDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("tenDiamonds"))
            {
                myBets.remove("tenDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("tenDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_tenDiamondsActionPerformed

    private void tenClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("tenClubs"))
            {
                myBets.remove("tenClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("tenClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_tenClubsActionPerformed

    private void tenHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenHeartsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("tenHearts"))
            {
                myBets.remove("tenHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("tenHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_tenHeartsActionPerformed

    private void tenSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("tenSpades"))
            {
                myBets.remove("tenSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("tenSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_tenSpadesActionPerformed

    private void jackDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jackDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("jackDiamonds"))
            {
                myBets.remove("jackDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("jackDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_jackDiamondsActionPerformed

    private void jackClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jackClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("jackClubs"))
            {
                myBets.remove("jackClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("jackClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_jackClubsActionPerformed

    private void jackHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jackHeartsActionPerformed
       if(getBalance() > 0)
        {
            if(myBets.contains("jackHearts"))
            {
                myBets.remove("jackHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("jackHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_jackHeartsActionPerformed

    private void jackSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jackSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("jackSpades"))
            {
                myBets.remove("jackSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("jackSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_jackSpadesActionPerformed

    private void queenDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queenDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("queenDiamonds"))
            {
                myBets.remove("queenDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("queenDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_queenDiamondsActionPerformed

    private void queenClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queenClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("queenClubs"))
            {
                myBets.remove("queenClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("queenClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_queenClubsActionPerformed

    private void queenHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queenHeartsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("queenHearts"))
            {
                myBets.remove("queenHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("queenHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_queenHeartsActionPerformed

    private void queenSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queenSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("queenSpades"))
            {
                myBets.remove("queenSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("queenSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_queenSpadesActionPerformed

    private void kingDiamondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kingDiamondsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("kingDiamonds"))
            {
                myBets.remove("kingDiamonds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("kingDiamonds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_kingDiamondsActionPerformed

    private void kingClubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kingClubsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("kingClubs"))
            {
                myBets.remove("kingClubs");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("kingClubs");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_kingClubsActionPerformed

    private void kingHeartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kingHeartsActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("kingHearts"))
            {
                myBets.remove("kingHearts");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("kingHearts");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_kingHeartsActionPerformed

    private void kingSpadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kingSpadesActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("kingSpades"))
            {
                myBets.remove("kingSpades");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("kingSpades");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_kingSpadesActionPerformed

    private void split1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split1ActionPerformed
        
        String s = "split1";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split1ActionPerformed

    private void split2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split2ActionPerformed
        String s = "split2";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split2ActionPerformed

    private void split3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split3ActionPerformed
        String s = "split3";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split3ActionPerformed

    private void split4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split4ActionPerformed
        String s = "split4";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split4ActionPerformed

    private void split5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split5ActionPerformed
        String s = "split5";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split5ActionPerformed

    private void split6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split6ActionPerformed
        String s = "split6";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split6ActionPerformed

    private void split7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split7ActionPerformed
        String s = "split7";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split7ActionPerformed

    private void split8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split8ActionPerformed
        String s = "split8";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split8ActionPerformed

    private void split9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split9ActionPerformed
        String s = "split9";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split9ActionPerformed

    private void split10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split10ActionPerformed
        String s = "split10";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split10ActionPerformed

    private void split11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split11ActionPerformed
        String s = "split11";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split11ActionPerformed

    private void split12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split12ActionPerformed
        String s = "split12";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split12ActionPerformed

    private void split13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split13ActionPerformed
        String s = "split13";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split13ActionPerformed

    private void split14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split14ActionPerformed
        String s = "split14";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split14ActionPerformed

    private void split15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split15ActionPerformed
        String s = "split15";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split15ActionPerformed

    private void split16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split16ActionPerformed
        String s = "split16";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split16ActionPerformed

    private void split17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split17ActionPerformed
        String s = "split17";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split17ActionPerformed

    private void split18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split18ActionPerformed
        String s = "split18";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split18ActionPerformed

    private void split19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split19ActionPerformed
        String s = "split19";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split19ActionPerformed

    private void split20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split20ActionPerformed
        String s = "split20";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split20ActionPerformed

    private void split21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split21ActionPerformed
        String s = "split21";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split21ActionPerformed

    private void split22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split22ActionPerformed
        String s = "split22";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split22ActionPerformed

    private void split23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split23ActionPerformed
        String s = "split23";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split23ActionPerformed

    private void split24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split24ActionPerformed
        String s = "split24";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split24ActionPerformed

    private void split25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split25ActionPerformed
        String s = "split25";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split25ActionPerformed

    private void split26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split26ActionPerformed
        String s = "split26";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split26ActionPerformed

    private void split27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split27ActionPerformed
        String s = "split27";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split27ActionPerformed

    private void split28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split28ActionPerformed
        String s = "split28";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split28ActionPerformed

    private void split29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split29ActionPerformed
        String s = "split29";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split29ActionPerformed

    private void split30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split30ActionPerformed
        String s = "split30";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split30ActionPerformed

    private void split31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split31ActionPerformed
        String s = "spli31";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split31ActionPerformed

    private void split32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split32ActionPerformed
        String s = "split32";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split32ActionPerformed

    private void split33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split33ActionPerformed
        String s = "split33";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split33ActionPerformed

    private void split34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split34ActionPerformed
        String s = "split34";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split34ActionPerformed

    private void split35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split35ActionPerformed
        String s = "split35";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split35ActionPerformed

    private void split36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split36ActionPerformed
        String s = "split36";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split36ActionPerformed

    private void split37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split37ActionPerformed
        String s = "split37";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split37ActionPerformed

    private void split38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split38ActionPerformed
        String s = "split38";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split38ActionPerformed

    private void split39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split39ActionPerformed
        String s = "split39";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split39ActionPerformed

    private void split40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split40ActionPerformed
        String s = "split40";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split40ActionPerformed

    private void split41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split41ActionPerformed
        String s = "split41";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split41ActionPerformed

    private void split42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split42ActionPerformed
        String s = "split42";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split42ActionPerformed

    private void split43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split43ActionPerformed
        String s = "split43";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split43ActionPerformed

    private void split44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split44ActionPerformed
        String s = "split44";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split44ActionPerformed

    private void split45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split45ActionPerformed
        String s = "split45";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split45ActionPerformed

    private void split46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split46ActionPerformed
        String s = "split46";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split46ActionPerformed

    private void split47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split47ActionPerformed
        String s = "split47";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split47ActionPerformed

    private void split48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split48ActionPerformed
        String s = "split48";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split48ActionPerformed

    private void split49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split49ActionPerformed
        String s = "split49";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split49ActionPerformed

    private void split50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split50ActionPerformed
        String s = "split50";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split50ActionPerformed

    private void split51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split51ActionPerformed
        String s = "split51";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split51ActionPerformed

    private void split52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split52ActionPerformed
        String s = "split52";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split52ActionPerformed

    private void split53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split53ActionPerformed
        String s = "split3";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split53ActionPerformed

    private void split54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split54ActionPerformed
        String s = "split54";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split54ActionPerformed

    private void split55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split55ActionPerformed
        String s = "split55";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split55ActionPerformed

    private void split56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split56ActionPerformed
        String s = "split56";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split56ActionPerformed

    private void split57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split57ActionPerformed
        String s = "split57";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split57ActionPerformed

    private void split58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split58ActionPerformed
        String s = "split58";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split58ActionPerformed

    private void split59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split59ActionPerformed
        String s = "split59";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split59ActionPerformed

    private void split60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split60ActionPerformed
        String s = "split60";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split60ActionPerformed

    private void split61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split61ActionPerformed
        String s = "split61";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split61ActionPerformed

    private void split62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split62ActionPerformed
        String s = "split62";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split62ActionPerformed

    private void split63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split63ActionPerformed
        String s = "split63";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split63ActionPerformed

    private void split64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split64ActionPerformed
        String s = "split64";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split64ActionPerformed

    private void split65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split65ActionPerformed
        String s = "split65";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split65ActionPerformed

    private void split66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split66ActionPerformed
        String s = "split66";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split66ActionPerformed

    private void split67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split67ActionPerformed
        String s = "split67";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split67ActionPerformed

    private void split68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split68ActionPerformed
        String s = "split68";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split68ActionPerformed

    private void split69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split69ActionPerformed
        String s = "split69";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split69ActionPerformed

    private void split70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split70ActionPerformed
        String s = "split70";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split70ActionPerformed

    private void split71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split71ActionPerformed
        String s = "split71";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split71ActionPerformed

    private void split72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split72ActionPerformed
        String s = "split72";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split72ActionPerformed

    private void split73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split73ActionPerformed
        String s = "split73";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split73ActionPerformed

    private void split74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split74ActionPerformed
        String s = "split74";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split74ActionPerformed

    private void split75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split75ActionPerformed
        String s = "split75";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split75ActionPerformed

    private void split76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split76ActionPerformed
        String s = "split76";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split76ActionPerformed

    private void split77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split77ActionPerformed
        String s = "split77";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split77ActionPerformed

    private void split78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split78ActionPerformed
        String s = "split78";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split78ActionPerformed

    private void split79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split79ActionPerformed
        String s = "split79";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split79ActionPerformed

    private void split80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split80ActionPerformed
        String s = "split80";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split80ActionPerformed

    private void split81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split81ActionPerformed
        String s = "split81";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split81ActionPerformed

    private void split82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split82ActionPerformed
        String s = "split82";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split82ActionPerformed

    private void split83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split83ActionPerformed
        String s = "split83";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split83ActionPerformed

    private void split84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split84ActionPerformed
        String s = "split84";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split84ActionPerformed

    private void split85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split85ActionPerformed
        String s = "split85";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split85ActionPerformed

    private void split86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split86ActionPerformed
        String s = "split86";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split86ActionPerformed

    private void split87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_split87ActionPerformed
        String s = "split87";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_split87ActionPerformed

    private void aceToSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceToSixActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("aceToSix"))
            {
                myBets.remove("aceToSix");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("aceToSix");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_aceToSixActionPerformed

    private void eightToKingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightToKingActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("eightToKing"))
            {
                myBets.remove("eightToKing");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("eightToKing");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_eightToKingActionPerformed

    private void redSpotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redSpotActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("reds"))
            {
                myBets.remove("reds");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("reds");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_redSpotActionPerformed

    private void blackSpotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackSpotActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("blacks"))
            {
                myBets.remove("blacks");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("blacks");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_blackSpotActionPerformed

    private void corner1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner1ActionPerformed
        String s = "corner1";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner1ActionPerformed

    private void corner2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner2ActionPerformed
        String s = "corner2";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner2ActionPerformed

    private void corner3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner3ActionPerformed
        String s = "corner3";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner3ActionPerformed

    private void corner4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner4ActionPerformed
        String s = "corner4";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner4ActionPerformed

    private void corner5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner5ActionPerformed
        String s = "corner5";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner5ActionPerformed

    private void corner6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner6ActionPerformed
        String s = "corner6";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner6ActionPerformed

    private void corner7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner7ActionPerformed
        String s = "corner7";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner7ActionPerformed

    private void corner8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner8ActionPerformed
        String s = "corner8";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner8ActionPerformed

    private void corner9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner9ActionPerformed
        String s = "corner9";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner9ActionPerformed

    private void corner10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner10ActionPerformed
        String s = "corner10";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner10ActionPerformed

    private void corner11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner11ActionPerformed
        String s = "corner11";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner11ActionPerformed

    private void corner12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner12ActionPerformed
        String s = "corner12";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner12ActionPerformed

    private void corner13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner13ActionPerformed
        String s = "corner13";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner13ActionPerformed

    private void corner14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner14ActionPerformed
        String s = "corner14";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner14ActionPerformed

    private void corner15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner15ActionPerformed
        String s = "corner15";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner15ActionPerformed

    private void corner16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner16ActionPerformed
        String s = "corner16";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner16ActionPerformed

    private void corner17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner17ActionPerformed
        String s = "corner17";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner17ActionPerformed

    private void corner18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner18ActionPerformed
        String s = "corner18";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner18ActionPerformed

    private void corner19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner19ActionPerformed
        String s = "corner19";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner19ActionPerformed

    private void corner20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner20ActionPerformed
        String s = "corner20";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner20ActionPerformed

    private void corner21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner21ActionPerformed
        String s = "corner21";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner21ActionPerformed

    private void corner22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner22ActionPerformed
        String s = "corner22";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner22ActionPerformed

    private void corner23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner23ActionPerformed
        String s = "corner23";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner23ActionPerformed

    private void corner24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner24ActionPerformed
        String s = "corner24";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner24ActionPerformed

    private void corner25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner25ActionPerformed
        String s = "corner25";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner25ActionPerformed

    private void corner26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner26ActionPerformed
        String s = "corner26";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner26ActionPerformed

    private void corner27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner27ActionPerformed
        String s = "corner27";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner27ActionPerformed

    private void corner28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner28ActionPerformed
        String s = "corner28";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner28ActionPerformed

    private void corner29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner29ActionPerformed
        String s = "corner29";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner29ActionPerformed

    private void corner30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner30ActionPerformed
        String s = "corner30";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner30ActionPerformed

    private void corner31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner31ActionPerformed
        String s = "corner31";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner31ActionPerformed

    private void corner32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner32ActionPerformed
        String s = "corner32";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner32ActionPerformed

    private void corner33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner33ActionPerformed
        String s = "corner33";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner33ActionPerformed

    private void corner34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner34ActionPerformed
        String s = "corner34";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner34ActionPerformed

    private void corner35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner35ActionPerformed
        String s = "corner35";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner35ActionPerformed

    private void corner36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corner36ActionPerformed
        String s = "corner36";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_corner36ActionPerformed

    private void joker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joker1ActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("joker"))
            {
                myBets.remove("joker");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("joker");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_joker1ActionPerformed

    private void joker2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joker2ActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("jokerPlus"))
            {
                myBets.remove("jokerPlus");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("jokerPlus");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_joker2ActionPerformed

    private void diamondsRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diamondsRowActionPerformed
        String s = "diamonds";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_diamondsRowActionPerformed

    private void clubsRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clubsRowActionPerformed
        String s = "clubs";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_clubsRowActionPerformed

    private void heartsRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartsRowActionPerformed
        String s = "hearts";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_heartsRowActionPerformed

    private void spadesRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spadesRowActionPerformed
        String s = "spades";
        if(getBalance() > 0)
        {
            if(myBets.contains(s))
            {
                myBets.remove(s);
                betNum--;
                balance++;
            }
            else
            {
                myBets.add(s);
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_spadesRowActionPerformed

    private void aceStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("aceStreet"))
            {
                myBets.remove("aceStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("aceStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_aceStreetActionPerformed

    private void twoStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("twoStreet"))
            {
                myBets.remove("twoStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("twoStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_twoStreetActionPerformed

    private void threeStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("threeStreet"))
            {
                myBets.remove("threeStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("threeStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_threeStreetActionPerformed

    private void fourStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("fourStreet"))
            {
                myBets.remove("fourStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("fourStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_fourStreetActionPerformed

    private void fiveStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("fiveStreet"))
            {
                myBets.remove("fiveStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("fiveStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_fiveStreetActionPerformed

    private void sixStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("sixStreet"))
            {
                myBets.remove("sixStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("sixStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_sixStreetActionPerformed

    private void sevenStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("sevenStreet"))
            {
                myBets.remove("sevenStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("sevenStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_sevenStreetActionPerformed

    private void eightStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("eightStreet"))
            {
                myBets.remove("eightStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("eightStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_eightStreetActionPerformed

    private void nineStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("nineStreet"))
            {
                myBets.remove("nineStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("nineStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_nineStreetActionPerformed

    private void tenStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("tenStreet"))
            {
                myBets.remove("tenStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("tenStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_tenStreetActionPerformed

    private void jackStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jackStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("jackStreet"))
            {
                myBets.remove("jackStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("jackStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_jackStreetActionPerformed

    private void queenStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queenStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("queenStreet"))
            {
                myBets.remove("queenStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("queenStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_queenStreetActionPerformed

    private void kingStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kingStreetActionPerformed
        if(getBalance() > 0)
        {
            if(myBets.contains("kingStreet"))
            {
                myBets.remove("kingStreet");
                betNum--;
                balance++;
            }
            else
            {
                myBets.add("kingStreet");
                betNum ++;
                balance--;
            }
            
            updateMyBetsLabel();
            setBalance(balance);
       
        }
        else
        {
            JOptionPane.showMessageDialog(this, "You are out of money");
        }
    }//GEN-LAST:event_kingStreetActionPerformed
    
    
    public void updateMyBetsLabel()
    {
       String str = "<html>";
        for(int i =0; i< myBets.size(); i++)
        {
            String s = "";
            if(myBets.get(i).equals("aceToSix"))
            {
                s = "<br/>" + "Ace to Six";
            }
            else if(myBets.get(i).equals("eightToKing"))
            {
                s = "<br/>" + "Eight to King";
            }
            else if(myBets.get(i).equals("reds"))
            {
                s = "<br/>" + "Reds";
            }
            else if(myBets.get(i).equals("blacks"))
            {
                s= "<br/>" + "Blacks";
            }
            else
            {
                s= "<br/>" + cardCombos.get(myBets.get(i));
            }
            
            
            str+= s;
            //str+= "<br/>" + cardCombos.get(myBets.get(i));
        }
        str+= "</html>";
        myBetsLabel.setText(str);
    }
    
    
   public boolean betAgain()
   {
       return bet;
   }
   
   public void setBetAgain(boolean b)
   {
       bet = b;
   }
   
   public int calculatePayout()
   {
       int sum = 0;  
       /*
       System.out.println();
           System.out.println(myBets.get(0));
           System.out.println(cardCombos.get(myBets.get(0)));
           System.out.println(theseCards.get(0));
           System.out.println(cardCombos.get(myBets.get(0)).contains(theseCards.get(0)));
           System.out.println(cardCombos.get(myBets.get(0)).contains(theseCards.get(1)));
           System.out.println(cardCombos.get(myBets.get(0)).contains(theseCards.get(2)));
           System.out.println(cardCombos.get(myBets.get(0)).contains(theseCards.get(3)));
           System.out.println(cardCombos.get(myBets.get(0)).contains(theseCards.get(4)));
           System.out.println();
           sum+= firstCardValues.get(myBets.get(0));
        */
       
       for(int j=0; j<5; j++)
       {
           System.out.println(theseCards.get(j));
       }
       
       for(int i=0; i<myBets.size(); i++)
       {
           
           System.out.println(cardCombos.get(myBets.get(i)).contains(theseCards.get(0)));
           
           if(cardCombos.get(myBets.get(i)).contains(theseCards.get(0)))
           {
               sum+= firstCardValues.get(myBets.get(i));
               
           }
           
           for(int b=1; b<5; b++)
           {
               System.out.println(cardCombos.get(myBets.get(i)).contains(theseCards.get(b)) + "  " + cardCombos.get(myBets.get(i)) );
               if(cardCombos.get(myBets.get(i)).contains(theseCards.get(b)))
                {
                    sum+= otherCardValues.get(myBets.get(i));
                }
           }
       }
        
       /*
       System.out.println(myBets.get(0));
       System.out.println(cardCombos.get(myBets.get(0)).contains(theseCards.get(0)));
       if(cardCombos.get(myBets.get(0)).contains(theseCards.get(0)))
           {
               sum+= firstCardValues.get(0);
           }
       */
       System.out.println("Sum: " + sum);
       setBalance(getBalance() + sum);
       payoutLabel.setText(String.valueOf(sum));
       payoutPanel.setVisible(true);
       
       return sum;
   }
   
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PokerletteBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokerletteBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokerletteBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokerletteBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PokerletteBoard().setVisible(true);
            }
        });
        PokerletteBoard b = new PokerletteBoard();
        b.setExtendedState(JFrame.MAXIMIZED_BOTH);
        b.setVisible(true);
       
        b.setName(StartMenu.playerName);
        b.setBalance(StartMenu.startingBalance);
        b.createCombos();
        b.payoutPanel.setVisible(false);
        
        /*
        boolean playAgain = true;
        b.setBetAgain(false);
        while(playAgain)
        {
       
            
            
            
            
            if(b.getBalance() < 10)
            {
                playAgain = false;
            }
        }
        
        JOptionPane.showMessageDialog(b, "You won $" + b.getBalance());
        System.exit(0);
*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceClubs;
    private javax.swing.JButton aceDiamonds;
    private javax.swing.JButton aceHearts;
    private javax.swing.JButton aceSpades;
    private javax.swing.JButton aceStreet;
    private javax.swing.JButton aceToSix;
    private javax.swing.JButton allFiveCards;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton betButton;
    private javax.swing.JButton blackSpot;
    private javax.swing.JLabel boardImage;
    private javax.swing.JButton clubsRow;
    private javax.swing.JButton continueButton;
    private javax.swing.JButton corner1;
    private javax.swing.JButton corner10;
    private javax.swing.JButton corner11;
    private javax.swing.JButton corner12;
    private javax.swing.JButton corner13;
    private javax.swing.JButton corner14;
    private javax.swing.JButton corner15;
    private javax.swing.JButton corner16;
    private javax.swing.JButton corner17;
    private javax.swing.JButton corner18;
    private javax.swing.JButton corner19;
    private javax.swing.JButton corner2;
    private javax.swing.JButton corner20;
    private javax.swing.JButton corner21;
    private javax.swing.JButton corner22;
    private javax.swing.JButton corner23;
    private javax.swing.JButton corner24;
    private javax.swing.JButton corner25;
    private javax.swing.JButton corner26;
    private javax.swing.JButton corner27;
    private javax.swing.JButton corner28;
    private javax.swing.JButton corner29;
    private javax.swing.JButton corner3;
    private javax.swing.JButton corner30;
    private javax.swing.JButton corner31;
    private javax.swing.JButton corner32;
    private javax.swing.JButton corner33;
    private javax.swing.JButton corner34;
    private javax.swing.JButton corner35;
    private javax.swing.JButton corner36;
    private javax.swing.JButton corner4;
    private javax.swing.JButton corner5;
    private javax.swing.JButton corner6;
    private javax.swing.JButton corner7;
    private javax.swing.JButton corner8;
    private javax.swing.JButton corner9;
    private javax.swing.JLabel coverLabel1;
    private javax.swing.JLabel coverLabel2;
    private javax.swing.JButton diamondsRow;
    private javax.swing.JButton eightClubs;
    private javax.swing.JButton eightDiamonds;
    private javax.swing.JButton eightHearts;
    private javax.swing.JButton eightSpades;
    private javax.swing.JButton eightStreet;
    private javax.swing.JButton eightToKing;
    private javax.swing.JLabel fifthCardLabel;
    private javax.swing.JLabel fifthCardSpot;
    private javax.swing.JLabel firstCardLabel;
    private javax.swing.JLabel firstCardSpot;
    private javax.swing.JButton firstThreeCards;
    private javax.swing.JButton fiveClubs;
    private javax.swing.JButton fiveDiamonds;
    private javax.swing.JButton fiveHearts;
    private javax.swing.JButton fiveSpades;
    private javax.swing.JButton fiveStreet;
    private javax.swing.JButton fourClubs;
    private javax.swing.JButton fourDiamonds;
    private javax.swing.JButton fourHearts;
    private javax.swing.JButton fourSpades;
    private javax.swing.JButton fourStreet;
    private javax.swing.JLabel fourthCardLabel;
    private javax.swing.JLabel fourthCardSpot;
    private javax.swing.JButton heartsRow;
    private javax.swing.JButton jButton203;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jackClubs;
    private javax.swing.JButton jackDiamonds;
    private javax.swing.JButton jackHearts;
    private javax.swing.JButton jackSpades;
    private javax.swing.JButton jackStreet;
    private javax.swing.JButton joker1;
    private javax.swing.JButton joker2;
    private javax.swing.JButton kingClubs;
    private javax.swing.JButton kingDiamonds;
    private javax.swing.JButton kingHearts;
    private javax.swing.JButton kingSpades;
    private javax.swing.JButton kingStreet;
    private javax.swing.JButton luckySevens;
    private javax.swing.JLabel myBetsLabel;
    private javax.swing.JLabel myBetsText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton nineClubs;
    private javax.swing.JButton nineDiamonds;
    private javax.swing.JButton nineHearts;
    private javax.swing.JButton nineSpades;
    private javax.swing.JButton nineStreet;
    private javax.swing.JLabel payoutLabel;
    private javax.swing.JPanel payoutPanel;
    private javax.swing.JButton queenClubs;
    private javax.swing.JButton queenDiamonds;
    private javax.swing.JButton queenHearts;
    private javax.swing.JButton queenSpades;
    private javax.swing.JButton queenStreet;
    private javax.swing.JButton redSpot;
    private javax.swing.JLabel secondCardLabel;
    private javax.swing.JLabel secondCardSpot;
    private javax.swing.JButton sevenClubs;
    private javax.swing.JButton sevenDiamonds;
    private javax.swing.JButton sevenHearts;
    private javax.swing.JButton sevenSpades;
    private javax.swing.JButton sevenStreet;
    private javax.swing.JButton sixClubs;
    private javax.swing.JButton sixDiamonds;
    private javax.swing.JButton sixHearts;
    private javax.swing.JButton sixSpades;
    private javax.swing.JButton sixStreet;
    private javax.swing.JButton spadesRow;
    private javax.swing.JButton split1;
    private javax.swing.JButton split10;
    private javax.swing.JButton split11;
    private javax.swing.JButton split12;
    private javax.swing.JButton split13;
    private javax.swing.JButton split14;
    private javax.swing.JButton split15;
    private javax.swing.JButton split16;
    private javax.swing.JButton split17;
    private javax.swing.JButton split18;
    private javax.swing.JButton split19;
    private javax.swing.JButton split2;
    private javax.swing.JButton split20;
    private javax.swing.JButton split21;
    private javax.swing.JButton split22;
    private javax.swing.JButton split23;
    private javax.swing.JButton split24;
    private javax.swing.JButton split25;
    private javax.swing.JButton split26;
    private javax.swing.JButton split27;
    private javax.swing.JButton split28;
    private javax.swing.JButton split29;
    private javax.swing.JButton split3;
    private javax.swing.JButton split30;
    private javax.swing.JButton split31;
    private javax.swing.JButton split32;
    private javax.swing.JButton split33;
    private javax.swing.JButton split34;
    private javax.swing.JButton split35;
    private javax.swing.JButton split36;
    private javax.swing.JButton split37;
    private javax.swing.JButton split38;
    private javax.swing.JButton split39;
    private javax.swing.JButton split4;
    private javax.swing.JButton split40;
    private javax.swing.JButton split41;
    private javax.swing.JButton split42;
    private javax.swing.JButton split43;
    private javax.swing.JButton split44;
    private javax.swing.JButton split45;
    private javax.swing.JButton split46;
    private javax.swing.JButton split47;
    private javax.swing.JButton split48;
    private javax.swing.JButton split49;
    private javax.swing.JButton split5;
    private javax.swing.JButton split50;
    private javax.swing.JButton split51;
    private javax.swing.JButton split52;
    private javax.swing.JButton split53;
    private javax.swing.JButton split54;
    private javax.swing.JButton split55;
    private javax.swing.JButton split56;
    private javax.swing.JButton split57;
    private javax.swing.JButton split58;
    private javax.swing.JButton split59;
    private javax.swing.JButton split6;
    private javax.swing.JButton split60;
    private javax.swing.JButton split61;
    private javax.swing.JButton split62;
    private javax.swing.JButton split63;
    private javax.swing.JButton split64;
    private javax.swing.JButton split65;
    private javax.swing.JButton split66;
    private javax.swing.JButton split67;
    private javax.swing.JButton split68;
    private javax.swing.JButton split69;
    private javax.swing.JButton split7;
    private javax.swing.JButton split70;
    private javax.swing.JButton split71;
    private javax.swing.JButton split72;
    private javax.swing.JButton split73;
    private javax.swing.JButton split74;
    private javax.swing.JButton split75;
    private javax.swing.JButton split76;
    private javax.swing.JButton split77;
    private javax.swing.JButton split78;
    private javax.swing.JButton split79;
    private javax.swing.JButton split8;
    private javax.swing.JButton split80;
    private javax.swing.JButton split81;
    private javax.swing.JButton split82;
    private javax.swing.JButton split83;
    private javax.swing.JButton split84;
    private javax.swing.JButton split85;
    private javax.swing.JButton split86;
    private javax.swing.JButton split87;
    private javax.swing.JButton split9;
    private javax.swing.JButton tenClubs;
    private javax.swing.JButton tenDiamonds;
    private javax.swing.JButton tenHearts;
    private javax.swing.JButton tenSpades;
    private javax.swing.JButton tenStreet;
    private javax.swing.JLabel thirdCardLabel;
    private javax.swing.JLabel thirdCardSpot;
    private javax.swing.JButton threeClubs;
    private javax.swing.JButton threeDiamonds;
    private javax.swing.JButton threeHearts;
    private javax.swing.JButton threeSpades;
    private javax.swing.JButton threeStreet;
    private javax.swing.JButton twoClubs;
    private javax.swing.JButton twoDiamonds;
    private javax.swing.JButton twoHearts;
    private javax.swing.JButton twoSpades;
    private javax.swing.JButton twoStreet;
    // End of variables declaration//GEN-END:variables



}

package jp.ac.uryukyu.ie.e225408;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*以下に今回のゲームで用いられる役の種類をいくつか示す */
public class HandsTest {

    @Test
    
    void StraightFlushTest(){

        GamePlayers testPlayer = new GamePlayers("Test");
        testPlayer.setHand(new CardCard("クローバー", "A"));
        testPlayer.setHand(new CardCard("クローバー", "K"));
        testPlayer.setHand(new CardCard("クローバー", "Q"));
        testPlayer.setHand(new CardCard("クローバー", "J"));
        testPlayer.setHand(new CardCard("クローバー", "10"));

        boolean testResult = Hands.isStraightFlush(testPlayer.getHand());
        assertTrue(testResult);

    }

    void FullHouseTest(){

        GamePlayers testPlayer = new GamePlayers("Test");
        testPlayer.setHand(new CardCard("スペード", "5"));
        testPlayer.setHand(new CardCard("ハート", "5"));
        testPlayer.setHand(new CardCard("ダイヤ", "5"));
        testPlayer.setHand(new CardCard("クローバー", "J"));
        testPlayer.setHand(new CardCard("スペード", "J"));

        boolean testResult = Hands.isFullHouse(testPlayer.getHand());
        assertTrue(testResult);

    }

    

}
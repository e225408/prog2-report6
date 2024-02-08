package jp.ac.uryukyu.ie.e225408;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*以下に今回のゲームで用いられる役の種類をいくつか示す */
public class HandsTest {

    @Test

    void Flush(){

        GamePlayers testPlayer = new GamePlayers("Test");
        testPlayer.setHand(new CardCard("スペード", "3"));
        testPlayer.setHand(new CardCard("スペード", "5"));
        testPlayer.setHand(new CardCard("スペード", "9"));
        testPlayer.setHand(new CardCard("スペード", "J"));
        testPlayer.setHand(new CardCard("スペード", "Q"));

        boolean testResult = Hands.isFlush(testPlayer.getHand());
        assertTrue(testResult);

    }

    void StraightFlushTest(){

        GamePlayers testPlayer = new GamePlayers("Test");
        testPlayer.setHand(new CardCard("クローバー", "5"));
        testPlayer.setHand(new CardCard("クローバー", "6"));
        testPlayer.setHand(new CardCard("クローバー", "7"));
        testPlayer.setHand(new CardCard("クローバー", "8"));
        testPlayer.setHand(new CardCard("クローバー", "9"));

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
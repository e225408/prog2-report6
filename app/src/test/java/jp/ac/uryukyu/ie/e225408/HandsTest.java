package jp.ac.uryukyu.ie.e225408;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HandsTest {

    @Test

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
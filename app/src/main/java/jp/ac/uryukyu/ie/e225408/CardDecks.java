package jp.ac.uryukyu.ie.e225408;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 52枚のカードを作成するクラス。
 * カードをシャッフル、ディールする。
 */
public class CardDecks {
    /**
     * 52枚のカードを格納するArrayList。
     */
    private ArrayList<CardCard> cards;

    /**
     * Deckクラスのコンストラクタ。
     * 52枚のカードを生成してcardsに追加する。
     */
    public CardDecks() {
        this.cards = new ArrayList<CardCard>();

        String[] suits = { "Diamonds", "Clubs", "Spades","Hearts"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new CardCard(suit, rank));
            }
        }
    }

    /**
     * デッキのカードをシャッフルするメソッド。
     */
    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    /**
     * デッキの一番最後のカードを取り出し、そのカードを返します。
     * @return 取り出されたカード
     */
    public CardCard deal() {
        return this.cards.remove(this.cards.size() - 1); 
    }
}
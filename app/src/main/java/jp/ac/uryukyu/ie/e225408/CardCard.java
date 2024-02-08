package jp.ac.uryukyu.ie.e225408;

/**
 * カードを用意するクラス。
 */
public class CardCard {
    /**
     * カードのスートの種類（ダイヤ、クラブ、スペード、ハート）
     */
    private String suit;
    /**
     * カードのランクの種類（A、2、3、...、J、Q、K）
       カードの強さ：A（エース）一番強い～2一番弱い
     */
    private String rank;

    /**
     * Cardクラスのコンストラクタ。
     * @param suit カードのスートを表す文字列。
     * @param rank カードのランクを表す文字列。
     */
    public CardCard(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * このカードのスートを返す。
     * @return スートを表す文字列
     */
    public String getSuit() {
        return this.suit;
    }

    /**
     * このカードのランクを返す。
     * @return ランクを表す文字列
     */
    public String getRank() {
        return this.rank;
    }

}
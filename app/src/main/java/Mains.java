import jp.ac.uryukyu.ie.e225408.*;

/**
 * Mainクラスは、ポーカーゲームを開始します。
 * プレイヤーとボットを作成し、ゲームコントローラーを通じてゲームを開始します。
 */
public class Mains {
    /**
     * プログラムのエントリーポイントとなるメソッド。
     * @param args コマンドライン引数。
     */
    public static void main(String[] args) {
        GamePlayers player1 = new GamePlayers("Player");
        BotBots bot1 = new BotBots("Bot");

        Games2 gameController = new Games2(player1, bot1);
        gameController.startGame();
    }

}

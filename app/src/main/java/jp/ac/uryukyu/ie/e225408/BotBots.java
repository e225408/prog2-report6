package jp.ac.uryukyu.ie.e225408;

/**
 * ポーカーゲームのボットプレイヤーを表現するクラス。
 * GamesPlayerクラスを継承しています。
 */
public class BotBots extends GamePlayers{
    
    /**
     * Botクラスのコンストラクタ。
     * @param name ボットプレイヤー名。
     */    
    public BotBots(String name) {
        super(name);
    }

    /**
     * ボットプレイヤーのスコアファイルのパスを返すメソッド。
     * @return ボットプレイヤーのスコアファイルのパス。
     */    
    @Override
    public String getPath() {
       
    
    
        String botScorePath = "./botScore.txt";
        return botScorePath;
    }
}

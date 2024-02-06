package jp.ac.uryukyu.ie.e225408;

/**
 * ポーカーゲームのボットプレイヤーを表現するクラス。
 * Playerクラスを継承しています。
 */
public class BotBots extends GamePlayers{
    
    /**
     * Botクラスのコンストラクタ。
     * @param name ボットプレイヤーの名前。
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
        /* 
        String currentDir = System.getProperty("user.dir");
        String botScorePath;
       // アプリケーションがJARファイルとして実行されているかどうかを判断
       if (BotBots.class.getResource("Bot.class").toString().startsWith("jar:")) {
        botScorePath = currentDir + "/app/src/main/resources/botScore.txt";
    } else {
        botScorePath = currentDir + "/src/main/resources/botScore.txt";
    }
    
    */
        String botScorePath = "./botScore.txt";
        return botScorePath;
    }
}

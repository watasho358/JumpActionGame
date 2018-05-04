package jp.techacademy.watanabe.shouta.jumpactiongame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class JumpActionGame extends Game {

	 // publicにして外からアクセスできるようにする
    //SpriteBatchクラスは画像をGPUで効率的に描画するためのクラス
    public SpriteBatch batch;
    public jp.techacademy.watanabe.shouta.jumpactiongame.ActivityRequestHandler mRequestHandler;

     public JumpActionGame(jp.techacademy.watanabe.shouta.jumpactiongame.ActivityRequestHandler requestHandler) {
        super();
        mRequestHandler = requestHandler;
    }

    @Override
    public void create () {
        batch = new SpriteBatch();

        // GameScreenを表示する
        setScreen(new GameScreen(this));
    }
}

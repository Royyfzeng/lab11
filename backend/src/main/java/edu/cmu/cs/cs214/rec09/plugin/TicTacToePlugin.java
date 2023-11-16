package edu.cmu.cs.cs214.rec09.plugin;

import edu.cmu.cs.cs214.rec09.framework.core.GameFramework;
import edu.cmu.cs.cs214.rec09.framework.core.GamePlugin;
import edu.cmu.cs.cs214.rec09.games.RockPaperScissors;
import edu.cmu.cs.cs214.rec09.games.TicTacToe;

public class TicTacToePlugin implements GamePlugin<String>{

    private static final String GAME_NAME = "TicTacToe";
    private static final String GAME_START_FOOTER = "You are playing TikTacToe with a computer!";
    private GameFramework framework;
    private Boolean gameResult = null;
    private TicTacToe.Player currPlayer = TicTacToe.Player.O;
    private TicTacToe ttt = new TicTacToe();

    @Override
    public String getGameName() {
        // TODO Auto-generated method stub
        return GAME_NAME;
        // throw new UnsupportedOperationException("Unimplemented method 'getGameName'");
    }

    @Override
    public int getGridWidth() {
        // TODO Auto-generated method stub
        return TicTacToe.SIZE;
    }

    @Override
    public int getGridHeight() {
        // TODO Auto-generated method stub
        return TicTacToe.SIZE;
    }

    @Override
    public void onRegister(GameFramework f) {
        // TODO Auto-generated method stub
        this.framework = f;
    }

    @Override
    public void onNewGame() {
        // TODO Auto-generated method stub
        this.framework.setFooterText(GAME_START_FOOTER);
    }

    @Override
    public void onNewMove() {
        
    }

    @Override
    public boolean isMoveValid(int x, int y) {
        return this.ttt.isValidPlay(x, y);
    }

    @Override
    public boolean isMoveOver() {
        // TODO Auto-generated method stub
        return gameResult != null;
    }

    @Override
    public void onMovePlayed(int x, int y) {
        // TODO Auto-generated method stub
        this.framework.setSquare(x, y, this.currentPlayer());
        this.ttt.play(x, y);
        this.gameResult = this.ttt.winner() == null ? null : true;
        this.currPlayer = this.currPlayer.opponent();
    }

    @Override
    public boolean isGameOver() {
        // TODO Auto-generated method stub
        return gameResult != null;
    }

    @Override
    public String getGameOverMessage() {
        // TODO Auto-generated method stub
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.ttt.winner().toString());
        stringBuilder.append(" Win!");
        return  stringBuilder.toString();
    }

    @Override
    public void onGameClosed() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'onGameClosed'");
    }

    @Override
    public String currentPlayer() {
        // TODO Auto-generated method stub
        return this.ttt.currentPlayer().toString();
    }
    
}

package edu.cmu.cs.cs214.rec09.plugin;

import edu.cmu.cs.cs214.rec09.framework.core.GameFramework;
import edu.cmu.cs.cs214.rec09.framework.core.GamePlugin;

public class TicTacToePlugin implements GamePlugin<String>{

    private static final String GAME_NAME = "TicTacToe";
    private static final String GAME_START_FOOTER = "You are playing TikTacToe with a computer!";
    private static final int WIDTH = 3;
    private static final int HEIGHT = 3;
    private GameFramework framework;
    

    @Override
    public String getGameName() {
        // TODO Auto-generated method stub
        return GAME_NAME;
        // throw new UnsupportedOperationException("Unimplemented method 'getGameName'");
    }

    @Override
    public int getGridWidth() {
        // TODO Auto-generated method stub
        return WIDTH;
    }

    @Override
    public int getGridHeight() {
        // TODO Auto-generated method stub
        return HEIGHT;
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
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isMoveValid(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isMoveValid'");
    }

    @Override
    public boolean isMoveOver() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isMoveOver'");
    }

    @Override
    public void onMovePlayed(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'onMovePlayed'");
    }

    @Override
    public boolean isGameOver() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isGameOver'");
    }

    @Override
    public String getGameOverMessage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGameOverMessage'");
    }

    @Override
    public void onGameClosed() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'onGameClosed'");
    }

    @Override
    public String currentPlayer() {
        // TODO Auto-generated method stub
        return "Human";
    }
    
}

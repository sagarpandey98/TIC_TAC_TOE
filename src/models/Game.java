package models;

import java.util.ArrayList;
import java.util.List;

import exceptions.InvalidGameBuildException;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameStatus gameStatus;
    private int nextPlayerIndex;

    public static Builder getBuilder(){
        return new Builder();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }
    public static class Builder{

        private int dimension;    
        private List<Player> players;
        
        public int getDimension() {
            return dimension;
        }
        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
        public List<Player> getPlayers() {
            return players;
        }
        public void setPlayers(List<Player> players) {
            this.players = players;
        }

        private boolean isValid(){
            // Validation
            if(dimension<1)
            {
                return false;
            }
            return true;
        }

        public Game build() throws InvalidGameBuildException{
            // validate the game before creating it.
            if  (!isValid()){
                throw new InvalidGameBuildException("Some wrong input passed");
            }

            Game game = new Game();
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setBoard(new Board(dimension));
            game.setPlayers(new ArrayList<>());
            game.setMoves(new ArrayList<>());
            game.setNextPlayerIndex(0);
            return game;

        }
        
    }
}

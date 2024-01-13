package controller;

import java.util.List;

import exceptions.InvalidGameBuildException;
import models.Game;
import models.GameStatus;
import models.Player;

public class GameController {
    // all the functionalities required to play the game
    public void undo(){

    }

    public Player getWinner(Game game)
    {
        return game.getWinner();
    } 

    public Game createGame(int dimension, List<Player> players) throws InvalidGameBuildException{
        Game game = Game.getBuilder().setPlayers(players).setDimension(dimension).build();
        return game;
    }

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void executeNextMove(Game  game){
        game.makeNextMove();
    }
    
}

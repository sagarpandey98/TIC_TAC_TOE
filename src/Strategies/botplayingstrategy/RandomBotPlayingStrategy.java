package Strategies.botplayingstrategy;

import models.Board;
import models.Bot;
import models.Cell;
import models.CellState;
import models.Move;

public class RandomBotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move decideMove(Bot bot, Board board) {

        for (int i = 0; i < board.getBoard().size(); i++) {
            for (int j = 0; j < board.getBoard().size(); j++) {
                if (board.getBoard().get(i).get(j).getCellState().equals(CellState.EMPTY)) {
                    return new Move(bot, new Cell(i, j));
                }
            }
        }
        return null;
    }
    
}

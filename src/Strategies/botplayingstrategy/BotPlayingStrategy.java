package Strategies.botplayingstrategy;

import models.Board;
import models.Bot;
import models.Move;

public interface BotPlayingStrategy {
    Move decideMove(Bot bot, Board board);
}

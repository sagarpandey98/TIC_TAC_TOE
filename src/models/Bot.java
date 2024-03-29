package models;

import Strategies.botplayingstrategy.BotPlayingStrategy;
import factories.BotPlayingStrategyFactory;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String name, char symbol, PlayerType type, BotDifficultyLevel difficultyLevel){
        super(name, symbol, type);
        this.botDifficultyLevel = difficultyLevel;
        botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyForDifficultyLevel(difficultyLevel);

    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
    
    @Override
    public Move decideMove(Board board){
        return botPlayingStrategy.decideMove(this, board);
    }
}

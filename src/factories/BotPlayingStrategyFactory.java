package factories;

import Strategies.botplayingstrategy.BotPlayingStrategy;
import Strategies.botplayingstrategy.RandomBotPlayingStrategy;
import models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel)
    {
        // if-else condition will come here
        return new RandomBotPlayingStrategy();
    }
    
}

package Strategies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import models.*;

public class TicTacToeGame {
    public static void main(String[] args) {
        try (// System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("What is the domension of the game?");
            int dimension = scanner.nextInt();
            System.out.println("Do you want to have Bot in the Game? y/n");
            String isBot = scanner.nextLine();
            List<Player> players = new ArrayList<>();

            int numberOfPlayer = dimension-1;
            if(isBot.charAt(0)=='y')
            {
                numberOfPlayer = dimension- 2;
            }

            for (int i = 0; i<numberOfPlayer; i++)
            {
                System.out.println("What is the name of Player:");
                String name = scanner.nextLine();

                System.out.println("What is the symbol of the player:");
                String symbol  = scanner.nextLine();
                players.add(new Player(name, symbol.charAt(0), PlayerType.HUMAN));
                
            }

            if(isBot.charAt(0)=='y'){
                for (int i = 0; i<numberOfPlayer; i++){

                    System.out.println("What is the name of Bot:");
                    String name = scanner.nextLine();

                    System.out.println("What is the symbol of the Bot:");
                    String symbol  = scanner.nextLine();
                    players.add(new Bot(name, symbol.charAt(0), PlayerType.BOT, BotDifficultyLevel.EASY));
                
                }

            }
        }

    }
}

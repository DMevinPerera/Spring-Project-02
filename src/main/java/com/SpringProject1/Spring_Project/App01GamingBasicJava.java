package com.SpringProject1.Spring_Project;

import com.SpringProject1.Spring_Project.game.GameRunner;
import com.SpringProject1.Spring_Project.game.PacmanGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {

        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();



    }

}

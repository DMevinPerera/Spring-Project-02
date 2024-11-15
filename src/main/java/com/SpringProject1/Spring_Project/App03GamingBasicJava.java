package com.SpringProject1.Spring_Project;

import com.SpringProject1.Spring_Project.game.GameRunner;
import com.SpringProject1.Spring_Project.game.GamingConsole;
import com.SpringProject1.Spring_Project.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();



    }

}

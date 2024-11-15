package com.SpringProject1.Spring_Project.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.SpringProject1.Spring_Project.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
        context.getBean(GamingConsole.class).up();

        context.getBean(GameRunner.class).run();
    }

}

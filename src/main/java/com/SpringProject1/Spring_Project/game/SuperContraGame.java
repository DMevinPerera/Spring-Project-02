package com.SpringProject1.Spring_Project.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("up");
    }

    public void down(){
        System.out.println("Sit Down");
    }

    public void left(){
        System.out.println("Go Back");
    }

    public void right(){
        System.out.println("Shoot a Bullet");
    }
}

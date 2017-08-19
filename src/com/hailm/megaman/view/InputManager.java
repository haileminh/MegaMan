package com.hailm.megaman.view;

import java.awt.event.KeyEvent;

import com.hailm.megaman.model.MegaMan;

public class InputManager {
    private GamePanel gamePanel;

    public InputManager(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void processKeyPressed(int keyCode) {

        switch (keyCode) {

        case KeyEvent.VK_UP:
            System.out.println("You press UP");
            break;

        case KeyEvent.VK_DOWN:
            System.out.println("You press DOWN");
            break;

        case KeyEvent.VK_LEFT:
            gamePanel.megaman.setDirection(MegaMan.DIR_LEFT);
            gamePanel.megaman.setSpeedX(-1);
            break;
        case KeyEvent.VK_RIGHT:
            gamePanel.megaman.setDirection(MegaMan.DIR_RIGHT);
            gamePanel.megaman.setSpeedX(1);
            break;

        case KeyEvent.VK_ENTER:
           
            break;

        case KeyEvent.VK_SPACE:
            gamePanel.megaman.setSpeedY(-3);
            gamePanel.megaman.setPosY(gamePanel.megaman.getPosY() - 3);
            break;
        case KeyEvent.VK_A:

            break;

        }

    }

    public void processKeyReleased(int keyCode) {

        switch (keyCode) {

        case KeyEvent.VK_UP:
            System.out.println("You released UP");
            break;

        case KeyEvent.VK_DOWN:
            System.out.println("You released DOWN");
            break;

        case KeyEvent.VK_LEFT:
            gamePanel.megaman.setSpeedX(0);
            break;
        case KeyEvent.VK_RIGHT:
            gamePanel.megaman.setSpeedX(0);
            break;

        case KeyEvent.VK_ENTER:

            break;

        case KeyEvent.VK_SPACE:

            break;
        case KeyEvent.VK_A:

            break;

        }

    }

}
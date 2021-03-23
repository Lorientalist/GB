package homework.lesson7;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    private final int win_width = 270;
    private final int win_height = 250;
    private int winPosX;
    private int winPosY;

    private GameWindow gameWindow;

    About(GameWindow gameWindow) {
        setBackground(Color.BLACK);
        gameWindowSettings(gameWindow);
    }


    private void gameWindowSettings(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setSize(win_width, win_height);
        setTitle("About Game");
        Rectangle gameWindowBounds = gameWindow.getBounds();
        winPosX = (int) (gameWindowBounds.getCenterX() - win_width / 2);
        winPosY = (int) (gameWindowBounds.getCenterY() - win_height / 2);
        setLocation(winPosX, winPosY);
        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

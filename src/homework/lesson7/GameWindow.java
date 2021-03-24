package homework.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    private GameSettings gameSettings;
    private About aboutGame;
    private GameMap gameMap;

    private final int win_width = 400;
    private final int win_height = 500;
    private int winPosX;
    private int winPosY;
    private JButton btnStartGame;
    private JButton btnGameSettings;
    private JButton btnAboutGame;
    private JButton btnExitGame;
    private JPanel panelForButtons;

    GameWindow() {
        windowSetting();
        createButton();
        gameSettings = new GameSettings(this);
        aboutGame = new About(this);
        gameMap = new GameMap();

        add(panelForButtons, BorderLayout.CENTER);
        setVisible(true);
    }

    private void windowSetting() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        winPosX = (int) ((dimension.getWidth() / 2) - (win_width / 2));
        winPosY = (int) ((dimension.getHeight() / 2) - (win_height / 2));
        setSize(win_width, win_height);
        setLocation(winPosX, winPosY);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tic tac toe game");

    }

    private void createButton() {
        btnStartGame = new JButton("Start Game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameMap.setVisible(true);
            }
        });

        btnGameSettings = new JButton("Game Settings");
        btnGameSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameSettings.setVisible(true);
            }
        });
        btnAboutGame = new JButton("About Game");
        btnAboutGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aboutGame.setVisible(true);
            }
        });
        btnExitGame = new JButton("Exit Game");
        btnExitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panelForButtons = new JPanel();
        panelForButtons.setLayout(new GridLayout(4, 1));
        panelForButtons.add(btnStartGame);
        panelForButtons.add(btnGameSettings);
        panelForButtons.add(btnAboutGame);
        panelForButtons.add(btnExitGame);

    }

    void startGameWithUserSettings(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        gameMap.starGame(gameMode, fieldSizeX, fieldSizeY, winLength);
    }
}

package homework.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class GameMap extends JFrame {
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

    GameMap() {
        setBackground(Color.gray);
        windowSetting();
    }

    private void windowSetting() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        winPosX = (int) ((dimension.getWidth() / 2) - (win_width / 2));
        winPosY = (int) ((dimension.getHeight() / 2) - (win_height / 2));
        setSize(win_width, win_height);
        setLocation(winPosX, winPosY);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("game");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);  // fixes the immediate problem.
        Graphics2D g2 = (Graphics2D) g;
        Line2D lin = new Line2D.Float(100, 100, 250, 260);
        g2.draw(lin);
    }

    void starGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {

    }
}

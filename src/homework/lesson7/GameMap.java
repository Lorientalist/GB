package homework.lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class GameMap extends JFrame {
    private GameSettings gameSettings;
    private About aboutGame;
    private GameMap gameMap;
    public static final int GM_PVE = 0;
    public static final int GM_PVP = 1;

    private final int mapTableSize = 500;
    private int winPosX;
    private int winPosY;
    private int gameMode;
    private int fieldSizeX;
    private int fieldSizeY;
    private int winLength;
    private int[][] map;
    private int cellWigth;
    private int cellHeight;


    GameMap() {
        getContentPane().setBackground(Color.gray);
        windowSetting();
    }

    private void windowSetting() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        winPosX = (int) ((dimension.getWidth() / 2) - (mapTableSize / 2));
        winPosY = (int) ((dimension.getHeight() / 2) - (mapTableSize / 2));
        setSize(mapTableSize, mapTableSize);
        setLocation(winPosX, winPosY);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("game");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);  // fixes the immediate problem.
        Graphics2D g2 = (Graphics2D) g;

        float step = mapTableSize / GameSettings.SETTINGS.getMapSize();
        for (int i = 1; i < GameSettings.SETTINGS.getMapSize(); i++) {
            Line2D lin = new Line2D.Float(step * i, 0, step * i, mapTableSize);
            g2.draw(lin);
            lin = new Line2D.Float(0, step * i, mapTableSize, step * i);
            g2.draw(lin);
        }
    }

    void starGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
//        this.gameMode = gameMode;
//        this.fieldSizeX = fieldSizeX;
//        this.fieldSizeY = fieldSizeY;
//        this.winLength = winLength;
//        map = new int[fieldSizeX][fieldSizeY];
//        repaint();
    }

//    @Override
//    public void paintComponents(Graphics g) {
//        super.paintComponents(g);
//        g.drawLine(0, 0, 100, 100);
////        render(g);
//    }
//
//    private void render(Graphics g) {
//        int width = getWidth();
//        int height = getHeight();
//        cellHeight = height / fieldSizeY;
//        cellWigth = width / fieldSizeX;
//        paintMap(g, width, height);
//    }
//
//    private void paintMap(Graphics g, int width, int height) {
//        g.setColor(Color.WHITE);
//
//        for (int i = 0; i < fieldSizeY; i++) {
//            int y = i * cellHeight;
//            g.drawLine(0, y, width, y);
//        }
//        for (int i = 0; i < fieldSizeX; i++) {
//            int x = i * cellWigth;
//            g.drawLine(x, 0, x, height);
//        }
//    }
}

package homework.lesson7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameSettings extends JFrame {
    static final Settings SETTINGS = new Settings();

    private final int win_width = 270;
    private final int win_height = 250;
    private final String mapSizePrefix = "Map size is ";
    private final String winLenPrefix = "Win length is ";
    private final int minMapSize = 3;
    private final int maxMapSize = 10;
    private final int minWinLen = 3;

    private int winPosX;
    private int winPosY;
    private GameWindow gameWindow;
    private JRadioButton pve;
    private JRadioButton pvp;
    private JSlider sliderMapSize;
    private JSlider sliderWinLength;
    private JButton saveGameSettings;


    GameSettings(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        windowSetting(gameWindow);

        addGameModeControl();
        addFieldsControl();
        addButtonSaveGameSetting();

    }

    private void windowSetting(GameWindow gameWindow) {
        setSize(win_width, win_height);
        setTitle("Game settings");
        Rectangle gameWindowBounds = gameWindow.getBounds();
        winPosX = (int) (gameWindowBounds.getCenterX() - win_width / 2);
        winPosY = (int) (gameWindowBounds.getCenterY() - win_height / 2);
        setLocation(winPosX, winPosY);
        setResizable(false);
        setLayout(new GridLayout(10, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addGameModeControl() {
        add(new JLabel("Choose your opponent"));
        pve = new JRadioButton("Computer", true);
        pvp = new JRadioButton("Player");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pve);
        buttonGroup.add(pvp);

        add(pve);
        add(pvp);

        pve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SETTINGS.setOpponentMode(0);
            }
        });

        pvp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SETTINGS.setOpponentMode(1);
            }
        });
    }

    private void addFieldsControl() {
        JLabel lbMapSize = new JLabel(mapSizePrefix + minMapSize);
        JLabel lbWinLength = new JLabel(winLenPrefix + minWinLen);
        sliderMapSize = new JSlider(minMapSize, maxMapSize, minMapSize);
        sliderMapSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = sliderMapSize.getValue();
                lbMapSize.setText(mapSizePrefix + currentValue);
                sliderWinLength.setMaximum(currentValue);
                SETTINGS.setMapSize(currentValue);
            }
        });
        sliderWinLength = new JSlider(minWinLen, minMapSize, minMapSize);
        sliderWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbWinLength.setText(winLenPrefix + sliderWinLength.getValue());
                SETTINGS.setWinLength(sliderWinLength.getValue());
            }
        });
        add(new JLabel("Choose your map size"));
        add(lbMapSize);
        add(sliderMapSize);
        add(new JLabel("Choose win length"));
        add(lbWinLength);
        add(sliderWinLength);
    }

    private void addButtonSaveGameSetting() {
        saveGameSettings = new JButton("Save setting");
        saveGameSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                collectAllSettings();
                setVisible(false);
            }
        });
        add(saveGameSettings);
    }

    private void collectAllSettings() {
        int gameMode;
        int mapSize;
        int winLength;
        if (pve.isSelected()) {
            gameMode = GameMap.GM_PVE;
        } else if (pvp.isSelected()) {
            gameMode = GameMap.GM_PVP;
        } else {
            throw new RuntimeException("Incorrect game mode");
        }
    }

}

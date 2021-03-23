package homework.lesson7;

public class Settings {
    private int opponentMode = 0;
    private int mapSize = 3;
    private int winLength = 3;

    public int getOpponentMode() {
        return opponentMode;
    }

    public void setOpponentMode(int opponentMode) {
        this.opponentMode = opponentMode;
    }

    public int getMapSize() {
        return mapSize;
    }

    public void setMapSize(int mapSize) {
        this.mapSize = mapSize;
    }

    public int getWinLength() {
        return winLength;
    }

    public void setWinLength(int winLength) {
        this.winLength = winLength;
    }
}

package project.spyfallmobile.Model;

/**
 * Created by Karakayn on 26/04/2017.
 */

public class Player {
    private String name;
    private boolean espion;
    private int gameWin;

    public Player()
    {
        setName("Default player name");
        setEspion(false);
        setGameWin(0);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEspion() {
        return espion;
    }

    public void setEspion(boolean espion) {
        this.espion = espion;
    }

    public int getGameWin() {
        return gameWin;
    }

    public void setGameWin(int gameWin) {
        this.gameWin = gameWin;
    }
}

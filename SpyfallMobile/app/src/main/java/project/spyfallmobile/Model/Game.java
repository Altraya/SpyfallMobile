package project.spyfallmobile.Model;

/**
 * Created by Karakayn on 26/04/2017.
 */

public class Game {

    private String name;
    private int maxNbPlayer;
    private boolean publicGame;

    public Game(String name, int maxNbPlayer, boolean publicGame)
    {
        setName(name);
        setMaxNbPlayer(maxNbPlayer);
        setPublicGame(publicGame);
    }

    public int getMaxNbPlayer() {
        return maxNbPlayer;
    }

    public void setMaxNbPlayer(int maxNbPlayer) {
        this.maxNbPlayer = maxNbPlayer;
    }

    public boolean isPublicGame() {
        return publicGame;
    }

    public void setPublicGame(boolean publicGame) {
        this.publicGame = publicGame;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

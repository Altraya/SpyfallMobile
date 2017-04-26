package project.spyfallmobile.Model;

/**
 * Created by Karakayn on 26/04/2017.
 */

public class Game {

    private int maxNbPlayer;
    private boolean publicGame;

    public Game(int maxNbPlayer, boolean publicGame)
    {
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
}

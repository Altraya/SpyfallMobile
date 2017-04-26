package project.spyfallmobile;

import java.util.ArrayList;
import java.util.List;

import project.spyfallmobile.Model.Game;

/**
 * Created by Karakayn on 26/04/2017.
 */

//Class to help us to manager games
public class GameManager {

    private static GameManager instance;
    private List<Game> existingGames;

    private GameManager() {
        existingGames = new ArrayList<Game>();

    }

    public static GameManager getInstance() {
        if (null == instance) {
            instance = new GameManager();
        }
        return instance;
    }

    public void addGame(Game gameToAdd)
    {
        try {
            this.existingGames.add(gameToAdd);
        }catch (Exception e)
        {
            System.out.println(e);
        }

    }
}

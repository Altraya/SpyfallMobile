package project.spyfallmobile.Model;

import java.util.ArrayList;

/**
 * Created by Karakayn on 26/04/2017.
 */

public class Game {

    private String name;
    private int maxNbPlayer;
    private boolean publicGame;
    private ArrayList<Player> playerList;

    private ArrayList<String> possibleLocation;


    public Game(String name, int maxNbPlayer, boolean publicGame)
    {
        setName(name);
        setMaxNbPlayer(maxNbPlayer);
        setPublicGame(publicGame);

        //todo
        possibleLocation.add("Ecole");
        possibleLocation.add("Sous-Marin");
        possibleLocation.add("Bateau de croisière");
    }

    //initialize the game
    public void launcher()
    {
        //random choose a location
        //Location locat = giveMeRandomLocation();




        //random choose a spy and a role for each player
        for (Player currentPlayer : playerList) {

        }
    }

    /*private Location giveMeRandomLocation()
    {
        int min = 1;
        int max = 3;

        int random = min + (int)(Math.random() * ((max - min) + 1));

        String locationName = possibleLocation.get(random);
        ArrayList<Role> authorizedRoles = new ArrayList<>();
        //authorizedRoles.
        return new Location();

    }*/

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

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }
}

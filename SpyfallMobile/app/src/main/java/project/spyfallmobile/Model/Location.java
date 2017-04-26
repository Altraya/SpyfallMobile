package project.spyfallmobile.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karakayn on 26/04/2017.
 */

public class Location {
    private String name;
    private ArrayList<Role> authorizedRole;

    public Location(String locat, ArrayList<Role> authorizedRole)
    {
        setName(locat);
        setAuthorizedRole(authorizedRole);
    }

    public boolean isAuthorizedRole(Role role)
    {
        if(authorizedRole.contains(role))
            return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Role> getAuthorizedRole() {
        return authorizedRole;
    }

    public void setAuthorizedRole(ArrayList<Role> authorizedRole) {
        this.authorizedRole = authorizedRole;
    }
}

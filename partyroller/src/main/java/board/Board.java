package board;

import user.User;

import java.util.List;

public class Board {

    public String getName() {
        return name;
    }

    public User getMaster() {
        return master;
    }

    public String getDescription() {
        return description;
    }

    public List<User> getPartisipants() {
        return partisipants;
    }

    private String name;

    private User master;

    private String description;

    private List<User> partisipants;

}

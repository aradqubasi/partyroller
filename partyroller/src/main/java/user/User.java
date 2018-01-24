package user;

import board.Board;
import charsheet.Charsheet;

import javax.validation.constraints.Null;
import java.util.List;

public class User implements IUser {

    private String email;

    public String getEmail() {
        return email;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    private List<Charsheet> charsheets;

    public List<Charsheet> getCharsheets() {
        return charsheets;
    }

    private List<Board> boards;

    public List<Board> getBoards() {
        return boards;
    }
}

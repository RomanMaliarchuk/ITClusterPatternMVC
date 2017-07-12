package view;

/**
 * Created by roman on 12.07.2017.
 * Class to provide information about commands in the program
 */
public class ViewHelp {
    private String textHelp =   "help - for getting help\n" +
                                "add_user - for add user\n" +
                                "view_users - for view all users\n" +
                                "add_note - for add note\n" +
                                "view_notes - for view all note\n" +
                                "quit - for quit of this programm";

    @Override
    public String toString() {
        return textHelp;
    }
}

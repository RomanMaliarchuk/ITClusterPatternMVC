package database;

import model.ModelNote;
import model.ModelUser;
import java.util.ArrayList;

/**
 * Created by roman on 12.07.2017.
 * The class simulates the DataBase on static collections
 */
public class DataBase {
    public static ArrayList<ModelUser> allUsers = new ArrayList<>();
    public static ArrayList<ModelNote> allNote = new ArrayList<>();
}

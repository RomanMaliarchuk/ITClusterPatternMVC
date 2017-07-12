package view;

import database.DataBase;
import model.ModelNote;
import model.ModelUser;

import java.util.Scanner;

/**
 * Created by roman on 12.07.2017.
 * The class has methods for creating a new note and outputting information about all notes
 */
public class ViewNote {

    public void createNewNote(){
        if(DataBase.allUsers.size()>0) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("CREARE NEW NOTE");
                System.out.print("Input text note\t");
                String textNote = scanner.next();
                System.out.print("Input ID users from 1 to " + DataBase.allUsers.size() + " :\t");
                int userID = Integer.valueOf(scanner.next());

                if((userID<1)||(userID>DataBase.allUsers.size())){
                    System.out.println("BAD DATA! NOTE NOT CREATED!");
                }else {
                    ModelNote newNote = new ModelNote(textNote, userID);
                    DataBase.allNote.add(newNote);
                    System.out.println("NEW NOTE CREATED");
                }
            }catch (Exception e){
                System.out.println("BAD DATA! NOTE NOT CREATED!");
            }
        }else {
            System.out.println("No users in DataBase! Create a user!");
        }
    }

    public void showAllNote(){
        if(DataBase.allNote.size()!=0) {
            for (ModelNote note : DataBase.allNote) {
                System.out.println(note);
            }
        }else{
            System.out.println("No notes in DataBase!");
        }
    }
}

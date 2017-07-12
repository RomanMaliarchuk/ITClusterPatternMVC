package contloller;

import model.ModelUser;
import view.ViewHelp;
import view.ViewNote;
import view.ViewUser;
import database.DataBase;

import java.util.Scanner;

/**
 * Created by roman on 12.07.2017.
 * The class receives user commands and invokes the required methods
 */
public class Controller {

    public void dispatcher(){

        Scanner scanner = new Scanner(System.in);
        String inputCommand;

        do{
            System.out.println();
            System.out.print("Input command (help - for getting help):\t");
            inputCommand = scanner.next();
            switch (inputCommand){
                case "help":
                    System.out.println(new ViewHelp());
                    break;
                case "add_user":
                    new ViewUser().createNewUser();
                    break;
                case "view_users":
                    new ViewUser().showAllUsers();
                    break;
                case "add_note":
                    new ViewNote().createNewNote();
                    break;
                case "view_notes":
                    new ViewNote().showAllNote();
                    break;
                case "quit":
                    System.out.println("Thanks for using the program. Good bye!!!");
                    break;
                default:
                    System.out.println("Bad command! Repeat!");
            }
        }while(!inputCommand.equals("quit"));

    }

}



package view;

import database.DataBase;
import model.ModelUser;

import java.util.Scanner;

/**
 * Created by roman on 12.07.2017.
 * The class has methods for creating a new user and outputting information about all users
 */
public class ViewUser {

    public void createNewUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("CREARE NEW USER");
        System.out.print("Input user name\t");
        String userName = scanner.next();
        System.out.print("Input user password\t");
        String userPassword = scanner.next();
        ModelUser newUser = new ModelUser(userName, userPassword);
        DataBase.allUsers.add(newUser);
        System.out.println("NEW USER CREATED");
    }

    public void showAllUsers(){
        if(DataBase.allUsers.size()!=0) {
            for (ModelUser user : DataBase.allUsers) {
                System.out.println(user);
            }
        }else {
            System.out.println("No users in DataBase!");
        }
    }

}

package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input;

    protected void UserPrompt() {

        ArrayList<String> title = new ArrayList<String>();

        System.out.println("What would you like to do with the Task Manager?");
        System.out.println("1. Create task \n2. Edit task \n3. Complete Task \n4. View all tasks \n5. View completed tasks");
        System.out.println("6. View incomplete tasks \n7. Exit");
        input = new Scanner(System.in);
        int selection = input.nextInt();

        try {
            switch (selection) {

                //pull input into this line

                case 1:
                    //create task
                    System.in.println("Enter your task name.");
                    System.in.println("Enter your due date");
                    System.in.println("Enter your task details");

                case 2:
                    //edit task
                case 3:
                    //complete task
                case 4:
                    //view all tasks
                case 5:
                    //view completed tasks
                case 6:
                    //view incomplete tasks
                case 7:
                    //exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 7");
                    UserPrompt();
            }

        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number between 1 and 7.");
            UserPrompt();

        }
    }
}

package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Scanner sc = new Scanner(System.in);
    ArrayList<myList> list = new ArrayList<myList>();

    public static void main(String[] args) {
        Main m = new Main();

        int i = 0;
        while(i != 4){
            System.out.println("To-Do List\n1. Add to-do item\n2. Delete from-do item\n3. Display all items\n4. Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter the name of to-do item");
                    String name = sc.next();
                    m.addToDo(name);
                    break;
                case 2:
                    System.out.println("Enter name of to-do item to delete");
                    name = sc.next();
                    m.deleteFromDo(name);
                    break;
                case 3:
                    m.displayAll();
                    break;
                case 4:
                    System.out.println("Thank you for using this program");
                    i = 4;
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }

    }

    public void addToDo(String item){

        if(item.isEmpty()){
            System.out.println("Please enter the name of to-do item");
        }else{
            list.add(new myList(item));
        }
    }

    public void deleteFromDo(String item){

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(item)){
                list.remove(i);
                System.out.println(item + " has been deleted");
            }
        }

    }

    public void displayAll(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(i+1 + ". " + list.get(i));
        }
    }

}
package com.pluralsight;

import javax.swing.*;
import java.util.Scanner;

public class NeighborhoodLibrary {
    public static <Int> void main(String[] args) {
        Book book1 = new Book(1, "234148392", "How to train your dragon");
        Book book2 = new Book(2, "4823920133", "Captain Under pants");
        Book book3 = new Book(3, "48448829383", "hot to kill a mockingbird");
        Book book4 = new Book(4, "4983742990", "50 shades of grey");
        Book book5 = new Book(5, "1348388928", "the notebook");

        Book[] books = new Book[5];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        books[4] = book5;


        int respone1 = JOptionPane.showConfirmDialog(null,
                "Do you want to proceed?", "Select an Option...",JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showMessageDialog(null, "Welcome to the the Neighborhood Library ", "Continue", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "1 to Show Available books", "options", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "2 to Show checked out books ", "Continue", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "3 to Exit ", "Continue", JOptionPane.PLAIN_MESSAGE);
        int response = JOptionPane.showOptionDialog(null, "Choose an option:", "Input Dialog", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"1", "2", "3"}, "1");
        // Check if the response is null (which means the user clicked "Cancel")

        Scanner scanner = new Scanner(System.in);
        while(response !=3){
            response = scanner.nextInt();
        }
        switch (response){
            case 1: showAvailableBooks(books,scanner);
            break;
            case 2: showCheckedOutBooks(books,scanner);
            break;
            case 3:
                System.out.println("Exciting");
                System.exit(0);
            default:
                System.out.println("Error1");
        }






    }

    private static void showCheckedOutBooks(Book[] books, Scanner choice1) {
    }

    private static <book> void showAvailableBooks(Book[] books, Scanner choice1) {
        System.out.println("Available books");
        for (Book book : books){
            if(!book.isCheckedOut()){
                System.out.println("ID:" + book.getId() + "Isbn: " + book.getIsbn() + ", Title: " + book.getTitle());
            }
        }
    }

}





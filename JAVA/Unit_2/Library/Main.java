import java.util.Scanner;

import Library.Library;

public class Main {
  // allow the user to interact with the program
  static Scanner scan = new Scanner(System.in).useDelimiter("\n");

  public void main() {

    // created a new library to store the books
    Library library = new Library();
    // Print in the terminal information about the code to interact with the program
    manual();
    // Get the option from the user
    int option = Integer.parseInt(scan.next());
    
    // infinte loop to allow the user to interact with the program until the user decide to exit
    for (;;) {
      

      switch (option) {
        case 1:
          System.out.println("Enter the title");
          String addTitle = scan.next();
          System.out.println("Enter the author");
          String addAuthors = scan.next();
          System.out.println("Enter the genre");
          String addGenres = scan.next();
          System.out.println("Enter the year");
          int addYear = scan.nextInt();
          System.out.println("Enter the quantity");
          int addQuantity = scan.nextInt();

          // Add the book to the library
          library.addBookToLibrary(addTitle, addAuthors, addGenres, addYear, addQuantity);

          break;
        case 2:
          System.out.println("Enter the title");
          String borrowTitle = scan.next();
          System.out.println("Enter the quantity");
          // borrow a book from the library if the input was valid
          try {
            int borrowQuantity = scan.nextInt();
            library.borrowBooks(borrowTitle, borrowQuantity);
          } catch (Exception e) {
            System.out.println("Invalid quantity");
            main();
          }

          break;
        case 3:
          // print in the screen the list of books
          library.showLibrary();
          break;
        case 4:
          // Exit of the program
          System.out.println(
              "You are exiting of the library and all information will be lost \n Do you want to continue? \n 1 - Yes \n 2 - No");
          int exit = scan.nextInt();
          if (exit == 1) {
            scan.close();
            library.quit();
          }
          break;

        case 5:
          // Remove a book from the library
          System.out.println("Enter the title");
          String removeTitle = scan.next();
          library.removeBookFromLibrary(removeTitle);
          System.out.println("Removed with sucess!");
          break;

        case 6:
          // Remove a book from the library
          System.out.println("Enter the title");
          String returnTitle = scan.next();
          System.out.println("Enter the quantity");
          int returnQuantity = scan.nextInt();
          library.returnBook(returnTitle, returnQuantity);
          break;

        default:
          // user insert a invalid option
          System.out.println(
              "Invalid option!");
          break;
      }
      // Print the options to the user and get a new one
      manual();
      System.out.println("next option");
      option = Integer.parseInt(scan.next());

    }

  }

  // print options in the screen
  void manual() {
    System.out.println("-----------------------------");
    System.out.println(
        "Chosse an option to interact with the program: \n 1 - add a book; \n 2 - borrow a book; \n 3 - list all books; \n 4 - exit; \n 5 - remove a book; \n 6 - Return a book");
    System.out.println("-----------------------------");
  }

}

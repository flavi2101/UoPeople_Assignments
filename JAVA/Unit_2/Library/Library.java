package Library;

import java.util.ArrayList;

import Library.Book.Book;

public class Library {

  // Creat a data structure to store the information of each book, array of books
  static ArrayList<Book> books = new ArrayList<>();

  public Book addBookToLibrary(String title, String authors, String genres, int year, int quantity) {

    Book bookAdded = null;

    // if no book exist in the list added the book
    if (books.isEmpty()) {
      Book newBook = new Book(title, authors, genres, year, quantity);
      books.add(newBook);
      return newBook;
    }

    // if the book exist in the list increment the quantity
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        book.setquantity(book.getQuantity() + quantity);
        bookAdded = book;
      }
    }

    // if the book does not exist in the list add the book
    if (bookAdded == null) {
      Book newBook = new Book(title, authors, genres, year, quantity);
      books.add(newBook);
      bookAdded = newBook;
    }
    return bookAdded;
  }

  // check all title in the list and if find the choosed by the user remove it.
  public void removeBookFromLibrary(String title) {
    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).getTitle().equals(title)) {
        books.remove(i);
        System.out.println("Book was deleted from library");
      }
    }
  }

  // borrow a book and change the quantity, or print that the book does not exist.
  public void borrowBooks(String title, int quantity) {

    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        if (book.getQuantity() >= quantity) {
          book.setquantity(book.getQuantity() - quantity);
          System.out.println("Book borrowed sucessufly");
        } else {
          System.out.println("Not enough books in the library");
        }
      } else {
        System.out.println("Book not found");

      }
    }

  }

  public void returnBook(String title, int quantity) {
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        book.setquantity(book.getQuantity() + quantity);
        System.out.println("book was recived");
      } else {
        System.out.println("Book not found");

      }
    }

  }

  // iterate over the list of book and print them, here it where the overrided
  // toString is used
  public void showLibrary() {

    for (int i = 0; i < books.size(); i++)
      System.out.println(books.get(i));
  }

  // quit of the program
  public void quit() {
    System.exit(0);
  }
}
package Library.Book;

public class Book {

  /* The id is set to be static to a property of the class itself, not of the object 
   * All property are set to be private to be acess only by this class 
   * 
  */

  private String title;
  private String authors;
  private String genres;
  private int year;
  private int quantity;

  // Constructor of a book 
  public Book(String title, String authors, String genres, int year, int quantity) {
    this.title = title;
    this.authors = authors;
    this.genres = genres;
    this.year = year;
    this.quantity = quantity;
    
  }

  // getter and setter to interact with the propertys of the object
  
  public String getTitle() {
    return title;
  }

  public String getAuthors() {
    return authors;
  }

  public String getGenres() {
    return genres;
  }

  public int getYear() {
    return year;
  }

  public int getQuantity() {
    return quantity;
  }

  public int setquantity(int quantity) {
    this.quantity = quantity;
    return quantity;
  }

  // overriding the default toString to be able to print the information of the book
  @Override 
  public String toString() {   
    return "Books:{ " + "title: " + title + ", authors: " + authors + ", genres: " + genres + ", year: " + year + ", quantity: " + quantity + "}";
  }
  
}

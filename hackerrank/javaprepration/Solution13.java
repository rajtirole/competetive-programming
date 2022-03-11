package javaprepration;

import java.util.Scanner;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}
class MyBook extends Book{
    MyBook(String title, String author) {
        super(title, author);
        //TODO Auto-generated constructor stub
    }
    private int price;
    void MyBook(String title,String author,int price){
        this.price=price;
        super.title=title;
        super.author=author;
       
    }
    @Override
    void display() {
        // TODO Auto-generated method stub
        display();{
            System.out.println("Title: "+title);
            System.out.println("Author "+author);
            System.out.println("Price "+price);
        }
        
    }

    
}

// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
    
    /**   
    *   Class Constructor
    *   
    // *   @param title The book's title.
    // *   @param author The book's author.
    // *   @param price The book's price.
    **/
    // Write your constructor here
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    
// End class

public class Solution13 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author);
        book.display();
    }
}

package LABS;

import java.util.ArrayList;


class Book {
     int id;
     String name;
     String author;

    Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;

    }
}
public class Demo {
    public static void main(String[] args) {
        ArrayList<Book> books =new ArrayList<Book>();

        Book b1 =new Book(101, "Intelligent ", "Benjamin");
        books.add(b1);


        for (Book i : books) {
            System.out.println("Id: "+i.id+" Name: "+i.name+" Author: "+i.author);
        }
    }


}

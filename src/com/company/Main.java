package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Inheritance - mostenirea
    //polimorfism
    //interface
    //abstract class
    //incapsularea


    public static void main(String[] args) {
        Book b1 = new Book(1,147,"Baltagul");
        Magazine m1 = new Magazine(1,213,"PlayBoy");
        b1.print();
        m1.print();
        m1.buyproduct();
    }
}

class Book {
    int id;
    double price;
    String name;

    public Book(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public void print() {
        System.out.println("You bought book with" + " id:" + this.id
                + " Price:" + this.price + " Name:" + this.name);
    }
}

class Magazine extends Book implements Bookshopservice {

    public Magazine(int id, double price, String name) {
        super(id, price, name);
    }

    @Override
    public void print() {
        System.out.println("You bought magazine with" + " id:" + this.id
                + " Price:" + this.price + " Name:" + this.name);
    }

    @Override
    public void buyproduct() {
        float pricewithtva= (float) ((tva*price)/100+price);
        System.out.println("Price with TVA:"+pricewithtva);
    }

}
interface Bookshopservice{
     void buyproduct();
int tva=10;
}
abstract class Productrepository {
    List<Book> getAllBooks() {
        List<Book>allBooks = new ArrayList();
        allBooks.add(new Book(1, 155, "jabdefa"));
        allBooks.add(new Book(2, 255, "fhavor"));
        allBooks.add(new Book(3, 355, "baddyef"));
        allBooks.add(new Book(4, 455, "dbaveai"));
        return allBooks;

    }
}

class bookShop extends Productrepository implements Bookshopservice {



    @Override
    public void buyproduct() {

    }
}


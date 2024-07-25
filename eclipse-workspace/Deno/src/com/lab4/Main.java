package com.lab4;

import java.util.Scanner;

class Item {
    private String title;
    private String publisher;
    int publicationYear;

    public Item(String title, String publisher, int publicationYear) {
        this.title = title;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("The Title of the Book: " + title);
        System.out.println("The Publisher of the Book: " + publisher);
        System.out.println("The Publication year of the Book: " + publicationYear);
    }
}

class Book extends Item {
    private String author;
    private int numberOfPages;

    public Book(String title, String publisher, int publicationYear, String author, int numberOfPages) {
        super(title, publisher, publicationYear);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The Author of the Book: " + author);
        System.out.println("The Number of Pages of the Book: " + numberOfPages);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.println("Enter Book Publisher Name: ");
        String publisher = sc.nextLine();

        System.out.println("Enter Book Publish Year: ");
        int publicationYear = sc.nextInt();
        sc.nextLine();  

        System.out.println("Enter Book Author Name: ");
        String author = sc.nextLine();

        System.out.println("Enter Number of Pages of the Book: ");
        int numberOfPages = sc.nextInt();
        sc.close();

        Book b = new Book(title, publisher, publicationYear, author, numberOfPages);
        b.displayInfo();
    }
}

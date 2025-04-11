package practice.collections.map.hashMap;

import java.util.*;
// Library Book Management System 📚
//You’re building a library book management system, where:
//Each book has:
//A unique ID (Integer).
//A title (String).
//A genre (String).
//You need to.
//Store all books with their ID as the key.
//Group books by genre → for quick retrieval of all books in a specific genre.
//Retrieve individual books by their ID quickly.
//Fast lookups by ID and efficient grouping by genre are required.
class Book {
    int id;
    String title;
    String genre;

    Book(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Genre: " + genre;
    }
}

public class TwoHashmap {
    public static void main(String[] args) {
        // Book ID → Book object
        Map<Integer, Book> booksById = new HashMap<>();

        // Genre → List of books
        Map<String, List<Book>> booksByGenre = new HashMap<>();

        // Add books
        addBook(booksById, booksByGenre, new Book(1, "The Hobbit", "Fantasy"));
        addBook(booksById, booksByGenre, new Book(2, "1984", "Dystopian"));
        addBook(booksById, booksByGenre, new Book(3, "Harry Potter", "Fantasy"));
        addBook(booksById, booksByGenre, new Book(4, "Brave New World", "Dystopian"));
        addBook(booksById, booksByGenre, new Book(5, "The Great Gatsby", "Classic"));

        // Lookup by ID
        System.out.println("\n📚 Book with ID 3:");
        System.out.println(booksById.get(3));

        // Retrieve books by genre
        System.out.println("\n📚 Books in Fantasy genre:");
        booksByGenre.get("Fantasy").forEach(System.out::println);

        // Retrieve all books
        System.out.println("\n📚 All Books:");
        booksById.values().forEach(System.out::println);
    }

    static void addBook(Map<Integer, Book> booksById, Map<String, List<Book>> booksByGenre, Book book) {
        // Add to ID-based map
        booksById.put(book.id, book);

        // Add to genre-based map
        booksByGenre.computeIfAbsent(book.genre, k -> new ArrayList<>()).add(book);
    }
}


package org.example;

import org.example.model.Book;
import org.example.model.User;
import org.example.service.LibraryService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();

        // Ajouter des livres
        library.addBook(new Book(1, "1984", "George Orwell", "Dystopian"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee", "Fiction"));

        // Ajouter des utilisateurs
        User user1 = new User(1, "Salma", "salma@example.com");
        library.addUser(user1);

        // Lister les livres
        System.out.println("Liste des livres :");
        library.listBooks();

        // Emprunter un livre
        library.borrowBook(user1, new Book(1, "1984", "George Orwell", "Dystopian"));

        // Afficher les emprunts
        System.out.println("Liste des emprunts :");
        library.listBorrowings();

    }
}

/*
4. Classe Main : Point d’entrée
Que fait cette classe ?
Crée un service LibraryService.
Ajoute des livres et des utilisateurs.
Effectue des emprunts.
Affiche les listes.

 */

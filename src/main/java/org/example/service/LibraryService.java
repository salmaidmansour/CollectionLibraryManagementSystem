package org.example.service;




import org.example.model.Book;
import org.example.model.User;

import java.util.*;

public class LibraryService {
    private List<Book> books = new ArrayList<>();
    private Set<User> users = new HashSet<>();
    private Map<User, List<Book>> borrowings = new HashMap<>();

    // Ajouter un livre
    public void addBook(Book book) {
        books.add(book);
    }

    // Supprimer un livre
    public void removeBook(int bookId) {
        books.removeIf(book -> book.getId() == bookId);
    }

    // Lister les livres
    public void listBooks() {
        Collections.sort(books); // Tri par titre
        books.forEach(System.out::println);
    }

    // Ajouter un utilisateur
    public void addUser(User user) {
        users.add(user);
    }

    // Rechercher un utilisateur
    public User findUserById(int userId) {
        return users.stream()
                .filter(user -> user.getId() == userId)
                .findFirst()
                .orElse(null);
    }

    // Emprunter un livre
    public void borrowBook(User user, Book book) {
        borrowings.computeIfAbsent(user, k -> new ArrayList<>()).add(book);
    }

    // Afficher les emprunts
    public void listBorrowings() {
        borrowings.forEach((user, borrowedBooks) -> {
            System.out.println(user.getName() + " a emprunté : " + borrowedBooks);
        });
    }
}
/*
Quand utiliser for ou forEach ?
For : Plus "manuel", utile quand tu veux un contrôle précis (index ou modification).
ForEach : Plus lisible, idéal pour lire ou afficher.




Un Stream est un outil pour manipuler des données (par exemple, une liste) sans écrire beaucoup de code
 les Streams en Java ne modifient pas directement les collections existantes, mais créent de nouvelles données transformées

 Stream : utilisé pour manipuler les données sans modifier leur source.
Cela préserve la collection initiale tout en produisant une nouvelle version transformée (ex. : filtrée, triée, ou transformée).
Avantages : évite les effets de bord, rend le code plus lisible, favorise la réutilisation des données d'origine.

this fait référence à l'objet courant.


 */
package org.example.model;


public class Book implements Comparable<Book> {
    private int id;
    private String title;
    private String author;
    private String genre;

    public Book(int id, String title, String author, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}

/*
1- Cette classe représente un livre dans la bibliothèque. Elle contient des informations sur le livre et des méthodes pour travailler avec ces informations.

2- Les packages servent à organiser les fichiers dans un projet.

3- implements Comparable<Book> : Cela signifie que la classe Book peut être comparée à d’autres objets de type Book.  Cela est utile pour trier des livres.
4-Ces attributs représentent les informations d'un livre :

--Pourquoi private ?

Pour appliquer le principe d'encapsulation, c'est-à-dire que ces informations ne sont accessibles que via des méthodes spécifiques (getters et setters).

5- Pourquoi un constructeur ?
Pour créer un livre avec des valeurs spécifiques dès sa création.
6-
Les getters permettent de récupérer les valeurs des attributs (lecture seule).
Pourquoi pas de setters ?
Parce qu'une fois qu'un livre est créé, ses informations (comme son titre ou auteur) ne changent généralement pas. Cela rend les objets immuables.


7-Méthode compareTo
Cette méthode compare les livres par titre pour les trier.

Cette méthode est appelée lorsqu’on veut afficher un livre (par exemple dans un System.out.println).

 */
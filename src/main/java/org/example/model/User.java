package org.example.model;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
/*
Résumé : hashCode en Java
Définition :

La méthode hashCode() génère un numéro entier (appelé code de hachage) pour représenter un objet.
Ce numéro aide à organiser et rechercher rapidement des objets dans des structures comme HashMap, HashSet, ou Hashtable.
Rôle principal :

Le hashCode indique dans quel "bucket" (case) un objet est stocké dans ces structures.
Cela permet d’optimiser les recherches et le stockage en réduisant le temps de parcours.
Différence avec un ID :

ID : Propriété métier définie par le développeur pour identifier un objet (exemple : numéro d’étudiant, numéro de commande).
hashCode : Outil technique calculé automatiquement ou redéfini pour faciliter le stockage et la recherche dans des collections basées sur le hachage.
Fonctionnement dans une collection :

Lorsqu’un objet est ajouté, son hashCode est utilisé pour déterminer son emplacement (bucket).
Lorsqu’un objet est recherché, le hashCode indique où chercher, puis equals() confirme qu’il s’agit du bon objet.
Méthode par défaut :

La méthode hashCode() par défaut (dans la classe Object) génère un code basé sur l’adresse mémoire de l’objet.
Pour des classes personnalisées, on peut redéfinir hashCode() pour qu’il soit basé sur les propriétés de l’objet.
Bonnes pratiques :

Toujours redéfinir hashCode() si on redéfinit equals(), car ces deux méthodes sont liées :
Si deux objets sont égaux selon equals(), leurs hashCode doivent être identiques.

 */
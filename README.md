
# Ski Shop

Ce projet consiste à développer un petit site de commerce électronique pour une entreprise spécialisée dans les articles de ski. Il permettra aux utilisateurs de consulter, modifier et supprimer des produits et de les ajouter à un panier.

L'administrateur pourra donc :

- Voir la liste des produits
- Ajouter des produits dans le panier 
- Ajouter, modifier et supprimer des produits dans la BDD
- Voir les produits ajouter dans le panier
- Valider le panier

# Critères de performance 

Un Readme qui explique le contexte du projet et une explication: 


***Technologies utilisées*** 

Collaboration sur le projet :

- FIGMA
- NOTION
- TRELLO 
- GIT 

Front-End :

- React/SASS

Back-End :

- Java/Spring Boot

Base de Données : 

- PostgreSQL 

#  Architecture N-tiers et Utilisation du Pattern MVC 

***1.Présentation***
* Rôle : Cette couche représente l'interface utilisateur avec laquelle les utilisateurs interagissent. Elle est responsable de la présentation des données et de la réception des actions de l'utilisateur.
* Technologies : React pour le front-end.


***2.Logique Métier (Contrôleurs)***

- Rôle : Cette couche contient la logique métier de l'application. Elle traite les requêtes de l'utilisateur, effectue les opérations nécessaires sur les données, et renvoie les résultats à la couche de présentation.
- Pattern MVC : Les contrôleurs servent de médiateurs entre la couche de présentation et la couche d'accès aux données, en appliquant le pattern MVC (Modèle-Vue-Contrôleur).
- Technologies : Java avec un autre framework Spring Boot pour le back-end.


***3.Accès aux Données (Modèles)***
- Rôle : Cette couche est responsable de l'accès aux données, qu'il s'agisse de lire, d'écrire, de modifier ou de supprimer des données dans la base de données.
- Pattern MVC : Les modèles représentent la structure des données et la logique pour les manipuler. Ils interagissent avec la base de données via un ORM (Object-Relational Mapping) pour fournir un moyen de communication entre la logique métier et la base de données.
- Technologies : ORM (JPA ORM pour Java) pour la gestion des données.


***4.Base de Données***
- Rôle : Cette couche stocke de manière persistante les données de l'application.
- Technologies : PostgreSQL.

***Explication du Rôle de Chaque Couche***

Présentation : Cette couche présente l'interface utilisateur où les clients peuvent naviguer à travers les produits, ajouter des articles à leur panier. Elle interagit avec les contrôleurs pour récupérer et afficher les données pertinentes.

Logique Métier (Contrôleurs) : Les contrôleurs traitent les requêtes HTTP provenant de la couche de présentation. Ils appliquent les règles métier nécessaires pour manipuler les données, telles que l'ajout de produits au panier, la validation du contenu du panier, etc. Ils communiquent avec la couche d'accès aux données pour récupérer ou modifier les informations nécessaires.

Accès aux Données (Modèles) : Les modèles représentent les entités métier de l'application, telles que les produits. Ils fournissent des méthodes pour accéder et manipuler les données associées à ces entités. Les modèles interagissent avec la base de données via un ORM pour assurer la persistance des données et faciliter les opérations CRUD (Create, Read, Update, Delete).

Base de Données : Cette couche stocke les données de manière persistante. Elle est responsable de stocker les informations sur les produits, les commandes  nécessaires au fonctionnement de l'application. La base de données est consultée et mise à jour par la couche d'accès aux données selon les besoins de l'application.

En suivant cette architecture n-tiers et en appliquant le pattern MVC, le projet assure une séparation claire des responsabilités, ce qui facilite la maintenance, l'évolutivité et la testabilité de l'application.


# Structure du projet 

Le projet est divisé en deux parties principales : le front-end et le back-end

***Front-End*** : 

- Le dossier frontend contient le code Angular (ou React) pour l'interface utilisateur.
- Pour lancer le front-end, suivez les instructions spécifiques dans le dossier frontend.
***Back-End*** : 

- Le dossier backend contient le code Symfony (ou PHP avec un autre framework) pour la logique métier et l'interaction avec la base de données.
- Pour lancer le back-end, suivez les instructions spécifiques dans le dossier backend.


# Livrés 

* un schéma de l'architecture n-tiers
* les sources de l'application back-end
* les sources de l'application front-end


## Authors

- [@YoanBor](https://www.github.com/octokatherine)
- [@Jihanefaid](https://www.github.com/octokatherine)










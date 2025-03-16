# Projet d'Injection de Dépendances

Ce projet démontre différentes approches d'injection de dépendances en Java, de l'implémentation manuelle à l'utilisation du Framework Spring.

## Structure du Projet

Le projet est organisé en plusieurs packages:
- `net.example.dao`: Contient l'interface DAO et ses implémentations
- `net.example.metier`: Contient l'interface métier et son implémentation
- `net.example.ext`: Contient les implémentations d'extension
- `net.example.pres`: Contient différentes classes de présentation démontrant diverses approches d'injection de dépendances

## Détails d'Implémentation

### 1. Interfaces et Implémentations de Base

#### Interface IDao
Définit le contrat d'accès aux données avec une méthode `getData()`.

#### Interface IMetier
Définit le contrat de la logique métier avec une méthode `calcul()`.

### 2. Approches d'Injection de Dépendances

#### a. Instanciation Statique (Pres1.java)
Création directe des dépendances dans le code avec un câblage explicite.

#### b. Instanciation Dynamique (Pres2.java)
Utilise la réflexion pour créer des objets basés sur des noms de classes lus à partir d'un fichier de configuration.

#### c. Framework Spring

##### Configuration XML (PresSpringXML.java)
Utilise la configuration XML de Spring pour définir les beans et leurs dépendances.

##### Configuration basée sur les Annotations (PresSpringAnnotation.java)
Utilise le scan de composants et les annotations de Spring pour un câblage automatique.

## Fichiers de Configuration

### config.txt
Contient les noms de classes complets pour l'instanciation dynamique.

### config.xml
Fichier de configuration XML Spring pour les définitions de beans et de dépendances.

## Concepts Clés Démontrés

1. **Couplage Faible**: À travers les interfaces (IDao et IMetier)
2. **Injection de Dépendances**:
   - Injection par constructeur
   - Injection par setter
   - Configuration XML
   - Configuration basée sur les annotations
3. **Inversion de Contrôle**: Utilisation du conteneur IoC de Spring
4. **API de Réflexion**: Pour la création dynamique d'objets

## Comment Exécuter

Chaque classe de présentation possède une méthode `main` qui peut être exécutée pour démontrer l'approche d'injection de dépendances correspondante:

1. `Pres1`: Instanciation statique
2. `Pres2`: Instanciation dynamique (nécessite config.txt)
3. `PresSpringXML`: DI basée sur XML Spring (nécessite config.xml)
4. `PresSpringAnnotation`: DI basée sur les annotations Spring


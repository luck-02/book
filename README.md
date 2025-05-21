# Projet Java - Gestion de Bibliothèque (sans Maven)

## Description
Application console Java simple pour gérer une bibliothèque de livres : ajout, suppression, recherche, affichage.

## Structure
- `src/` : contient les classes principales `Book`, `Library`, `LibraryApp`
- `test/` : contient les classes de test `LibraryTest` et `LibraryFunctionalTest`
- `bin/` : dossier généré contenant les `.class` après compilation

## 📦 Prérequis
- Java 11+
- [JUnit Console Standalone](https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.7.0/junit-platform-console-standalone-1.7.0.jar)

Téléchargez le `.jar` dans le dossier du projet.

---

## 🛠️ Compilation

### Compiler tous les fichiers (src + test)
```bash
javac -cp junit-platform-console-standalone-1.7.0.jar -d bin src/*.java test/*.java
```

---

## 🧪 Exécution des tests JUnit
```bash
java -jar junit-platform-console-standalone-1.7.0.jar --class-path bin --scan-class-path
```

---

## 🚀 Lancer l'application console
```bash
javac -d bin src/*.java
java -cp bin LibraryApp
```

---

## 🧼 Nettoyage
Supprimer les fichiers `.class` :
```bash
rm -r bin/*
```

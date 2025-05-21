import java.util.Scanner;

public class LibraryApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Library library = new Library();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Menu Bibliothèque =====");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Supprimer un livre");
            System.out.println("3. Rechercher un livre");
            System.out.println("4. Afficher tous les livres");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addBook();
                    break;
                case "2":
                    removeBook();
                    break;
                case "3":
                    searchBook();
                    break;
                case "4":
                    displayBooks();
                    break;
                case "0":
                    System.out.println("Fermeture de l'application...");
                    return;
                default:
                    System.out.println("Choix invalide. Réessayez.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Titre : ");
        String title = scanner.nextLine();
        System.out.print("Auteur : ");
        String author = scanner.nextLine();
        System.out.print("Année de publication : ");
        int year = Integer.parseInt(scanner.nextLine());

        library.addBook(new Book(title, author, year));
        System.out.println("Livre ajouté !");
    }

    private static void removeBook() {
        System.out.print("Titre du livre à supprimer : ");
        String title = scanner.nextLine();
        if (library.removeBook(title)) {
            System.out.println("Livre supprimé.");
        } else {
            System.out.println("Livre non trouvé.");
        }
    }

    private static void searchBook() {
        System.out.print("Titre du livre à rechercher : ");
        String title = scanner.nextLine();
        Book found = library.findBook(title);
        if (found != null) {
            System.out.println("Livre trouvé : " + found);
        } else {
            System.out.println("Aucun livre trouvé.");
        }
    }

    private static void displayBooks() {
        System.out.println("Liste des livres :");
        for (Book book : library.getAllBooks()) {
            System.out.println("- " + book);
        }
    }
}

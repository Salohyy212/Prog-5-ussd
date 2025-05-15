import java.util.Scanner;

public class MenuManager {
    private String currentMenuId = "mainMenu";
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            Menu menu = MenuData.getMenuById(currentMenuId);

            if (menu == null) {
                System.out.println("Menu introuvable.");
                break;
            }

            menu.display();

            String userInput = scanner.nextLine().trim();

            boolean found = false;
            for (MenuOption option : menu.getOptions()) {
                if (option.getKey().equals(userInput)) {
                    if (option.getTargetMenuId() != null) {
                        currentMenuId = option.getTargetMenuId();
                    } else {
                        System.out.println("\n[Info] Option sélectionnée : " + option.getLabel());
                        System.out.println("[Retour au menu précédent...]\n");
                    }
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }
}



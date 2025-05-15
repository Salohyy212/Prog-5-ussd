
import java.util.*;

public class MenuData {

    private static final Map<String, Menu> menus = new HashMap<>();

    static {
        // Menu principal
        menus.put("mainMenu", new Menu(
                "mainMenu",
                "Infos de l'opérateur\nYAS et Mvola",
                Arrays.asList(
                        new MenuOption("1", "Mvola", "mvolaMenuPage1"),
                        new MenuOption("2", "Rappelle moi", null),
                        new MenuOption("3", "SOS crédit", null),
                        new MenuOption("4", "Services YAS", null),
                        new MenuOption("5", "Promotion", null),
                        new MenuOption("6", "Produits et Divertissement", null)
                )
        ));

        // MVOLA - page 1
        menus.put("mvolaMenuPage1", new Menu(
                "mvolaMenuPage1",
                "MVOLA",
                Arrays.asList(
                        new MenuOption("1", "Acheter Credit ou Offre YAS", null),
                        new MenuOption("2", "Transférer argent (vers toute destination)", null),
                        new MenuOption("3", "Mvola Crédit ou Épargne", null),
                        new MenuOption("4", "Retrait d'argent", null),
                        new MenuOption("#", "Page suivante", "mvolaMenuPage2"),
                        new MenuOption("**", "Menu principal", "mainMenu")
                )
        ));

        // MVOLA - page 2
        menus.put("mvolaMenuPage2", new Menu(
                "mvolaMenuPage2",
                "MVOLA (suite)",
                Arrays.asList(
                        new MenuOption("5", "Paiement Factures & Partenaires", null),
                        new MenuOption("6", "Mon compte", null),
                        new MenuOption("7", "Recevoir de l'argent", null),
                        new MenuOption("8", "Banques et Micro-Finances", null),
                        new MenuOption("*", "Page précédente", "mvolaMenuPage1"),
                        new MenuOption("**", "Menu principal", "mainMenu")
                )
        ));
    }

    public static Menu getMenuById(String id) {
        return menus.get(id);
    }
}



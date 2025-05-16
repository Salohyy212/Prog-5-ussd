import java.util.*;

public class MenuData {

    private static final Map<String, Menu> menus = new HashMap<>();

    static {
        menus.put("mainMenu", new Menu(
                "mainMenu",
                "Infos de l'opérateur\nYAS et Mvola",
                Arrays.asList(
                        new MenuOption("1", "Mvola", "mvolaMenuPage1"),
                        new MenuOption("2", "Rappelle moi", "rappelleMoiMenu"),
                        new MenuOption("3", "SOS crédit", "sosCreditMenu"),
                        new MenuOption("4", "Services YAS", "servicesYasMenuPage1"),
                        new MenuOption("5", "Promotion", null),
                        new MenuOption("6", "Produits et Divertissement", null)
                )
        ));

        menus.put("mvolaMenuPage1", new Menu(
                "mvolaMenuPage1",
                "MVOLA",
                Arrays.asList(
                        new MenuOption("1", "Acheter Credit ou Offre YAS", "achatCreditMenu"),
                        new MenuOption("2", "Transférer argent (vers toute destination)", "transfertArgentMenu"),
                        new MenuOption("3", "Mvola Crédit ou Épargne", "creditEpargneMenu"),
                        new MenuOption("4", "Retrait d'argent", "retraitArgentMenu"),
                        new MenuOption("#", "Page suivante", "mvolaMenuPage2"),
                        new MenuOption("**", "Menu principal", "mainMenu")
                )
        ));

        menus.put("achatCreditMenu", new Menu(
                "achatCreditMenu",
                "Acheter Credit ou Offre YAS",
                Arrays.asList(
                        new MenuOption("1", "Credit pour mon numero", null),
                        new MenuOption("2", "Credit pour autre numero", null),
                        new MenuOption("4", "Offre pour mon compte", null),
                        new MenuOption("5", "Offre pour autre compte", null),
                        new MenuOption("**", "Menu principal", "mainMenu")
                )
        ));

        menus.put("transfertArgentMenu", new Menu(
                "transfertArgentMenu",
                "Transférer argent",
                Arrays.asList(
                        new MenuOption("0", "Sans numero", null),
                        new MenuOption("5", "Mvola Epargne", null),
                        new MenuOption("6", "Rembourser une Avance", null),
                        new MenuOption("9", "Repertoire Mvola", null),
                        new MenuOption("**", "Menu principal", "mainMenu")
                )
        ));

        menus.put("creditEpargneMenu", new Menu(
                "creditEpargneMenu",
                "Mvola Crédit ou Épargne",
                Arrays.asList(
                        new MenuOption("1", "Mvola Epargne", null),
                        new MenuOption("2", "Mvola Credit", null),
                        new MenuOption("**", "Menu principal", "mainMenu")
                )
        ));

        menus.put("retraitArgentMenu", new Menu(
                "retraitArgentMenu",
                "Retrait d'argent",
                Arrays.asList(
                        new MenuOption("1", "Aupres d'un Agent Mvola", null),
                        new MenuOption("2", "Aupres d'un DAB SGM", null),
                        new MenuOption("**", "Menu principal", "mainMenu")
                )
        ));

        menus.put("rappelleMoiMenu", new Menu(
                "rappelleMoiMenu",
                "Rappelle moi",
                Arrays.asList(
                        new MenuOption("1", "Mvola", "mvolaMenuPage1"),
                        new MenuOption("2", "Mvola à un autre numéro", null),
                        new MenuOption("3", "Mvola Epargne", null),
                        new MenuOption("4", "Rembourser Avance", null),
                        new MenuOption("**", "Menu principal", "mainMenu")
                )
        ));

        menus.put("sosCreditMenu", new Menu(
                "sosCreditMenu",
                "SOS Crédit",
                Arrays.asList(
                        new MenuOption("1", "SOS credit à un ami", null),
                        new MenuOption("2", "SOS credit à YAS", null),
                        new MenuOption("3", "SOS offre à YAS", null),
                        new MenuOption("4", "Rembourser SOS", null),
                        new MenuOption("5", "Aide", null),
                        new MenuOption("**", "Menu principal", "mainMenu")
                )
        ));

        menus.put("servicesYasMenuPage1", new Menu(
                "servicesYasMenuPage1",
                "Services YAS",
                Arrays.asList(
                        new MenuOption("1", "Info crédit", null),
                        new MenuOption("2", "Recharge", null),
                        new MenuOption("3", "Gérer Friends and Family", null),
                        new MenuOption("4", "Envoyer crédit / Offre / Mega", null),
                        new MenuOption("5", "Ajouter des jours de validité", null),
                        new MenuOption("6", "Acheter une offre", null),
                        new MenuOption("7", "Mon numéro", null),
                        new MenuOption("0", "Page suivante", "servicesYasMenuPage2"),
                        new MenuOption("**", "Menu principal", "mainMenu")
                )
        ));

        menus.put("servicesYasMenuPage2", new Menu(
                "servicesYasMenuPage2",
                "Services YAS (suite)",
                Arrays.asList(
                        new MenuOption("8", "Changement de langue", null),
                        new MenuOption("9", "Récupérer mon numéro", null),
                        new MenuOption("00", "Page précédente", "servicesYasMenuPage1"),
                        new MenuOption("**", "Menu principal", "mainMenu")
                )
        ));


    }

    public static Menu getMenuById(String id) {
        return menus.get(id);
    }
}

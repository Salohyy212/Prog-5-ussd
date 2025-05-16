import java.util.List;

public class Menu {
    private final String id;
    private final String title;
    private final List<MenuOption> options;

    public Menu(String id, String title, List<MenuOption> options) {
        this.id = id;
        this.title = title;
        this.options = options;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<MenuOption> getOptions() {
        return options;
    }

    public void display() {
        System.out.println("\n" + title);
        for (MenuOption option : options) {
            System.out.println(option.getKey() + ". " + option.getLabel());
        }
        System.out.print("\nEntrez votre choix : ");
    }
}

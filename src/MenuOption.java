public class MenuOption {
    private final String key;
    private final String label;
    private final String targetMenuId;
    public MenuOption(String key, String label, String targetMenuId) {
        this.key = key;
        this.label = label;
        this.targetMenuId = targetMenuId;
    }

    public String getKey() {
        return key;
    }

    public String getLabel() {
        return label;
    }

    public String getTargetMenuId() {
        return targetMenuId;
    }
}




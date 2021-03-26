package stringbuilder;

public enum Title {
    Mr("Mr."), MS("Ms."), DR("Dr."), PROF("Prof.");

    private String titleString;

    Title(String titleString) {
        this.titleString = titleString;
    }

    public String getTitleString() {
        return titleString;
    }
}

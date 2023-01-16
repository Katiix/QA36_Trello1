package model;

public class Board {
    private String title;

    public String getTitle() {
        return title;
    }

    public Board withTitle(String title) {
        this.title = title;
        return this;
    }
}
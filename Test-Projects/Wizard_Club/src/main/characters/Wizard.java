package main.characters;

public class Wizard extends Character{
    private String favoriteColor;
    private String moral;

    public Wizard(String name, int age, int level, String favoriteColor, String moral) {
        super(name, age, level);
        this.favoriteColor = favoriteColor;
        this.moral = moral;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getMoral() {
        return moral;
    }

    public void setMoral(String moral) {
        this.moral = moral;
    }
}

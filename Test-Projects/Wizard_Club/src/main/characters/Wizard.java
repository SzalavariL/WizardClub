package main.characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wizard extends Character{
    private String favoriteColor;
    private String moral;
    private boolean isSingle;
    private Map<Wizard, String> contactList;
    private int numberOfProtectionCharm;


    public Wizard(String name, int age, int level, String favoriteColor, String moral) {
        super(name, age, level);
        this.favoriteColor = favoriteColor;
        this.moral = moral;
        this.isSingle = true;
        this.contactList = new HashMap<>();
        this.numberOfProtectionCharm = 0;
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

    public boolean isSingle() {
        return isSingle;
    }

    public void setSingle(boolean single) {
        isSingle = single;
    }

    public Map<Wizard, String> getContactList() {
        return contactList;
    }

    public void setContactList(Map<Wizard, String> contactList) {
        this.contactList = contactList;
    }

    public int getNumberOfProtectionCharm() {
        return numberOfProtectionCharm;
    }

    public void setNumberOfProtectionCharm(int numberOfProtectionCharm) {
        this.numberOfProtectionCharm = numberOfProtectionCharm;
    }
}

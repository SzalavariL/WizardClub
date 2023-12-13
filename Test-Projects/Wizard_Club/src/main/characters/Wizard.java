package main.characters;

import java.util.HashMap;
import java.util.Map;

public class Wizard extends Character{
    private String favoriteColor;
    private String moral;
    private boolean isSingle;
    private boolean hasFriend;
    private boolean hasNemesis;
    private Map<String, Wizard> contactList;
    private int numberOfProtectionCharm;


    public Wizard(String name, int age, int level, String favoriteColor, String moral) {
        super(name, age, level);
        this.favoriteColor = favoriteColor;
        this.moral = moral;
        this.isSingle = true;
        this.hasFriend = false;
        this.hasNemesis = false;
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

    public boolean hasFriend() {
        return hasFriend;
    }

    public void setHasFriend(boolean hasFriend) {
        this.hasFriend = hasFriend;
    }

    public boolean hasNemesis() {
        return hasNemesis;
    }

    public void setHasNemesis(boolean hasNemesis) {
        this.hasNemesis = hasNemesis;
    }

    public Map<String, Wizard> getContactList() {
        return contactList;
    }

    public void setContactList(String statusOfPartner, Wizard wizard) {
        this.contactList.put(statusOfPartner, wizard);
    }

    public int getNumberOfProtectionCharm() {
        return numberOfProtectionCharm;
    }

    public void setNumberOfProtectionCharm(int numberOfProtectionCharm) {
        this.numberOfProtectionCharm = numberOfProtectionCharm;
    }
}

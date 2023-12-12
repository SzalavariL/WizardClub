package main.wizardclub;

import main.characters.Wizard;
import main.userinteface.UserInterface;

import java.util.*;

public class WizardClub {
    private List<Wizard> wizardList;
    Map<Wizard, Wizard> partyPair;
    private UserInterface ui;
    private boolean isOpen;

    public WizardClub(UserInterface ui) {
        this.ui = ui;
        wizardList = new ArrayList<>();
        partyPair = new HashMap<>();
        isOpen = true;
    }

    public void party() {
        while (isOpen) {
            nightCharm(ui.spell());
        }
    }

    protected void nightCharm(String spell) {
        String[] spellSplits = spellSplitter(spell);
        switch (spellSplits[0]) {

            case "invite":
                inviteWizard(spellSplits);
                break;

            case "open":
                partyTime();
                break;

            case "status":
                break;

            case "quit":
                closeTheClub();
                break;

            default:
                System.out.println(ui.invalidCommand());
        }
    }

    protected void partyTime() {
        makePair();
        goCrazy();
    }

    protected void goCrazy() {

    }

    protected void makePair() {
        Collections.shuffle(wizardList);
        if(!wizardList.isEmpty()) {
            int partyNumber = wizardList.size() - wizardList.size() % 2;
            for (int i = 0; i < partyNumber; i+=2) {
                partyPair.put(wizardList.get(i), wizardList.get(i+1));
            }
        }
    }

    protected void closeTheClub() {
        System.out.println("Thank you for your visit in the Wizard Club.");
        System.out.println("See you next time!");
        setOpen(false);
    }

    protected void inviteWizard(String[] spellSplits) {
        String name = spellSplits[2].substring(0, 1).toUpperCase() + spellSplits[2].substring(1);
        int age = Integer.parseInt(spellSplits[3]);
        int level = Integer.parseInt(spellSplits[4]);
        String favoriteColor = spellSplits[5];
        String moral = spellSplits[6];

        Wizard wizard = new Wizard(name, age, level, favoriteColor, moral);
        wizardList.add(wizard);
    }

    protected String[] spellSplitter(String spell) {
        String clearSpell = spell.replace(" -", "").toLowerCase();
        return clearSpell.split(" ");
    }

    public List<Wizard> getWizardList() {
        return wizardList;
    }

    public void setWizardList(Wizard wizard) {
        this.wizardList.add(wizard);
    }

    public Map<Wizard, Wizard> getPartyPair() {
        return partyPair;
    }

    public void setPartyPair(Map<Wizard, Wizard> partyPair) {
        this.partyPair = partyPair;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}

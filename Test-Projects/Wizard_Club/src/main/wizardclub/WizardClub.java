package main.wizardclub;

import main.characters.Wizard;
import main.userinteface.UserInterface;

import java.util.ArrayList;
import java.util.List;

public class WizardClub {
    private List<Wizard> wizardList;
    private UserInterface ui;
    private boolean isOpen;

    public WizardClub(UserInterface ui) {
        this.ui = ui;
        wizardList = new ArrayList<>();
        isOpen = true;
    }

    public void party() {
        while (isOpen) {
            nightCharm(ui.spell());
        }
    }

    private void nightCharm(String spell) {
        switch (spell) {

            case "invite wizard":
                break;

            case "open":
                break;

            case "status":
                break;

            case "quit":
                break;

            default:
                ui.invalidCommand();
        }
    }
}

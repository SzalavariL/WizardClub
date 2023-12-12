package main;

import main.userinteface.ConsoleUserInterface;
import main.userinteface.UserInterface;
import main.wizardclub.WizardClub;

public class Main {
    public static void main(String[] args) {
        WizardClub club123 = new WizardClub(new ConsoleUserInterface());
        club123.party();

    }
}

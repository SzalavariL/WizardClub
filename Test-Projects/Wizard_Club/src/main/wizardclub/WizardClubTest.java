package main.wizardclub;

import main.characters.Wizard;
import main.userinteface.ConsoleUserInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardClubTest {

    private WizardClub club;

    @BeforeEach
    void init() {
        club = new WizardClub(new ConsoleUserInterface());
        Wizard filemon = new Wizard("Filemon", 80, 10, "white", "good");
        club.setWizardList(filemon);
    }

    @Test
    void spellSplitter() {
        String testSpell = "invite wizard - Bob 96 14 green good";
        String[] expected = {"invite", "wizard", "bob", "96", "14", "green", "good"};
        assertArrayEquals(expected, club.spellSplitter(testSpell));
    }

    @Test
    void newWizardInTheTown_Two_W_inTheList() {
        assertEquals(1, club.getWizardList().size());

        String[] newWizardData = {"invite", "wizard", "bob", "96", "14", "green", "good"};
        club.inviteWizard(newWizardData);
        assertEquals(2, club.getWizardList().size());
    }

    @Test
    void closeTheClub() {
        String[] newWizardData = {"quit"};
        club.closeTheClub();
        assertFalse(club.isOpen());
    }
}
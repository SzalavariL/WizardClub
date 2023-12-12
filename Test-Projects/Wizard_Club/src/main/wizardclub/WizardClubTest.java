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
        String testSpell = "quit";
        club.nightCharm(testSpell);
        assertFalse(club.isOpen());
    }

    @Test
    void nightCharm_inviteWizard() {
        String testSpell = "invite wizard - Bob 96 14 green good";
        club.nightCharm(testSpell);
        assertEquals(2, club.getWizardList().size());
    }

    @Test
    void invalidCommand() {
        String testSpell = "invitewizard - Bob 96 14 green good";
        club.nightCharm(testSpell);
        assertTrue(club.isOpen());

    }

    @Test
    void makePair_11_Wizards_5_pairs() {
        for (int i = 0; i < 10; i++) {
            Wizard filemon = new Wizard("Filemon", 80, 10, "white", "good");
            club.setWizardList(filemon);
        }
        club.makePair();
        assertEquals(5, club.getPartyPair().size());
    }
}
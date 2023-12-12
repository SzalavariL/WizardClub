package main.userinteface;

import java.util.Scanner;

public class ConsoleUserInterface implements UserInterface{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String spell() {
        return scanner.nextLine();
    }

    @Override
    public void printStatus(String message) {
        System.out.println(message);
    }

    @Override
    public void end() {
        scanner.close();
    }

    @Override
    public String invalidCommand() {
        return "Unknown spell. Please, spell it slower. Thank you!";
    }
}

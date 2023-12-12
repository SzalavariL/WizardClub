package main.userinteface;

public interface UserInterface {
    String spell();

    void printStatus(String message);

    void end();

    String invalidCommand();
}

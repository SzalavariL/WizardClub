package main.userinteface;

public interface UserInterface {
    String getCommand();

    void printStatus(String message);

    void end();

    void invalidCommand();
}

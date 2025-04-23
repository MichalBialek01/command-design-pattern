package pl.bialek.pwr;

public interface Command {
    void execute();
    void undo();
}
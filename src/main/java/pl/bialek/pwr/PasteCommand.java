package pl.bialek.pwr;

public class PasteCommand implements Command {
    private final Document document;

    public PasteCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.paste();
    }

    @Override
    public void undo() {
        document.undoPaste(document.getClipboardLength());
    }
}

package pl.bialek.pwr;

public class CopyCommand implements Command {
    private final Document document;
    private final String textToCopy;

    public CopyCommand(Document document, String textToCopy) {
        this.document = document;
        this.textToCopy = textToCopy;
    }

    @Override
    public void execute() {
        document.copy(textToCopy);
    }

    @Override
    public void undo() {
        System.out.println("Operacja kopiowania nie podlega cofnięciu.");
    }
}
